package com.fullmusic.Controller;

import com.fullmusic.common.ResponseResult;
import com.fullmusic.common.SysParam;
import com.fullmusic.dao.UserMapper;
import com.fullmusic.pojo.User;
import com.fullmusic.pojo.UserExample;
import com.fullmusic.service.FullMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URL;
import java.net.URLDecoder;

/**
 * Created by Administrator on 2019/6/9 0009.
 */
@RestController
@RequestMapping("xcx")
public class FullMusicController {

    @Autowired
    private FullMusicService fullMusicService;

    ResponseResult ResponseResult = new ResponseResult();
    @Value("${sys.uploadPath}")
    String uploadPath;

    /**
     * 测试
     *
     * @return
     */
    @RequestMapping("test")
    public ResponseResult test() {
        return ResponseResult.createMsg(12, "234234324");
    }

    /**
     * websocket test
     *
     * @return
     */
    @RequestMapping("websocketTest")
    public ResponseResult webSocketTest() {
        FullMusicWebSocket.onMessage("mmp");
        return ResponseResult.createMsg(12, "234234324");
    }

    /**
     * 没有注册
     *
     * @return
     */
    @RequestMapping("noLoginIn")
    public ResponseResult noLoginIn() {
        return ResponseResult.createMsg(SysParam.LoginIn.NO.getCode(), SysParam.LoginIn.NO.getMsg());
    }

    /**
     * 注册
     *
     * @param userId
     * @param password
     * @param session
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping("loginIn")
    public ResponseResult loginIn(String userId, String password, HttpSession session, HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (userId == null || password == null) {
            return ResponseResult.createMsg(SysParam.LoginIn.ERROR.getCode(), SysParam.LoginIn.ERROR.getMsg());
        }
        if (password.equals("iLoveYouXYL") || password.equals("XYLloveMe")) {
            User user = fullMusicService.userLoginIn(userId, password);
            if (user != null) {
                session.setAttribute("user", user);
                return ResponseResult.createMsg(SysParam.LoginIn.SUCCESS.getCode(), SysParam.LoginIn.SUCCESS.getMsg());
            } else {
                return ResponseResult.createMsg(SysParam.LoginIn.ERROR.getCode(), SysParam.LoginIn.ERROR.getMsg());
            }
        }
        return ResponseResult.createMsg(SysParam.LoginIn.ERROR.getCode(), SysParam.LoginIn.ERROR.getMsg());
    }

    /**
     * 获取用户openid
     *
     * @param code
     * @return
     * @throws Exception
     */
    @RequestMapping("getOpenId")
    public String getOpenId(String code) throws Exception {
        String AppID = "wx431f23cd6d3cccd7";
        String AppSecret = "748648485b36df8f22f10b891e48e2d3";//这两个都可以从微信公众平台中查找
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid="
                + AppID + "&secret=" + AppSecret + "&js_code="
                + code + "&grant_type=authorization_code";
        URL reqURL = new URL(url);
        HttpsURLConnection openConnection = (HttpsURLConnection) reqURL
                .openConnection();
        openConnection.setConnectTimeout(10000);
        //这里我感觉获取openid的时间比较长，不过也可能是我网络的问题，
        //所以设置的响应时间比较长
        openConnection.connect();
        InputStream in = openConnection.getInputStream();

        StringBuilder builder = new StringBuilder();
        BufferedReader bufreader = new BufferedReader(new InputStreamReader(in));
        for (String temp = bufreader.readLine(); temp != null; temp = bufreader
                .readLine()) {
            builder.append(temp);
        }

        String result = builder.toString();
        in.close();
        openConnection.disconnect();
        return result;
        //result就是包含openid的键值对，返回给小程序前端即可
    }

    /**
     * 登录
     *
     * @param userId
     * @param session
     * @return
     */
    @RequestMapping("login")
    public ResponseResult Login(String userId, String icon, HttpSession session) {
        User user = fullMusicService.getUser(userId);
        if (user != null) {
            session.setAttribute("user", user);
            fullMusicService.saveIcon(userId, icon);
            return ResponseResult.createMsg(SysParam.LoginStatus.YES.getCode(), SysParam.LoginStatus.YES.getMsg());
        } else {
            return ResponseResult.createMsg(SysParam.LoginStatus.NO.getCode(), SysParam.LoginStatus.NO.getMsg());
        }
    }

    /**
     * 文字打卡
     *
     * @param session
     * @param content
     * @return
     */
    public ResponseResult ClockInByWord(HttpSession session, String content) {
        User user = (User) session.getAttribute("user");
        if (fullMusicService.clockInByWord(user.getId(), content) == 1) {
            return ResponseResult.createMsg(SysParam.Clockin.SUCCESS.getCode(), SysParam.Clockin.SUCCESS.getMsg());
        } else {
            return ResponseResult.createMsg(SysParam.Clockin.ERROR.getCode(), SysParam.Clockin.ERROR.getMsg());
        }
    }

    /**
     * 评论
     *
     * @param session
     * @param clockInId
     * @param content
     * @return
     */
    @RequestMapping("comment")
    public ResponseResult comment(HttpSession session, String userId, String clockInId, String content) {
        //User user = (User)session.getAttribute("user");
        System.out.println(content);
        if (fullMusicService.addComment(userId, clockInId, content) == 1) {
            FullMusicWebSocket.onMessage(clockInId);
            return ResponseResult.createMsg(SysParam.Talk.SUCCESS.getCode(), SysParam.Talk.SUCCESS.getMsg());
        } else {
            return ResponseResult.createMsg(SysParam.Talk.ERROR.getCode(), SysParam.Talk.ERROR.getMsg());
        }
    }

    /**
     * 更新评论
     *
     * @param session
     * @param clockInId
     * @return
     */
    @RequestMapping("getComment")
    public ResponseResult getComment(HttpSession session, String clockInId) {

        return fullMusicService.getComment(clockInId);
    }

    /**
     * 获取排行榜数据
     *
     * @return
     */
    @RequestMapping("getRankingList")
    public ResponseResult getRankingList() {
        return fullMusicService.getRankingList();
    }

    /**
     * 获取打卡列表
     *
     * @param userId
     * @return
     */
    @RequestMapping("clockInList")
    public ResponseResult clockList(String userId, String currPage) {
        return fullMusicService.getClockList(userId, currPage);
    }

    /**
     * 打卡
     *
     * @param userId
     * @param content
     * @param file
     * @return
     */
    @PostMapping("clock")
    public ResponseResult clockContext(String userId, String content, @RequestParam(value = "file", required = false) MultipartFile file) {
        System.out.println(content);
        try {
            if (file.isEmpty()) {
                return ResponseResult.createMsg(-1, "文件为空");
            }
            content = URLDecoder.decode(content, "utf-8");
            // 获取文件名
            String fileName = file.getOriginalFilename();
            // 获取文件的后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            // 设置文件存储路径
            String path = uploadPath + fileName;
            File dest = new File(path);
            // 检测是否存在目录
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();// 新建文件夹
            }
            file.transferTo(dest);// 文件写入
            fullMusicService.clockInByVideo(userId, content, fileName);
            return ResponseResult.createMsg(0, "上传成功");
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return ResponseResult.createMsg(-1, "上传失败");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseResult.createMsg(-1, "上传失败");
        }
    }
}

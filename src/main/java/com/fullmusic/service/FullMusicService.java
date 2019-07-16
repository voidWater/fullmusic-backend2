package com.fullmusic.service;

import com.fullmusic.Controller.FullMusicWebSocket;
import com.fullmusic.common.ResponseResult;
import com.fullmusic.common.SysParam;
import com.fullmusic.dao.ClockInMapper;
import com.fullmusic.dao.ExMapper;
import com.fullmusic.dao.TalkMapper;
import com.fullmusic.dao.UserMapper;
import com.fullmusic.pojo.*;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2019/6/15 0015.
 */
@Service
public class FullMusicService {

    ResponseResult ResponseResult = new ResponseResult();

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TalkMapper talkMapper;
    @Autowired
    private ClockInMapper clockInMapper;
    @Autowired
    private ExMapper exMapper;

    /**
     * 注册用户
     *
     * @param userId
     * @return
     */
    public User userLoginIn(String userId, String password) {
        User user = new User();
        user.setId(userId);
        user.setVcName("none");
        if (password.equals("XYLloveMe")) {
            user.setVcType(SysParam.User.TYPE_TEACHER.getCode());
        } else {
            user.setVcType(SysParam.User.TYPE_STUDENT.getCode());
        }
        userMapper.insert(user);
        return userMapper.selectByPrimaryKey(userId);
    }

    /**
     * 获取用户
     *
     * @param userId
     * @return
     */
    public User getUser(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    /**
     * 文字打卡
     *
     * @param userid
     * @param content
     * @return
     */
    public int clockInByWord(String userid, String content) {
        ClockIn ci = new ClockIn();
        ci.setId(UUID.randomUUID().toString());
        ci.setVcContent(content);
        ci.setVcUserId(userid);
        ci.setVcType(SysParam.Clockin.TYPE_WORD.getCode());
        ci.setVcInvalid(0);
        ci.setVcUpdatedate(new Date());
        ci.setVcCreatedate(new Date());
        return clockInMapper.insert(ci);
    }

    /**
     * 视频打卡
     *
     * @param userid
     * @param content
     * @param resourcePath
     * @return
     */
    public int clockInByVideo(String userid, String content, String resourcePath) {
        ClockIn ci = new ClockIn();
        ci.setId(UUID.randomUUID().toString());
        ci.setVcContent(content);
        ci.setVcUserId(userid);
        ci.setVcType(SysParam.Clockin.TYPE_VIDEO.getCode());
        ci.setVcInvalid(0);
        ci.setVcUpdatedate(new Date());
        ci.setVcCreatedate(new Date());
        ci.setVcResourceUrl(resourcePath);
        return clockInMapper.insert(ci);
    }


    /**
     * 更新icon
     *
     * @param userId
     * @param icon
     */
    public void saveIcon(String userId, String icon) {
        User user = userMapper.selectByPrimaryKey(userId);
        user.setVcAddr(icon);
        userMapper.updateByPrimaryKey(user);
    }

    /**
     * 增加评论
     *
     * @param userid
     * @param clockInId
     * @param content
     * @return
     */
    public int addComment(String userid, String clockInId, String content) {
        Talk talk = new Talk();
        talk.setId(UUID.randomUUID().toString());
        talk.setVcUserId(userid);
        talk.setVcClockinId(clockInId);
        talk.setVcContent(content);
        talk.setVcType(SysParam.Talk.TYPE_WORD.getCode());
        talk.setVcInvalid(0);
        talk.setVcCreatedate(new Date());
        talk.setVcUpdatedate(new Date());
        if (talkMapper.insert(talk) == 1) {
            FullMusicWebSocket.onMessage(talk.getId());
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * 更新评论
     *
     * @param clockInId
     * @return
     */
    public ResponseResult getComment(String clockInId) {
        TalkExample talkExample = new TalkExample();
        talkExample.setOrderByClause("vc_createDate asc");
        talkExample.createCriteria().andVcClockinIdEqualTo(clockInId);
        List<Talk> list = talkMapper.selectByExample(talkExample);
        return ResponseResult.createList(0, "success", list.size(), list);
    }

    /**
     * 获取打卡列表
     *
     * @param userId
     * @param currPage
     * @return
     */
    public ResponseResult getClockList(String userId, String currPage) {
        PageHelper.startPage(Integer.valueOf(currPage), 10);
        ClockInExample clockInExample = new ClockInExample();
        ClockInExample.Criteria criteria = clockInExample.createCriteria();
        clockInExample.setOrderByClause("vc_createDate ASC");
        List<ClockIn> list = clockInMapper.selectByExample(clockInExample);
        return ResponseResult.createList(0, "success", list.size(), list);
    }

    /**
     * 获取排行榜
     *
     * @return
     */
    public ResponseResult getRankingList() {
        return ResponseResult.createList(0, "排行榜数据", 0, exMapper.rankingList());
    }
}

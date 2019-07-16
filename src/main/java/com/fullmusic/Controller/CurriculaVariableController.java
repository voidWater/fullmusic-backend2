package com.fullmusic.Controller;

import com.fullmusic.common.ResponseResult;
import com.fullmusic.common.SysParam;
import com.fullmusic.service.XKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xk")
public class CurriculaVariableController {
    ResponseResult ResponseResult = new ResponseResult();

    @Autowired
    private XKService xKService;

    /**
     * 判断用户类型
     * @param id
     * @return
     */
    @RequestMapping("/isType")
    public ResponseResult isType(String id){
        return xKService.isType(id);
    }

    /**
     * 判断是否第一次使用
     * @param id
     * @return
     */
    @RequestMapping("/isFirst")
    public ResponseResult isFirst(String id){
        if(xKService.isFirst(id)){
            return ResponseResult.createMsg(SysParam.XK.FIRST.getCode(),SysParam.XK.FIRST.getMsg());
        }else{
            return ResponseResult.createMsg(SysParam.XK.NOT_FIRST.getCode(),SysParam.XK.NOT_FIRST.getMsg());
        }
    }

    /**
     * 完善信息
     * @return
     */
    public ResponseResult complementInfo(){
        return null;
    }
    /**
     * 获取教师列表
     * @return
     */
    @RequestMapping("/isFirst")
    public ResponseResult getTeacher(){
        return xKService.getTeacher();
    }
    /**
     * 获取教师课程表
     * @return
     */
    public ResponseResult getScheduleByTeacher(){
        return null;
    }
    /**
     * 获取教师上课记录
     * @return
     */
    @RequestMapping("/getClassRecordByTeacher")
    public ResponseResult getClassRecordByTeacher(){
        return null;
    }
    /**
     * 获取学生课程表
     * @return
     */
    public ResponseResult getScheduleByStudent(){
        return null;
    }
    /**
     * 获取学生上课记录
     * @return
     */
    public ResponseResult getClassRecordByStudent(){
        return null;
    }
}

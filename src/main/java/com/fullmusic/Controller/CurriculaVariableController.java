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
    @RequestMapping("/complementInfo")
    public ResponseResult complementInfo(String userId,String studentName,String age,String phone,String lTime,String hPiano){

        return xKService.complementInfo( userId, studentName, age, phone, lTime, hPiano);
    }
    /**
     * 获取教师列表
     * @return
     */
    @RequestMapping("/getTeacher")
    public ResponseResult getTeacher(){
        return xKService.getTeacher();
    }
    /**
     * 获取教师课程表
     * @return
     */
    @RequestMapping("/getScheduleByTeacher")
    public ResponseResult getScheduleByTeacher(String teacherId){

        return xKService.getScheduleByTeacher(teacherId);
    }
    /**
     * 获取教师上课记录
     * @return
     */
    @RequestMapping("/getClassRecordByTeacher")
    public ResponseResult getClassRecordByTeacher(String teacherId){

        return xKService.getClassRecordByTeacher(teacherId);
    }
    /**
     * 获取学生课程表
     * @return
     */
    @RequestMapping("/getScheduleByStudent")
    public ResponseResult getScheduleByStudent(String studentId){

        return xKService.getScheduleByStudent(studentId);
    }
    /**
     * 获取学生上课记录
     * @return
     */
    @RequestMapping("/getClassRecordByStudent")
    public ResponseResult getClassRecordByStudent(String studentId){

        return xKService.getClassRecordByStudent(studentId);
    }
    /**
     * 获取当天老师已被的选课程
     * @param teacherId
     * @param date
     * @return
     */
    @RequestMapping("/getCurrXk")
    public ResponseResult getCurrXk(String teacherId,String date){

        return xKService.getCurrXk( teacherId, date);
    }

    /**
     * 获取可约课时间
     * @return
     */
    @RequestMapping("/getDateList")
    public ResponseResult getDateList(){
        return xKService.getDateList();
    }

    /**
     * 选课
     * @param teacherId
     * @param studentId
     * @param course
     * @param date
     * @param orderByCourse
     * @return
     */
    @RequestMapping("/xk")
    public ResponseResult xk(String teacherId,String studentId,String course,String date,String orderByCourse){
        return xKService.xk(teacherId,studentId,course,date,orderByCourse);
    }
    /**
     * 取消选课
     * @param id
     * @return
     */
    @RequestMapping("/canelXk")
    public ResponseResult canelXk(String id){
        return xKService.canelXk(id);
    }

}

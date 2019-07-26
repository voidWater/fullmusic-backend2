package com.fullmusic.service;

import com.fullmusic.common.ResponseResult;
import com.fullmusic.common.SysParam;
import com.fullmusic.dao.CurriculaVariableMapper;
import com.fullmusic.dao.UserCvMapper;
import com.fullmusic.dao.UserMapper;
import com.fullmusic.pojo.*;
import com.fullmusic.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class XKService {
    com.fullmusic.common.ResponseResult ResponseResult = new ResponseResult();
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserCvMapper userCvMapper;
    @Autowired
    private CurriculaVariableMapper curriculaVariableMapper;

    /**
     * 判断是学生还是老师
     * @param id
     * @return
     */
    public ResponseResult isType(String id){
        User user = userMapper.selectByPrimaryKey(id);

        if(user!=null){
            if(user.getVcType()==SysParam.User.TYPE_TEACHER.getCode()){
                return ResponseResult.createMsg(SysParam.User.TYPE_TEACHER.getCode(),SysParam.User.TYPE_TEACHER.getMsg());
            }else{
                return ResponseResult.createMsg(SysParam.User.TYPE_STUDENT.getCode(),SysParam.User.TYPE_STUDENT.getMsg());
            }
        }else{
            return ResponseResult.createMsg(SysParam.User.NOT_EXIST.getCode(),SysParam.User.NOT_EXIST.getMsg());
        }
    }

    /**
     * 判断是否第一次使用
     * @param id
     * @return
     */
    public boolean isFirst(String id){
        UserCvExample userCvExample= new UserCvExample();
        userCvExample.createCriteria().andVcUserIdEqualTo(id);

        List<UserCv> list = userCvMapper.selectByExample(userCvExample);
        if(list==null||list.size()==0){
            return false;
        }else {
            return true;
        }
    }

    /**
     * 插入用户选课信息
     * @param userId
     * @param studentName
     * @param age
     * @param phone
     * @param lTime
     * @param hPiano
     * @return
     */
    public ResponseResult complementInfo(String userId,String studentName,String age,String phone,String lTime,String hPiano){
        UserCv userCv = new UserCv();
        userCv.setId(UUID.randomUUID().toString());
        userCv.setVcUserId(userId);
        userCv.setVcStudentName(studentName);
        userCv.setVcStudentAge(Integer.valueOf(age));
        userCv.setVcStudentPhone(phone);
        userCv.setVcLearingTime(lTime);
        userCv.setVcHavePiano(hPiano);
        int i = userCvMapper.insert(userCv);
        if(i==1){
            return ResponseResult.createMsg(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg());
        }else{
            return ResponseResult.createMsg(SysParam.SysCommon.ERROR.getCode(),SysParam.SysCommon.ERROR.getMsg());
        }
    }
    /**
     * 获取教师列表
     * @return
     */
    public ResponseResult getTeacher() {
        UserExample userExample= new UserExample();
        userExample.createCriteria().andVcTypeEqualTo(SysParam.User.TYPE_TEACHER.getCode());
        List<User> list = userMapper.selectByExample(userExample);
        return ResponseResult.createList(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg(),list.size(),list);
    }

    /**
     * 获取教师课程表
     * @param id
     * @return
     */
    public ResponseResult getScheduleByTeacher(String id){
        CurriculaVariableExample curriculaVariableExample = new CurriculaVariableExample();
        curriculaVariableExample.createCriteria().andVcTeacherIdEqualTo(id).andVcBegindateGreaterThanOrEqualTo(DateUtil.getCurrDate());
        List<CurriculaVariable> list= curriculaVariableMapper.selectByExample(curriculaVariableExample);
        return ResponseResult.createList(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg(),list.size(),list);
    }

    /**
     * 获取教师上课记录
     * @param id
     * @return
     */
    public ResponseResult getClassRecordByTeacher(String id){
        CurriculaVariableExample curriculaVariableExample = new CurriculaVariableExample();
        curriculaVariableExample.createCriteria().andVcTeacherIdEqualTo(id).andVcBegindateLessThan(DateUtil.getCurrDate());
        List<CurriculaVariable> list= curriculaVariableMapper.selectByExample(curriculaVariableExample);
        return ResponseResult.createList(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg(),list.size(),list);
    }
    /**
     * 获取学生课程表
     * @param id
     * @return
     */
    public ResponseResult getScheduleByStudent(String id){
        CurriculaVariableExample curriculaVariableExample = new CurriculaVariableExample();
        curriculaVariableExample.createCriteria().andVcStudentIdEqualTo(id).andVcBegindateGreaterThanOrEqualTo(DateUtil.getCurrDate());
        List<CurriculaVariable> list= curriculaVariableMapper.selectByExample(curriculaVariableExample);
        return ResponseResult.createList(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg(),list.size(),list);
    }

    /**
     * 获取学生上课记录
     * @param id
     * @return
     */
    public ResponseResult getClassRecordByStudent(String id){
        CurriculaVariableExample curriculaVariableExample = new CurriculaVariableExample();
        curriculaVariableExample.createCriteria().andVcStudentIdEqualTo(id).andVcBegindateLessThan(DateUtil.getCurrDate());
        List<CurriculaVariable> list= curriculaVariableMapper.selectByExample(curriculaVariableExample);
        return ResponseResult.createList(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg(),list.size(),list);

    }
    /**
     * 获取当天老师已被的选课程
     * @param teacherId
     * @return
     */
    public ResponseResult getCurrXk(String teacherId,String date){
        CurriculaVariableExample curriculaVariableExample = new CurriculaVariableExample();
        curriculaVariableExample.createCriteria().andVcTeacherIdEqualTo(teacherId).andVcBegindateEqualTo(DateUtil.getCurrDate());
        List<CurriculaVariable> list= curriculaVariableMapper.selectByExample(curriculaVariableExample);
        return ResponseResult.createList(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg(),list.size(),list);
    }

    /**
     * 获取可约课时间
     * @return
     */
    public ResponseResult getDateList(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String crrd = formatter.format(new Date());
        System.out.println(crrd);
        System.out.println(DateUtil.getAssDate(crrd));
        String xq = DateUtil.getWeekOfDate(DateUtil.getAssDate(crrd));
        System.out.println(xq);
        List<String> list = new ArrayList<>();
        list.add(crrd+","+xq);
        int i = 0;
        while(i<4){
            i++;
            crrd = DateUtil.getSpecifiedDayAfter(crrd);
            xq = DateUtil.getWeekOfDate(DateUtil.getAssDate(crrd));
            list.add(crrd+","+xq);
        }
        return ResponseResult.createList(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg(),list.size(),list);

    }
    /**
     * 选课
     * @param teacherId
     * @param studentId
     * @param course
     * @param orderByCourse
     * @return
     */
    public ResponseResult xk(String teacherId,String studentId,String course,String date,String orderByCourse){
        CurriculaVariableExample curriculaVariableExample = new CurriculaVariableExample();
        curriculaVariableExample.createCriteria()
                .andVcTeacherIdEqualTo(teacherId).andVcBegindateEqualTo(DateUtil.getAssDate(date))
                .andVcOrderEqualTo(Integer.valueOf(orderByCourse));
        List<CurriculaVariable> list= curriculaVariableMapper.selectByExample(curriculaVariableExample);
        if(list.size()>0){
            return ResponseResult.createMsg(SysParam.SysCommon.ERROR.getCode(),SysParam.SysCommon.ERROR.getMsg());
        }

        CurriculaVariable curriculaVariable = new CurriculaVariable();
        curriculaVariable.setId(UUID.randomUUID().toString());
        curriculaVariable.setVcTeacherId(teacherId);
        curriculaVariable.setVcStudentId(studentId);
        curriculaVariable.setVcBegindate(DateUtil.getAssDate(date));
        curriculaVariable.setVcOrder(Integer.valueOf(orderByCourse));
        curriculaVariable.setVcCourseName(course);

        int i = curriculaVariableMapper.insert(curriculaVariable);
        if(i==1){
            return ResponseResult.createMsg(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg());
        }else{
            return ResponseResult.createMsg(SysParam.SysCommon.ERROR.getCode(),SysParam.SysCommon.ERROR.getMsg());
        }
    }

    /**
     * 取消选课
     * @param id
     * @return
     */
    public ResponseResult canelXk(String id){
        int i = curriculaVariableMapper.deleteByPrimaryKey(id);
        if(i==1){
            return ResponseResult.createMsg(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg());
        }else{
            return ResponseResult.createMsg(SysParam.SysCommon.ERROR.getCode(),SysParam.SysCommon.ERROR.getMsg());
        }
    }
}

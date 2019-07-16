package com.fullmusic.service;

import com.fullmusic.common.ResponseResult;
import com.fullmusic.common.SysParam;
import com.fullmusic.dao.UserCvMapper;
import com.fullmusic.dao.UserMapper;
import com.fullmusic.pojo.User;
import com.fullmusic.pojo.UserCv;
import com.fullmusic.pojo.UserCvExample;
import com.fullmusic.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XKService {
    com.fullmusic.common.ResponseResult ResponseResult = new ResponseResult();
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserCvMapper userCvMapper;

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
     * 获取教师列表
     * @return
     */
    public ResponseResult getTeacher() {
        UserExample userExample= new UserExample();
        userExample.createCriteria().andVcTypeEqualTo(SysParam.User.TYPE_TEACHER.getCode());
        List<User> list = userMapper.selectByExample(userExample);
        return ResponseResult.createList(SysParam.SysCommon.SUCCESS.getCode(),SysParam.SysCommon.SUCCESS.getMsg(),list.size(),list);
    }
}

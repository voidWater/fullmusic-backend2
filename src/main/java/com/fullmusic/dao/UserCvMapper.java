package com.fullmusic.dao;

import java.util.List;
import com.fullmusic.pojo.UserCv;
import com.fullmusic.pojo.UserCvExample;
import org.apache.ibatis.annotations.Param;

public interface UserCvMapper {
    int countByExample(UserCvExample example);

    int deleteByExample(UserCvExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserCv record);

    int insertSelective(UserCv record);

    List<UserCv> selectByExample(UserCvExample example);

    UserCv selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserCv record, @Param("example") UserCvExample example);

    int updateByExample(@Param("record") UserCv record, @Param("example") UserCvExample example);

    int updateByPrimaryKeySelective(UserCv record);

    int updateByPrimaryKey(UserCv record);
}
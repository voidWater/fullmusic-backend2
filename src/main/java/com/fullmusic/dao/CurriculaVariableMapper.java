package main.java.com.fullmusic.dao;

import java.util.List;

import main.java.com.fullmusic.pojo.CurriculaVariable;
import main.java.com.fullmusic.pojo.CurriculaVariableExample;
import org.apache.ibatis.annotations.Param;

public interface CurriculaVariableMapper {
    int countByExample(CurriculaVariableExample example);

    int deleteByExample(CurriculaVariableExample example);

    int deleteByPrimaryKey(String id);

    int insert(CurriculaVariable record);

    int insertSelective(CurriculaVariable record);

    List<CurriculaVariable> selectByExample(CurriculaVariableExample example);

    CurriculaVariable selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CurriculaVariable record, @Param("example") CurriculaVariableExample example);

    int updateByExample(@Param("record") CurriculaVariable record, @Param("example") CurriculaVariableExample example);

    int updateByPrimaryKeySelective(CurriculaVariable record);

    int updateByPrimaryKey(CurriculaVariable record);
}
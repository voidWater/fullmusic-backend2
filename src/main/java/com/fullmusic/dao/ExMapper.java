package com.fullmusic.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ExMapper {

    @Select("select vc_user_id,COUNT(1) as count from vt_clockin GROUP BY vc_user_id ORDER BY count desc")
    public List<Map<String, Object>> rankingList();
}

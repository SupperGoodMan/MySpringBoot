package com.accp.dao;

import com.accp.domain.LaoWang;
import com.accp.domain.LaoWangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LaoWangMapper {
    int countByExample(LaoWangExample example);

    int deleteByExample(LaoWangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LaoWang record);

    int insertSelective(LaoWang record);

    List<LaoWang> selectByExample(LaoWangExample example);

    LaoWang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LaoWang record, @Param("example") LaoWangExample example);

    int updateByExample(@Param("record") LaoWang record, @Param("example") LaoWangExample example);

    int updateByPrimaryKeySelective(LaoWang record);

    int updateByPrimaryKey(LaoWang record);
}
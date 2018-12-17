package com.daojia.authority.mapper;

import com.daojia.authority.entity.DJTest;
import com.daojia.authority.entity.DJTestExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface DJTestMapper {
    int countByExample(DJTestExample example);

    int deleteByExample(DJTestExample example);

    int insert(DJTest record);

    int insertSelective(DJTest record);

    List<DJTest> selectByExample(DJTestExample example);

    int updateByExampleSelective(@Param("record") DJTest record, @Param("example") DJTestExample example);

    int updateByExample(@Param("record") DJTest record, @Param("example") DJTestExample example);
}
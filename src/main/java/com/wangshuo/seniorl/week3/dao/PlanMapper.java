package com.wangshuo.seniorl.week3.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangshuo.seniorl.week3.domain.Plan;

public interface PlanMapper {
	
	
	List<Plan> selects(@Param("name")String name);
    int deleteByPrimaryKey(Integer id);

    int insert(Plan record);

    int insertSelective(Plan record);

    Plan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKeyWithBLOBs(Plan record);

    int updateByPrimaryKey(Plan record);
}
package com.wangshuo.seniorl.week3.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.wangshuo.seniorl.week3.domain.Plan;

public interface PlanService {

	
	PageInfo<Plan> selects(@Param("name")String name,Integer page,Integer pageSize);
	    
	    int deleteByPrimaryKey(Integer id);

	    int insert(Plan record);

	  

	    Plan selectByPrimaryKey(Integer id);

	 

	 
	    int updateByPrimaryKey(Plan record);
	
}

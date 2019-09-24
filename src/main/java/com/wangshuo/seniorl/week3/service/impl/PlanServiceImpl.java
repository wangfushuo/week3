package com.wangshuo.seniorl.week3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangshuo.seniorl.week3.dao.PlanMapper;
import com.wangshuo.seniorl.week3.domain.Plan;
import com.wangshuo.seniorl.week3.service.PlanService;
@Service
public class PlanServiceImpl implements PlanService{

	@Resource
	private PlanMapper planMapper;
	
	@Override
	public PageInfo<Plan> selects(String name,Integer page,Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		List<Plan> list = planMapper.selects(name);
		
		return new PageInfo<Plan>(list);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return planMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Plan record) {
		// TODO Auto-generated method stub
		return planMapper.insert(record);
	}

	

	@Override
	public Plan selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return planMapper.selectByPrimaryKey(id);
	}

	


	@Override
	public int updateByPrimaryKey(Plan record) {
		// TODO Auto-generated method stub
		return planMapper.updateByPrimaryKey(record);
	}

}

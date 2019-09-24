package com.wangshuo.seniorl.week3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangshuo.seniorl.week3.dao.DepartmentMapper;
import com.wangshuo.seniorl.week3.domain.Department;
import com.wangshuo.seniorl.week3.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Resource
	private DepartmentMapper departmentMapper;

	@Override
	public List<Department> selects() {
		// TODO Auto-generated method stub
		return departmentMapper.selects();
	}

	@Override
	public int insert(Department record) {
		// TODO Auto-generated method stub
		return departmentMapper.insert(record);
	}

	@Override
	public Department selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return departmentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(Department record) {
		// TODO Auto-generated method stub
		return departmentMapper.updateByPrimaryKey(record);
	}

	
	
}

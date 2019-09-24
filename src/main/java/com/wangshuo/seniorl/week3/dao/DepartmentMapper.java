package com.wangshuo.seniorl.week3.dao;

import java.util.List;

import com.wangshuo.seniorl.week3.domain.Department;

public interface DepartmentMapper {
	List<Department> selects();
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}
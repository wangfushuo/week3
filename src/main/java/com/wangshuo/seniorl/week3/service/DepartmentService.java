package com.wangshuo.seniorl.week3.service;

import java.util.List;

import com.wangshuo.seniorl.week3.domain.Department;

public interface DepartmentService {

	
	List<Department> selects();
	

    int insert(Department record);

  

    Department selectByPrimaryKey(Integer id);

   

    int updateByPrimaryKey(Department record);

}

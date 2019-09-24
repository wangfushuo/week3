package com.wangshuo.seniorl.week3.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import com.wangshuo.common.utils.StreamUtil;
import com.wangshuo.seniorl.week3.service.PlanService;

public class PlanServiceImplTest {

	@Resource
	private PlanService planService;
	
	@Test
	public void testInsert() {
	
	String string= StreamUtil.readTextFile("/src/test/resources/test.txt");
	 
		
	}

}

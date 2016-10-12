package com.itheima10.oa.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima10.oa.domain.Department;
import com.itheima10.oa.service.DepartmentService;

public class DeparmentTest {

	@Test	
	public void testSaveDeparment(){
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		DepartmentService deparmentService = (DepartmentService) context.getBean("departmentService");
		Department deparment = new Department();
		deparment.setName("慰安部");
		deparment.setDescription("都是慰安妇");
		deparmentService.saveEntry(deparment);
		
	} 
}

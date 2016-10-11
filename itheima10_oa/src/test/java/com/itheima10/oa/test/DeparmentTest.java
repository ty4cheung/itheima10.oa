package com.itheima10.oa.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima10.oa.domain.Deparment;
import com.itheima10.oa.service.DeparmentService;

public class DeparmentTest {

	@Test	
	public void testSaveDeparment(){
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		DeparmentService deparmentService = (DeparmentService) context.getBean("deparmentService");
		Deparment deparment = new Deparment();
		deparment.setName("慰安部");
		deparment.setDescription("都是女的");
		deparmentService.saveEntry(deparment);
		
	}
}

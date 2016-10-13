package com.itheima10.oa.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima10.oa.domain.Role;
import com.itheima10.oa.service.RoleService;

public class RoleTest {

	@Test
	public void testSaveRole(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		RoleService roleService = (RoleService) context.getBean("roleService");
		
		Role role = new Role();
		role.setName("维修工程师");
		role.setPid(0L);
		role.setIsParent(true);
		role.setDescription("维修电视机");
		roleService.saveEntry(role);
		
	}
}

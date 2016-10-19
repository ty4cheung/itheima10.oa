package com.itheima10.oa.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SessionFactoryTest {

	private ApplicationContext context;

	@Test
	public void testSessionFactoryTest() {
		// try {
		context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		// SessionFactory sf = (SessionFactory) context.getBean("PersonDao");
		// System.out.println(sf);
		// } catch (Exception e) {
		// // TODO: handle exception
		// e.printStackTrace();
		// }

	}
	
	@Test
	public void testMain(){
		char ch='A';
		  switch( ch )

		  { 
		     case 'A' : ch++;
		     case 'B' : ch++;
		     case 'C' : ch++;
		  }
		  System.out.println(ch);
	}
}
package com.itheima10.oa.test;

import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima10.oa.dao.PersonDao;
import com.itheima10.oa.domain.Person;

public class PersonDaoTest {
	
	@Test
	public void testPersonDao(){
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
			PersonDao personDao =(PersonDao) context.getBean("personDao");
			Long[] s = new Long[]{1l,2l,3l};
			Set<Person> entryByIDS = personDao.getEntryByIDS(s);
			System.out.println(entryByIDS.size());
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
	}
}

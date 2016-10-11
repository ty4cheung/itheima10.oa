package com.itheima10.oa.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima10.oa.dao.PersonDao;
import com.itheima10.oa.dao.base.BaseDao;
import com.itheima10.oa.dao.base.BaseDaoImpl;
import com.itheima10.oa.domain.Person;
import com.itheima10.oa.service.PersonService;
import com.itheima10.oa.service.base.impl.BaseServiceImpl;

@Service("personService")
public class PersonServiceImpl extends BaseServiceImpl<Person> implements PersonService{
	
	@Resource(name="personDao")
	private PersonDao personDao;

	@Override
	public BaseDao<Person> getBaseDao() {
		// TODO Auto-generated method stub
		return this.personDao;
	}
	
	
}

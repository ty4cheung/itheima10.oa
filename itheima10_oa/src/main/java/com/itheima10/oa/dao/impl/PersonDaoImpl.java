package com.itheima10.oa.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima10.oa.dao.PersonDao;
import com.itheima10.oa.dao.base.BaseDaoImpl;
import com.itheima10.oa.domain.Person;

@Repository("personDao")
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDao{

}

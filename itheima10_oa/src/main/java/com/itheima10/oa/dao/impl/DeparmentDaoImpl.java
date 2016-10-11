package com.itheima10.oa.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima10.oa.dao.DeparmentDao;
import com.itheima10.oa.dao.base.BaseDaoImpl;
import com.itheima10.oa.domain.Deparment;

@Repository("deparmentDao")
public class DeparmentDaoImpl extends BaseDaoImpl<Deparment> implements DeparmentDao{

}

package com.itheima10.oa.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima10.oa.dao.DeparmentDao;
import com.itheima10.oa.dao.base.BaseDao;
import com.itheima10.oa.domain.Deparment;
import com.itheima10.oa.service.DeparmentService;
import com.itheima10.oa.service.base.impl.BaseServiceImpl;

@Service("deparmentService")
public class DeparmentServiceImpl extends BaseServiceImpl<Deparment> implements DeparmentService{

	@Resource(name="deparmentDao")
	private DeparmentDao deparmentDao;
	
	@Override
	public BaseDao<Deparment> getBaseDao() {
		// TODO Auto-generated method stub
		return this.deparmentDao;
	}

}

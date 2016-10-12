package com.itheima10.oa.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima10.oa.dao.DepartmentDao;
import com.itheima10.oa.dao.base.BaseDao;
import com.itheima10.oa.domain.Department;
import com.itheima10.oa.service.DepartmentService;
import com.itheima10.oa.service.base.impl.BaseServiceImpl;

@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService{

	@Resource(name="departmentDao")
	private DepartmentDao department;
	
	@Override
	public BaseDao<Department> getBaseDao() {
		// TODO Auto-generated method stub
		return this.department;
	}

}

package com.itheima10.oa.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima10.oa.dao.DepartmentDao;
import com.itheima10.oa.dao.base.BaseDaoImpl;
import com.itheima10.oa.domain.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{

}

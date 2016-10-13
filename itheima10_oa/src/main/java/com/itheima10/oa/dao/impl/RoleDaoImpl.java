package com.itheima10.oa.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima10.oa.dao.RoleDao;
import com.itheima10.oa.dao.base.BaseDaoImpl;
import com.itheima10.oa.domain.Role;

@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao{

}

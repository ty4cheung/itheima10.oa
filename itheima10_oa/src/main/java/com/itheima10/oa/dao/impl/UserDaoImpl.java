package com.itheima10.oa.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima10.oa.dao.UserDao;
import com.itheima10.oa.dao.base.BaseDaoImpl;
import com.itheima10.oa.domain.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

}

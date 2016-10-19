package com.itheima10.oa.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima10.oa.dao.UserDao;
import com.itheima10.oa.dao.base.BaseDao;
import com.itheima10.oa.domain.User;
import com.itheima10.oa.service.UserService;
import com.itheima10.oa.service.base.impl.BaseServiceImpl;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public BaseDao<User> getBaseDao() {
		// TODO Auto-generated method stub
		return this.userDao;
	}

	
}

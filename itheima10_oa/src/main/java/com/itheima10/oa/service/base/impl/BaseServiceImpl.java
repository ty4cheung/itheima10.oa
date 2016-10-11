package com.itheima10.oa.service.base.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import com.itheima10.oa.dao.base.BaseDao;
import com.itheima10.oa.service.base.BaseService;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
	
	public abstract BaseDao<T> getBaseDao();

	@Override
	public List<T> getAllEntry() {
		// TODO Auto-generated method stub
		return this.getBaseDao().getAllEntry();
	}

	@Override
	public T getEntryById(Serializable id) {
		// TODO Auto-generated method stub
		return this.getBaseDao().getEntryById(id);
	}

	@Override
	public void updateEntry(T t) {
		// TODO Auto-generated method stub
		this.getBaseDao().updateEntry(t);
	}

	@Override
	public void deleteEntry(Serializable id) {
		// TODO Auto-generated method stub
		this.getBaseDao().deleteEntry(id);
	}

	@Transactional(readOnly=false)
	public void saveEntry(T t) {
		// TODO Auto-generated method stub
		this.getBaseDao().saveEntry(t);
	}

	@Override
	public Set<T> getEntryByIDS(Serializable[] ids) {
		// TODO Auto-generated method stub
		return this.getBaseDao().getEntryByIDS(ids);
	}
}

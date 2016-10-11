package com.itheima10.oa.dao.base;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public interface BaseDao<T> {

	public List<T> getAllEntry();
	public T getEntryById(Serializable id);
	public void updateEntry(T t);
	public void deleteEntry(Serializable id);
	public void saveEntry(T t);
	public Set<T> getEntryByIDS(Serializable[] ids);
	
}

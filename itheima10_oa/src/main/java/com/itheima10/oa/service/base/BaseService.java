package com.itheima10.oa.service.base;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public interface BaseService<T> {
	
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<T> getAllEntry();
	
	/**
	 * 根据id查询一个对象
	 * @param id
	 * @return
	 */
	public T getEntryById(Serializable id);
	public void updateEntry(T t);
	public void deleteEntry(Serializable id);
	public void saveEntry(T t);
	public Set<T> getEntryByIDS(Serializable[] ids);
}

package com.itheima10.oa.dao.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.hibernate.metadata.ClassMetadata;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDaoImpl<T> implements BaseDao<T>{
	
	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	private Class classt;
	private ClassMetadata classMetadata;
	/**从构造器中得到t的类型*/
	public BaseDaoImpl(){
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.classt = (Class) type.getActualTypeArguments()[0];
	}
	@PostConstruct
	public void init() {
		this.classMetadata = this.hibernateTemplate.getSessionFactory().getClassMetadata(this.classt);

	}
	
	@Override
	public List<T> getAllEntry() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from "+this.classt.getName());
	}

	@Override
	public T getEntryById(Serializable id) {
		// TODO Auto-generated method stub
		return (T) this.hibernateTemplate.get(this.classt, id);
	}

	@Override
	public void updateEntry(T t) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(t);
	}

	@Override
	public void deleteEntry(Serializable id) {
		// TODO Auto-generated method stub
		T t = this.getEntryById(id);
		this.hibernateTemplate.delete(t);
	}

	@Override
	public void saveEntry(T t) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(t);
	}
	@Override
	public Set<T> getEntryByIDS(Serializable[] ids) {
		
		StringBuffer sbuff = new StringBuffer();
		sbuff.append("from "+this.classt.getName());
		sbuff.append(" where " + this.classMetadata.getIdentifierPropertyName());
		sbuff.append(" in(");
		for (int i = 0; i < ids.length; i++) {
			if(i == ids.length-1){
				sbuff.append(ids[i]);
			}else{
				sbuff.append(ids[i]+",");
			}
		}
		sbuff.append(")");
		return new HashSet(this.hibernateTemplate.find(sbuff.toString()));
	}

}

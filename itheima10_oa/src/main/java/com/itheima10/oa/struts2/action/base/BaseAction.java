package com.itheima10.oa.struts2.action.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.Parameter;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{

	private Class classt;
	
	public BaseAction() {
		// TODO Auto-generated constructor stub
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.classt = (Class) type.getActualTypeArguments()[0];
	}
	
	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}

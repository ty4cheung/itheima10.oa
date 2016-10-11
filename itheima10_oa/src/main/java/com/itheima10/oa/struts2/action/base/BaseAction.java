package com.itheima10.oa.struts2.action.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.Parameter;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{

	private Class classt;
	private T t;
	public BaseAction() {
		// TODO Auto-generated constructor stub
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.classt = (Class) type.getActualTypeArguments()[0];
		try {
			this.t=(T) this.classt.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return this.t;
	}
	
	private static final String LISTACTION = "listAction";
	public String listAction = LISTACTION;
	
	private static final String ADDUI = "addUI";
	public String addUI = ADDUI;
	
	private static final String ACTION2ACTION = "action2action";
	public String action2action = ACTION2ACTION;

}

package com.itheima10.oa.struts2.action.base;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{

	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}

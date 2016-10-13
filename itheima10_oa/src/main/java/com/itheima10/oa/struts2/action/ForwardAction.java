package com.itheima10.oa.struts2.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller("forwardAction")
@Scope("prototype") // 不写就会变成单例
public class ForwardAction extends ActionSupport{
	private String method;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return this.method;
	}
	
}

package com.itheima10.oa.struts2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima10.oa.domain.Role;
import com.itheima10.oa.service.RoleService;
import com.itheima10.oa.struts2.action.base.BaseAction;
import com.opensymphony.xwork2.ActionContext;



@Controller("roleAction")
@Scope("prototype") // 不写就会变成单例
public class RoleAction extends BaseAction<Role> {

	@Resource(name="roleService")
	private RoleService roleService;

	public String showAllRole(){
		List<Role> roles = this.roleService.getAllEntry();
		ActionContext.getContext().getValueStack().push(roles);
		return SUCCESS;
	}
	
	public String addRole(){
		Role role = new Role();
		BeanUtils.copyProperties(this.getModel(),role);
		this.roleService.saveEntry(role);
		ActionContext.getContext().getValueStack().push(role);
		return SUCCESS;
	}
	
	public String deleteRole(){
		this.roleService.deleteEntry(this.getModel().getRid());
		return SUCCESS;
	}
}

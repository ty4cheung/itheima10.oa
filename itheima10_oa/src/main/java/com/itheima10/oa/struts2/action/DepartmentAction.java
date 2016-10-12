package com.itheima10.oa.struts2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima10.oa.domain.Department;
import com.itheima10.oa.service.DepartmentService;
import com.itheima10.oa.struts2.action.base.BaseAction;
import com.opensymphony.xwork2.ActionContext;

@Controller("departmentAction")
@Scope("prototype")// 不写就会变成单例
public class DepartmentAction extends BaseAction<Department>{

	@Resource(name="departmentService")
	private DepartmentService departmentService;
	
	public String showAllDepartment(){
		List<Department> departments = departmentService.getAllEntry();
		ActionContext.getContext().put("departments", departments);
		return listAction;
	}
	
	public String addUI(){
		
		return addUI;
	}
	
	public String add(){
		
		Department  department = new Department();
		BeanUtils.copyProperties(this.getModel(), department);
		this.departmentService.saveEntry(department);
		return action2action;
	}
}

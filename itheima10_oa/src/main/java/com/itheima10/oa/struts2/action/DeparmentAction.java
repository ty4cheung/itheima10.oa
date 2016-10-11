package com.itheima10.oa.struts2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima10.oa.domain.Deparment;
import com.itheima10.oa.service.DeparmentService;
import com.itheima10.oa.struts2.action.base.BaseAction;
import com.opensymphony.xwork2.ActionContext;

@Controller("deparmentAction")
@Scope("prototype")// 不写就会变成单例
public class DeparmentAction extends BaseAction<Deparment>{

	@Resource(name="deparmentService")
	private DeparmentService deparmentService;
	
	public String showAllDeparment(){
		List<Deparment> deparments = deparmentService.getAllEntry();
		ActionContext.getContext().put("deparments", deparments);
		return "listAction";
	}
}

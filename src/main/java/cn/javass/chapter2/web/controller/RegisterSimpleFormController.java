package cn.javass.chapter2.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.mvc.SimpleFormController;

import cn.javass.chapter2.model.UserModel;

public class RegisterSimpleFormController extends SimpleFormController {

	public RegisterSimpleFormController() {
		//super();
		// TODO Auto-generated constructor stub
		setCommandClass(UserModel.class);
		setCommandName("user");
	}
	protected Object formBackingObject(HttpServletRequest reqeust) throws Exception{
		UserModel user = new UserModel();
		user.setUsername("�������û���");
		return user;
	}
	protected Map referenceData(HttpServletRequest request) throws Exception{
		Map map = new HashMap();
		map.put("cityList", Arrays.asList("�Ϻ�","����","����"));
		return map;
	}
	protected void doSubmitAction(Object command) throws Exception{
		UserModel user = (UserModel)command;
		System.out.println(user);
	}
}

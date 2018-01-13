package cn.javass.chapter2.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import cn.javass.chapter2.model.UserModel;

public class CanCancelRegisterSimpleFormController extends CancellableFormController {

	public CanCancelRegisterSimpleFormController() {
		//super();
		// TODO Auto-generated constructor stub
		setCommandClass(UserModel.class);
		setCommandName("user");
	}
	protected Object formBackingObject(HttpServletRequest reqeust) throws Exception{
		UserModel user = new UserModel();
		user.setUsername("请输入用户名");
		return user;
	}
	protected Map referenceData(HttpServletRequest request) throws Exception{
		Map map = new HashMap();
		map.put("cityList", Arrays.asList("上海","北京","深圳"));
		return map;
	}
	protected void doSubmitAction(Object command) throws Exception{
		UserModel user = (UserModel)command;
		System.out.println(user);
	}
	
	protected ModelAndView onCancel(Object command) throws Exception{
		UserModel user = (UserModel)command;
		System.out.println(user);
		return super.onCancel(command);
	}
}

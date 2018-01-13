package cn.javass.chapter2.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import cn.javass.chapter2.model.UserModel;

public class MyAbstractCommandController extends AbstractCommandController{
	public MyAbstractCommandController() {
		setCommandClass(UserModel.class);
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		UserModel user = (UserModel)command;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("helloWithAbstractCommand");
		mv.addObject(user);
		return mv;
	}
}

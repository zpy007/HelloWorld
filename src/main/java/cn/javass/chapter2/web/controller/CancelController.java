package cn.javass.chapter2.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class CancelController implements Controller{
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {  
	       //1���ռ���������֤����  
	       //2���󶨲������������  
	       //3�������������ҵ��������ҵ����  
	       //4��ѡ����һ��ҳ��  
	       ModelAndView mv = new ModelAndView();  
	       //���ģ������ �����������POJO����  
	       mv.addObject("message", "Hello World!���!!");  
	       //�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
	       mv.setViewName("cancel");  
	       return mv;  
	    }
}

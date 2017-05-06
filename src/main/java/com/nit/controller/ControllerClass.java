package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nit.domain.FormDetails;
import com.nit.service.HelloService;

@Controller
public class ControllerClass {
@Autowired
private HelloService helloService;
@RequestMapping(value="save",method=RequestMethod.POST)
public ModelAndView regi(@ModelAttribute("reg") FormDetails form){
	String targetView="/WEB-INF/views/succ.jsp";
	String message="InvaliData";
	
	int count=helloService.regi(form);
	if(count>0){
		message="Regi succ";
	}
	return new ModelAndView(targetView,"msg",message);
	
}
	
}

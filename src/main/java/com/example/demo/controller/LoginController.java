package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Program;
import com.example.demo.model.RegisterModel;
import com.example.demo.model.logmodel;
import com.example.demo.service.ProgramService;
import com.example.demo.service.RegisterService;

@Controller
public class LoginController {
	@Autowired
	RegisterService registerService;
	
	
	@RequestMapping(value="/")
	public String log() {
		return "log1";
	}
	
	
	@RequestMapping(value="/reg")
	public String regget() {
		return "reg";
	}

	@RequestMapping(value="/reg1", method=RequestMethod.POST)
	public ModelAndView regpost(RegisterModel m) {
	 //registerService.addUser(m);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("m1",registerService.addUser(m));
		mv.setViewName("reg1");
		return mv;
	}
	
	
	
	
}

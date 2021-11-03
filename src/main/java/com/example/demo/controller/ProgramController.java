package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.example.demo.model.ContactModel;
import com.example.demo.model.Program;
import com.example.demo.model.logmodel;
import com.example.demo.service.ProgramService;
import com.example.demo.service.RegisterService;

@Controller
public class ProgramController {
	
	
	@Autowired
	ProgramService programService;
	
	@Autowired
	RegisterService registerService;
	
	@RequestMapping(value="/logpost",method=RequestMethod.POST)
	public ModelAndView logpost(logmodel m) {
		;
		

		ModelAndView mv=new ModelAndView();
		mv.addObject("m1",registerService.validateUser(m));
		@SuppressWarnings("unchecked")
		ArrayList<Program> l1=(ArrayList<Program>) programService.ViewAll();
		mv.addObject("m2",l1);
		mv.setViewName("reg1");
		return mv;
		
	}
	
	@RequestMapping(value="/postaddprogram",method=RequestMethod.POST)
	public ModelAndView postaddprogram(Program p1) {
	 //registerService.addUser(m);
		programService.addProgram(p1);
		ModelAndView mv=new ModelAndView();
		ArrayList<Program> l1=(ArrayList<Program>) programService.ViewAll();
		mv.addObject("m2",l1);
		mv.setViewName("reg1");;
		return mv;
	}
	
	@RequestMapping(value="/getaddprogram")
	public String getaddprogram() {
	 //registerService.addUser(m);
		
		
		return "addprogram";
	}

}

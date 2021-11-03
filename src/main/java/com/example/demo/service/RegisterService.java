package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Program;
import com.example.demo.model.RegisterModel;
import com.example.demo.model.logmodel;
import com.example.demo.repository.ProgramRepository;
import com.example.demo.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	RegisterRepository registerRepository;
	
	@Autowired
	ProgramRepository programRepository;

	public String addUser(RegisterModel m) {
		// TODO Auto-generated method stub
		
			registerRepository.save(m);
			return "User Added Sucessfully" ;
		
	}

	public String validateUser(logmodel m1) {
		// TODO Auto-generated method stub
		for(RegisterModel a :registerRepository.findAll()) {
			if((a.getEmpname().equals(m1.getEmpname())) && a.getPassword().equals(m1.getPassword())){
				return "Welcome "+m1.getEmpname()+" You are our Valid User";
			}
			
		}
		return "Not a valid User";
		
	}

	public void addProgram(Program p1) {
		// TODO Auto-generated method stub
		programRepository.save(p1);
		//return "User Added Sucessfully" ;
	}
}

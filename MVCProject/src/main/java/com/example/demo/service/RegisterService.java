package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.RegisterModel;
import com.example.demo.model.logmodel;
import com.example.demo.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	RegisterRepository registerRepository;

	public String addUser(RegisterModel m) {
		// TODO Auto-generated method stub
		if(m.getLname()!=" "  && m.getFname()!="" && m.getUname()!="" && m.getPass()!="" && m.getNum()!=0)
		{
			registerRepository.save(m);
			return "User Added Sucessfully" ;
		}
		else {
			return "Please Add All Details.";
		}
	}

	public String validateUser(logmodel m1) {
		// TODO Auto-generated method stub
		for(RegisterModel a :registerRepository.findAll()) {
			if((a.getUname().equals(m1.getUname())) && a.getPass().equals(m1.getPass())){
				return "Welcome"+m1.getUname()+"You are our Valid User";
			}
			
		}
		return "Not a valid User";
		
	}
}

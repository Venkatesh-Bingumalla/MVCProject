package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Program;
import com.example.demo.repository.ProgramRepository;
@Service
public class ProgramService {
	
	@Autowired
	ProgramRepository programRepository;
	
	
	public void addProgram(Program p1) {
		// TODO Auto-generated method stub
		programRepository.save(p1);
		//return "User Added Sucessfully" ;
	}


	public Object ViewAll() {
		// TODO Auto-generated method stub
		return programRepository.findAll();
	}

}

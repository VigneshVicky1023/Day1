package com.example.demo.service;
import java.util.*;

import org.springframework.beans.factory.annotation.*;

import org.springframework.stereotype.Service;

import com.example.demo.repository.StudentRepo;
import com.example.demo.model.StudentEntity;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;
	
	public StudentEntity saveinfo(StudentEntity ss) {
		return sr.save(ss);
	}
	public List<StudentEntity> showinfo(){
		return sr.findAll();
		
	}
}
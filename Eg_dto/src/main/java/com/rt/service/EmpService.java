package com.rt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.Entity.Employee;
import com.rt.repo.Emprepo;

@Service
public class EmpService {

	 @Autowired
	 Emprepo er;

	 public void save(Employee e) {
		er.save(e);
		
		
	 }

	 public Optional<Employee> findById(int id) {
	     return	er.findById(id);
	 }
}

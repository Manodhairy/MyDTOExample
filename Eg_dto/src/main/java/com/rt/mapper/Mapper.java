package com.rt.mapper;



import com.rt.Dto.reqDto;
import com.rt.Dto.responsDto;
import com.rt.Entity.Employee;

public class Mapper {
	
	

	public Employee toEntity(reqDto rd) {
		Employee e=new Employee();
		e.setName(rd.getName());
		e.setAddress(rd.getAddress());
		e.setSalary(rd.getSalary());
		e.setPassword(rd.getPassword());
		return e;
	}

	public responsDto torespons(Employee e) {
	  responsDto rd=new responsDto();
	  rd.setName(e.getName());
	  rd.setAddress(e.getAddress());
	  
	  return rd;
		
	}

	
	
	
}

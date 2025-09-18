package com.rt.cntrl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.Dto.reqDto;
import com.rt.Dto.responsDto;
import com.rt.Entity.Employee;
import com.rt.mapper.Mapper;
import com.rt.service.EmpService;

@RestController
public class HomeCntrl {

	@Autowired
	EmpService es;
	
	
	@PostMapping("/hii")
	public String demo() {
		return "hello";
	}
	
	@PostMapping("/addData")
	public String addData(@RequestBody reqDto rd) {
		
		Mapper m=new Mapper();
		Employee e= m.toEntity(rd);
		es.save(e);
		return "add data";
	}
	
	@GetMapping("/oneData/{id}")
	public responsDto oneData(@PathVariable int id) {
		
		  Optional<Employee> data=es.findById(id);
		 Employee e= data.get();
		Mapper m=new Mapper();
		 
		
		responsDto red=m.torespons(e);
		return red;
				
	}
}

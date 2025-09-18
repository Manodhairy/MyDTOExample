package com.rt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.Entity.Employee;

@Repository
public interface Emprepo  extends JpaRepository<Employee, Integer>{

}

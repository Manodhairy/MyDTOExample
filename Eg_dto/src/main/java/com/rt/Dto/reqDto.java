package com.rt.Dto;

public class reqDto {

	private String name;
	private String address;
	private String salary;
	private String password;
	
	
	public reqDto() {}
	public reqDto(String name, String address, String salary, String password) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}

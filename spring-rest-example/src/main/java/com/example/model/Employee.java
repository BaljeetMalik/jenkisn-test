package com.example.model;

public class Employee {
	
	public String name;
	public String id;
	public String desgination;
	
	public Employee(String name, String id, String desgination) {
		super();
		this.name = name;
		this.id = id;
		this.desgination = desgination;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	
	
	

}

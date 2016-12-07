package com;

public class Manager implements ITask {
	
	private String name;	
	private String dept;
	
	public Manager(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	

	@Override
	public void task() {
		System.out.println("manage employees of "+dept);
		
	}
	
	@Override
	public String toString() {
		return "Manager [name=" + name + ", dept=" + dept + "]";
	}

}

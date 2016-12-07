package com;

public class Employee implements ITask {
	private String name;	
	
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public void task() {
		System.out.println("develop software");
		
	}
	

}

package com;

public class Main {
	public static void main(String  args[]){
		Employee emp =new Employee("Sam",10000);
		Employee emp2 =new Employee("jack",20000);
		System.out.println(emp);
		System.out.println(emp2);
		
		Manager manager=new Manager("Jacob","Insurance");
		System.out.println(manager);
	}

}

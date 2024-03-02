package com.sim;

public class Student {

	
	int id;
	
	Address adr;
	// 8
	// b s i l d b f c

	String name;// ref

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setter method invoked !!");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id) {
		System.out.println("Const injection invoked !!");
		this.id = id;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Const invoked !!");
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}


	// two types of injection
	// setter injection
	// constructor injection

}

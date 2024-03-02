package com.sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student student = ctx.getBean("st", Student.class);
		System.out.println(student.id);
		System.out.println(student.name);
		System.out.println(student.adr.city);
	}

}

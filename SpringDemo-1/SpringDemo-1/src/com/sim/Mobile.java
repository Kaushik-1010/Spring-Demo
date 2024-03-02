package com.sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim = ctx.getBean("simObject", Sim.class);
		sim.calling(123);
		sim.data("5g");
		
	}

}

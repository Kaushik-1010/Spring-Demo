package com.sim;

public class Jio implements Sim {

	@Override
	public void calling(int number) {
		System.out.println("Calling impl by Jio network");
	}

	@Override
	public void data(String internetType) {
		System.out.println("5G by Jio network");
	}

}

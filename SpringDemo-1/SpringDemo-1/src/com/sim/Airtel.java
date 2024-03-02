package com.sim;

public class Airtel implements Sim {

	@Override
	public void calling(int number) {
		System.out.println("Calling implemnted by Airtel");
	}

	@Override
	public void data(String internetType) {
		System.out.println("5g data by Airtel Towers");
	}

	public Airtel() {
	}
}

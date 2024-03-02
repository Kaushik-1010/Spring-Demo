package com.sim;

public class Vodafone implements Sim{

	@Override
	public void calling(int number) {
System.out.println("Vodafone calling");		
	}

	@Override
	public void data(String internetType) {
		System.out.println("vodafone data");
	}

}

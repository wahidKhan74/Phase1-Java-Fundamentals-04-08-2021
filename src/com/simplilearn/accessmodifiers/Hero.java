package com.simplilearn.accessmodifiers;

public class Hero {
	
	// protected property
	protected String power = "Wolworeen - Healing Power";
	
	// protected method
	protected void usePower() {
		System.out.println("The Greate power of all "+ power);
	}
	
	public void showPower() {
		System.out.println("The Power is "+power);
	}
}

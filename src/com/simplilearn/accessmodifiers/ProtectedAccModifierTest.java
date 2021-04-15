package com.simplilearn.accessmodifiers;

public class ProtectedAccModifierTest {

	public static void main(String[] args) {
		
		Hero hero = new Hero();
		
		System.out.println("Hero Power : "+hero.power);
		hero.showPower();
		hero.usePower();
	}

}


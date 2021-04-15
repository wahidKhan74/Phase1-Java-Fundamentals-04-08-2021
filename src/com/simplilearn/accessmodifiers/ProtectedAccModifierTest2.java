package com.simplilearn.accessmodifiers;

import com.simplilearn.accessB.SuperHero;

public class ProtectedAccModifierTest2 extends SuperHero {

	public static void main(String[] args) {
		
		// SuperHero hero = new SuperHero();		
		// System.out.println("Hero Power : "+hero.power); // compile time error
		// hero.showPower();  // public 
		// hero.usePower(); // compile time error
		
		// Note : Protected properties or method outside the package is accessible with inheritance.
		
		ProtectedAccModifierTest2 accModifier = new ProtectedAccModifierTest2();
		
		// access protected variable
		System.out.println("The Power : "+accModifier.power);
		// access protected method
		accModifier.usePower();		
	}

}


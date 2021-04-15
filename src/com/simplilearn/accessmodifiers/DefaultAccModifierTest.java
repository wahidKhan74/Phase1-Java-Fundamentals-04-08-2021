package com.simplilearn.accessmodifiers;

public class DefaultAccModifierTest {

	public static void main(String[] args) {

		//create object
		Brother brother = new Brother();
		
		System.out.println("The Money :: " + brother.money);
		System.out.println("The Clothes :: " + brother.clothes);
		brother.showAll();	
		
		// create object
		// Sister sister = new Sister();
		// sister.money;
		
	}

}

class Brother {
	
	double money = 45678;
	String clothes = "xyz";
	
	void showAll() {
		System.out.println("Money :: "+ money +" Clothes :: "+clothes);
	}
	
}

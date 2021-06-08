package com.simplilearn.exception.handling;

public class ExceptionWithMethods {

	public static void main(String[] args) {
		
		transaction(100);
		transaction(0);
		transaction(100);
		
		System.out.println("-------------");
		lengthCalculator("John Smith");
		lengthCalculator(null);
		
		System.out.println("-------------");
		numberConvertor("45235");
		numberConvertor("45235abc");
		
		System.out.println("-------------");
		multiTask("122", 12); //valid input
		multiTask("123234", 0);
		multiTask("acbd123", 121);
		multiTask(null, 121);
		
		System.out.println("-------------");
		multiTask2("122", 12); //valid input
	}
	
	private static void transaction(int amount) {
		try {
			int balance = 20000;
			float result = balance / amount;
			System.out.println("Result :> "+ result);			
		} catch (ArithmeticException e) {
			System.out.println("Exception Occurs : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}		
	};

	private static void lengthCalculator(String str) {
		try {
			int length = str.length();
			System.out.println("Input Str lenght :> "+ length);
		} catch (NullPointerException e) {
			System.out.println("Exception Occurs : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
	}
	
	private static void numberConvertor(String input) {
		try {
			int result = Integer.parseInt(input);
			System.out.println("INT Result :> "+ result);			
		} catch (NumberFormatException e) {
			System.out.println("Exception Occurs : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
	}
	
	private static void multiTask(String str, int number) {
		try {
			float result1 = 2000 / number;
			float result2 = str.length();
			float result3 = Integer.parseInt(str);
			System.out.println("Result 1 :> "+ result1);
			System.out.println("Result 2 :> "+ result2);
			System.out.println("Result 3 :> "+ result3);
		} catch (ArithmeticException e) {
			System.out.println("Exception Occurs : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Exception Occurs : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Exception Occurs : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
		
		
//		catch (Exception e) {
//			System.out.println("Exception Occurs : "+e.getClass());
//			System.out.println("Exception Message : "+e.getMessage());
//		}
		
	}
	
	private static void multiTask2(String str, int number) {
		try {
			float result1 = 2000 / number;
			float result2 = str.length();
			float result3 = Integer.parseInt(str);
			System.out.println("Result 1 :> "+ result1);
			System.out.println("Result 2 :> "+ result2);
			System.out.println("Result 3 :> "+ result3);
		} finally {
			System.out.println("Always execute !");
		}
	}
}

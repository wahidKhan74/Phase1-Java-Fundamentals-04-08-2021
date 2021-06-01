package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExPatternExample {

	public static void main(String[] args) {
		
		// one char match
		System.out.println(Pattern.matches(".m", "Ym"));  // true -> first char can be any value but 2nd char should be 'm'.
		System.out.println(Pattern.matches(".m", "Ymm"));  // false -> only two char are allowed.
		System.out.println(Pattern.matches(".m", "Yx"));  // false -> 2nd char should be 'm'.
		System.out.println(Pattern.matches("..m", "Ypm"));  // true -> 1st & 2nd can be any value but 3rd char should be 'm'.
		System.out.println(Pattern.matches("..m", "Ypx"));  // false -> 1st & 2nd can be any value but 3rd char should be 'm'.
		System.out.println(Pattern.matches("m.", "mY"));  // true -> first char should be 'm' & second can be any value.
		System.out.println(Pattern.matches("m.", "xY"));  // false -> first char should be 'm' & second can be any value.
		System.out.println(Pattern.matches("m..", "mYx"));  // true -> first char should be 'm' & second & third can be any value.
		System.out.println(Pattern.matches(".m.", "TmT"));  // true -> second char should be 'm' & first & third can be any value.
	}

}

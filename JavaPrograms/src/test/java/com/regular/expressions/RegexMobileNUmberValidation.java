package com.regular.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMobileNUmberValidation {

	/*
	 * Mobile Number validation criteria:
	 * 
	 * The first digit should contain number between 7 to 9. The rest 9 digit can
	 * contain any number between 0 to 9. The mobile number can have 11 digits also
	 * by including 0 at the starting. The mobile number can be of 12 digits also by
	 * including 91 at the starting
	 */

	public static void main(String[] args) {

//		String s = "917897897891";
		String s = "sureshreddy0506@gmail.com";
		System.out.println(isValid(s));
		

	}

	public static boolean isValid(String s) {
//		Pattern p = Pattern.compile("^(([+]?)(0|91))?[7-9][0-9]{9}");
//		"\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}\b"
		
//		"^([a-zA-Z0-9])[@]([a-zA-Z0-9])[.]([a-zA-Z])$"
		Pattern p = Pattern.compile("^[a-z0-9]+@[a-z]+[\\.][a-z]+");
		Matcher m = p.matcher(s);
		int count = 0;
		while(m.find())
			count= count +1;
		System.out.println(count/2);
		return (m.find());
	}
}

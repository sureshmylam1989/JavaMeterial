package com.regular.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveConsonants {

//	public static void main(String[] args) {
//		String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";
//		
//		System.out.println(str.replaceAll("[^aeiouAEIOU ]", ""));
//		
//		System.out.println(str.replaceAll("[aeiouAEIOU ]", ""));
//
//	}

	private static final String REGEX = "\\b";
	private static final String INPUT = "cat cat cat   cattie cat";

	public static void main(String args[]) {

		numberOfWords_java8();
//		Pattern p = Pattern.compile(REGEX);
//		Matcher m = p.matcher(INPUT); // get a matcher object
//		int count = 0;
//
//		while (m.find()) {
//			count++;
//			System.out.println("Match number " + count);
//			System.out.println("start(): " + m.start());
//			System.out.println("end(): " + m.end());
//		}
//		System.out.println("Match number " + count);
	}

	// Java8
	public static void numberOfWords_java8() {
		// Pattern \b will give the word boundaries
		Matcher matcher = Pattern.compile("\\b").matcher("How are you sdfsd   fdsfds fsdfdsf   fdfd  ");
		int counter = 0;
		while (matcher.find())
			counter++;
		System.out.println(counter / 2); // prints 7
	}

	// java9+
	public static void numberOfWords_java9() {
//		System.out.println(Pattern.compile("\\b").matcher("How are you sdfsd   fdsfds fsdfdsf   fdfd  ").results().count()/2);   
	}

}

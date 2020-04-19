package com.practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parentheses {

	static Map<Character, Character> mappings = new HashMap<Character, Character>();
	static {
		mappings.put('(', ')');
		mappings.put('[', ']');
		mappings.put('{', '}');
	}

	public static void main(String[] args) {
		System.out.println(isValid("(([)]{})"));
	}

	public static boolean isValid(String s) {

		Stack<Character> parenthesis = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mappings.containsKey(c)) {
				parenthesis.push(mappings.get(c));
			} else if (mappings.containsValue(c)) {
				if (parenthesis.isEmpty() || parenthesis.pop() != c) {
					return false;
				}
			}
		}
		return parenthesis.isEmpty();

//		if (s.length() == 0) {
//			return true;
//		}
//		if (s.length() % 2 != 0) {
//			return false;
//		}
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		HashMap<Character, Character> charMap = new HashMap<Character, Character>();
//		charMap.put('(', ')');
//		charMap.put('{', '}');
//		charMap.put('[', ']');
//		charMap.put(')', '(');
//		charMap.put('}', '{');
//		charMap.put(']', '[');
//		
//		char[] ch = s.toCharArray();
//		int end = ch.length;
//		if(ch[0]==charMap.get('(') || ch[0]==charMap.get('[') || ch[0]==charMap.get('{')) {
//			return false;
//		}
//		if(ch[end-1]==charMap.get(')') || ch[end-1]==charMap.get(']') || ch[end-1]==charMap.get('}')) {
//			return false;
//		}
//		
//		for (int i = 0; i < ch.length; i++) {
//			if (map.containsKey(ch[i])) {
//				map.put(ch[i], map.get(ch[i]) + 1);
//			} else {
//				map.put(ch[i], 1);
//			}
//		}
//
//		
//		int j = 0;
//		while (j < end) {
//			if (ch[j + 1] == charMap.get(ch[j]) || ch[end - 1] == charMap.get(ch[j])) {
//				if (ch[j + 1] != charMap.get(ch[j])) {
//					end = end - 1;		
//				} else {
//					j = j + 1;
//				}
//			} else {
//				return false;
//			}
//			j = j + 1;
//
//		}
//		return true;
	}
}

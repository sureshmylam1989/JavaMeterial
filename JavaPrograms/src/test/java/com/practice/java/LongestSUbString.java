package com.practice.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class LongestSUbString {

	public static void main(String[] args) {

		LongestSUbString lss = new LongestSUbString();
		System.out.println(lss.longSubString("abcabcdefbbqwbertzyubiopn"));

	}

	public int longSubString(String str) {
		int len = str.length();
		int subLen = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, i);
				if (map.keySet().size() > subLen) {
					subLen = subLen + 1;
				}
			} else {

				if (subLen < i - map.get(ch)) {
					subLen = i - map.get(ch);
				}
				int count = map.get(ch);
				if (subLen > i - map.get(ch)) {
					for (Iterator<Character> iterator = map.keySet().iterator(); iterator.hasNext();) {
						Character key = iterator.next();
						if (map.get(key) <= count) {
							iterator.remove();
						}
					}
				}
				map.put(ch, i);

			}

		}
		return subLen;
	}
}


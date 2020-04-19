package com.suresh.Java.practice;

import java.util.HashMap;
import java.util.Map;

public class TestPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPalindrom oClass = new TestPalindrom();
		String str1 = oClass.Longest("aabbssddeertfgh");
		System.out.println(str1);
	}

	public String Longest(String str) {
		if (str.length() == 0 || str == null) {
			return "";
		}
		StringBuffer oPalin = new StringBuffer();
		Map<Character, Integer> oHm = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			int totalChar = oHm.get(c) != null ? oHm.get(c) : 0;
			if ((totalChar + 1) % 2 == 0) {
				oPalin.append(c);
				oPalin = oPalin.insert(0, c);
				oHm.remove(c);

			} else {
				oHm.put(c, ++totalChar);
			}
		}

		if (oHm.size() > 0) {			
			String strCenter = oHm.entrySet().iterator().next().getKey().toString();
			oPalin = oPalin.insert(oPalin.length() / 2, strCenter);
			System.out.println(oPalin);
		}
		return oPalin.toString();

	}

}

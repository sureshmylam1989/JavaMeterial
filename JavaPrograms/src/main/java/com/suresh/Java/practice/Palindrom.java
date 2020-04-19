package com.suresh.Java.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Palindrom {
	public static void main(String args[]) {
		String strPali = "asdfghhhgfdsa";
		int lenght = strPali.length();
		for (int i = 0; i < lenght / 2; i++) {
			if (strPali.substring(0, 1).equalsIgnoreCase(strPali.substring(strPali.length() - 1, strPali.length()))) {
				strPali = strPali.substring(1, strPali.length() - 1);
			}
		}
		if (strPali.length() <= 1) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}
	}
}

package com.suresh.Java.practice;

import java.util.Hashtable;
import java.util.Set;

public class FindDuplicateChar {
	
	public String duplicate(String str) {
		if (str.length()<=1)
		return "no duplicates";
		
		Hashtable<Character, Integer> ht = new Hashtable<Character,Integer>();
		for(char c: str.toCharArray()) {
			int x = ht.get(c)!=null? ht.get(c):0;
			if(ht.containsKey(c)) {
				ht.put(c, x+1);
			}else {
				ht.put(c, 1);
			}			
		}
		
		Set<Character> s = ht.keySet();
		for(char a: s) {
			if(ht.get(a)>0) {
				System.out.println(a+" has "+ ht.get(a));
			}
		}	
		
		return str;		
	}

	public static void main(String[] args) {
		FindDuplicateChar dup = new FindDuplicateChar();
		dup.duplicate(new String("qrwqerewfsfcfsafasdfegadgfdsfasdgd"));
		
	}

}

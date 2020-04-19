package com.coding;

import java.util.Hashtable;

public class HasTable_countrepetiveWords {

	public static void main(String[] args) {
		String str = "we are doing good and we are not doing good";
	
		Hashtable<String, Integer> oHT = new Hashtable<String,Integer>();
		String[] st = str.split(" ");
		int len = st.length;
		for(int i=0;i<len;i++) {
			if(oHT.containsKey(st[i])) {
				oHT.put(st[i], oHT.get(st[i])+1);
			}else {
				oHT.put(st[i], 1);
			}
		}

		System.out.println(oHT);
	}

}

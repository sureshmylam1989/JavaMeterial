package com.practice.java;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoin();
		StringMerge();

	}
	
	public static void StringMerge() {
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
        
        // Adding values to StringJoiner  
        joinNames.add("suresh");  
        joinNames.add("kumar");  
        System.out.println(joinNames); 
  
        // Creating StringJoiner with :(colon) delimiter  
        StringJoiner joinNames2 = new StringJoiner(":", "(", ")");  // passing colon(:) and square-brackets as delimiter   
          
        // Adding values to StringJoiner  
        joinNames2.add("ramesh");  
        joinNames2.add("mahesh"); 
        System.out.println(joinNames2); 
  
        // Merging two StringJoiner  
        StringJoiner merge = joinNames2.merge(joinNames);   
        System.out.println(merge); 
	}
	
	
	
	public static String StringJoin() {
		StringJoiner sj = new StringJoiner(",","[","]");
		sj.add("s");
		sj.add("u");
		sj.add("r");
		
		System.out.println(sj);
		System.out.println(sj.toString());
		
		return sj.toString();
		
	}

}

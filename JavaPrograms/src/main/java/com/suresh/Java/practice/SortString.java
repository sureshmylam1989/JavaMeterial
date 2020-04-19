package com.suresh.Java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SortString {
		static String str = "aabccqaaa";
		static int counter = 1;
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				char[] arr = str.toCharArray();
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<arr.length;i++){
					if(arr.length==i+1){
						sb.append(arr[i]).append(counter);
						break;
					}		
					if(arr[i] == arr[i+1]){
						counter++;
					}else{
						sb.append(arr[i]).append(counter);
						counter = 1;
					}
				}
				System.out.println(sb.toString());
				
			}
	
	
	

}

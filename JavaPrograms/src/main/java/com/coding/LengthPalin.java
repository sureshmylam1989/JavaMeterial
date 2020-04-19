package com.coding;

import java.util.HashMap;
import java.util.Map;

public class LengthPalin {
	
	/*
	 * Construct Longest palindrome from the given string
	 */
	 public String longestPalindrome(String s) {
	        if(s==null)
	            return "";
	        
	        String palin= null;
	        
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        StringBuffer sb = new StringBuffer();
	        
	        char[] arr = s.toCharArray();
	        
	        for(char c: arr){
	            if(map.containsKey(c)){
	                sb.append(c);
	                sb.insert(0,c);
	                map.remove(c);
	            }else{
	                map.put(c,1);
	            }            
	        }
	        char str = 0 ;
	        if(map.size()<=1){
	            str = map.entrySet().iterator().next().getKey();
	        }
	        
	        palin = sb.insert(sb.length()/2,str).toString();
	        return sb.toString();
	        
	        
	    }
	    
	    public static void main(String[] args){
	        String str = "babad";
	        LengthPalin s = new LengthPalin();
	        System.out.println(s.longestPalindrome(str));
	    }

}

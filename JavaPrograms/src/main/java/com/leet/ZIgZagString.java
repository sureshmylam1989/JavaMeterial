package com.leet;

import java.util.ArrayList;
import java.util.List;

public class ZIgZagString {
	
	
public String convert(String s, int numRows) {
        
        if(s.length()<=numRows)
            return s;
        
        List<StringBuilder> l = new ArrayList<StringBuilder>();
        for(int i=0;i<numRows;i++){
            l.add(new StringBuilder());
        }
        int cr = 0;
        boolean gd = false;
        for(char c: s.toCharArray()){
            l.get(cr).append(c);
            if(cr==0||cr==numRows-1){
                gd=!gd;
            }
            if(gd){
                cr=cr+1;
            }else{
                cr=cr-1;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int j=0;j< numRows;j++){
           sb.append(l.get(j));
        }
        return sb.toString();        
    }
    

//	public String convert(String s, int numRows) {
//
//        if (numRows == 1) return s;
//
//        List<StringBuilder> rows = new ArrayList<>();
//        for (int i = 0; i < Math.min(numRows, s.length()); i++)
//            rows.add(new StringBuilder());
//
//        int curRow = 0;
//        boolean goingDown = false;
//
//        for (char c : s.toCharArray()) {
//            rows.get(curRow).append(c);
//            if (curRow == 0 || curRow == numRows - 1) {
//            	goingDown = !goingDown;
//            }
//            curRow += goingDown ? 1 : -1;
//        }
//
//        StringBuilder ret = new StringBuilder();
//        for (StringBuilder row : rows) ret.append(row);
//        return ret.toString();
//    }

	public static void main(String[] atgs) {
		ZIgZagString zz = new ZIgZagString();
		System.out.println(zz.convert("PAYPALISHIRING", 4));
	}
}

package com.suresh.Java.practice;

import java.io.File;
import java.util.List;

public class PrintDirectory {


	public static void main(String[] args) {
		String filePath = "C:\\Users\\Suresh Mylam\\git\\qa_autotest_judi\\src\\test\\resources\\Results";
		print(filePath);
		
		
	}
	
	public static void print(String filePath) {
		File f = new File(filePath);
		File[] len = f.listFiles();
		for(File fi : len) {
			if(fi.isDirectory()) {
				System.out.println(fi.getName());
				print(fi.getAbsolutePath());
			}else if(fi.isFile()){
				System.out.println(fi.getName());				
			}
		}		
	}

}

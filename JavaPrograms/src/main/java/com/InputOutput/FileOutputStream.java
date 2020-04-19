package com.InputOutput;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class FileOutputStream {

	public static void main(String[] args) {
		try {
			String filePath = "\\JavaPrograms\\FIles\\Test.txt";
			String filePath2 = "\\JavaPrograms\\FIles\\Test2.txt";

			/*
			 * //FileOutPutStream java.io.FileOutputStream fos = new
			 * java.io.FileOutputStream(filePath); String str = "qwwerty"; byte[] b =
			 * str.getBytes(); fos.write(b); fos.close();
			 */

			/*
			 * //FileInputStream FileInputStream fis = new FileInputStream(filePath); int
			 * i=0; while ((i=fis.read())!= -1) { System.out.print((char)i); } fis.close();
			 */

			/*
			 * //BufferedOutputStream java.io.FileOutputStream fos = new
			 * java.io.FileOutputStream(filePath); BufferedOutputStream bos = new
			 * BufferedOutputStream(fos); String str = "qqwertyuiop"; byte[] b =
			 * str.getBytes(); bos.write(b); bos.flush(); bos.close(); fos.close();
			 */

			/*
			 * //BufferedInputtream File of = new File(filePath); FileInputStream fis = new
			 * FileInputStream(of); BufferedInputStream bis = new BufferedInputStream(fis);
			 * int i; while((i=bis.read())!=-1){ System.out.print((char)i); } bis.close();
			 * fis.close();
			 */

			/*
			 * //SequenceInputStream FileInputStream fis1 = new FileInputStream(new
			 * File(filePath)); FileInputStream fis2 = new FileInputStream(new
			 * File(filePath2)); SequenceInputStream sis = new SequenceInputStream(fis1,
			 * fis2); int j; while((j=sis.read())!=-1) { System.out.print((char)j); }
			 * sis.close(); fis2.close(); fis1.close();
			 */

			/*// SequenceInputStream with Enumeration
			FileInputStream fis1 = new FileInputStream(new File(filePath));
			FileInputStream fis2 = new FileInputStream(new File(filePath2));
			FileInputStream fis3 = new FileInputStream(new File(filePath));
			FileInputStream fis4 = new FileInputStream(new File(filePath2));

			Vector<FileInputStream> vec = new Vector<FileInputStream>();
			vec.add(fis1);
			vec.add(fis2);
			vec.add(fis3);
			vec.add(fis4);

			Enumeration<FileInputStream> e = vec.elements();
			SequenceInputStream sis = new SequenceInputStream(e);
			int j;
			while ((j = sis.read()) != -1) {
				System.out.print((char) j);
			}
			sis.close();*/
			
			Console c = System.console();
			System.out.println("enter username :");
			Thread.sleep(5000);
			 char[] text = c.readPassword();
			System.out.println(String.valueOf(text));
			
		} catch (Exception e) {
			System.out.println("exception :" + e.getMessage());
		}

	}

}

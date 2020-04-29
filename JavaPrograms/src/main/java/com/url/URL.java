package com.url;

import java.io.InputStream;
import java.net.URLConnection;

public class URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			java.net.URL url = new java.net.URL("https://test05.agmednet.net/#!/login");

			URLConnection urlcon=url.openConnection();  
			InputStream stream=urlcon.getInputStream();  
			int i;  
			while((i=stream.read())!=-1){  
			System.out.print((char)i);  
			}  
			}catch(Exception e){System.out.println(e);}
	}

}

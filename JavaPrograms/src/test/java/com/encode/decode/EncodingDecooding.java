package com.encode.decode;

import java.util.Base64;

public class EncodingDecooding {

	public static void main(String[] args) {
		String base64format = Base64.getEncoder().encodeToString("suresh".getBytes());
		System.out.println(base64format);
		
		byte[] base64decode = Base64.getDecoder().decode("c3VyZXNo");
		String dec = new String(base64decode);
		System.out.println(dec);

	}

}

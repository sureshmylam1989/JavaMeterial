package com.json.delphix.interview;


import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import bsh.Parser;

public class JsonObject {

	public static void main(String[] args) {
		// Create JSON Object
		JSONObject obj = new JSONObject();
		ArrayList<JSONObject> al = new ArrayList<JSONObject>();
		JSONObject obj1 = new JSONObject();
		obj1.put("name", "Suresh");
		obj1.put("age", 31);
		JSONObject obj2 = new JSONObject();
		obj2.put("name", "Kumar");
		obj2.put("age", 26);
		JSONObject obj3 = new JSONObject();
		obj3.put("name", "Mylam");
		obj3.put("age", 1);
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		obj.put("family", al);
		System.out.println(obj.toString());

		// Read JSON Object
		String json = obj.toString();
		JSONObject j1 = new JSONObject(json);
//		JSONObject res = (JSONObject)j1.getJSONObject("family");
		JSONArray ja = new JSONArray();
		ja =  (JSONArray) j1.get("family");	
		ArrayList<JSONObject> alObj = new ArrayList<JSONObject>();
		
		for (int i = 0; i < ja.length(); i++) {
			alObj.add((JSONObject)ja.get(i));		
//			System.out.println(ja.get(i));
		}
		for (int j = 0; j < alObj.size(); j++) {
			System.out.println(alObj.get(j).get("name"));
		}
		

	}
}

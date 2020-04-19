package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	// https://www.javatpoint.com/java-arraylist
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(15);
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add(2, "suresh");
		list.add("Suresh");

		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println(list);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ajay");
		list2.add("Vijay");

		list.addAll(2, list2);
		System.out.println(list);
		list.set(1, "set");
		System.out.println(list);

//	      System.out.println(list.get(2));
//	      
//	      System.out.println(list.lastIndexOf("Ajay"));
//	      
//	      list.retainAll(list2);
//	      System.out.println(list);

	}

}

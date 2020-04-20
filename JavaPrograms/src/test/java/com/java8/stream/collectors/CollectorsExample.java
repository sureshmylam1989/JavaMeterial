package com.java8.stream.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();

		// Adding products to list
		list.add(new Product(1, "iPhone", 101.0f));
		list.add(new Product(2, "Samsung", 200.0f));
		list.add(new Product(3, "Sony", 100.0f));
		list.add(new Product(4, "Sony", 102.0f));

		// Retrieving the product names and storing into Set
		Set<String> priceList = list.stream().map(x -> x.name).collect(Collectors.toSet());
		System.out.println("Product names in the set : " + priceList);

		// Sum of all the IDs using ---> "summingInt"
		int sumofID = list.stream().collect(Collectors.summingInt(x -> x.id));
		System.out.println("Sum of all the product IDs : " + sumofID);

		// Sum of all the IDs ---> "summingDouble"
		Double sumofPrice = list.stream().collect(Collectors.summingDouble(x -> x.price));
		System.out.println("Sum of all the product price : " + sumofPrice);

		// Number of products from in the list
		System.out.println("Number of products in the list : " + list.stream().count());

		// Number of elements accepting of type
		Long count = list.stream().collect(Collectors.counting());
		System.out.println("NUmber of elements " + count);

		// Store the product names into list<String> if the price is >=102.0f and id is
		// >=1 using Stream and Lambda
		List<String> names = list.stream().filter(p -> p.price >= 102.0f).filter(p -> p.id >= 1).map(p -> p.name)
				.collect(Collectors.toList());
		System.out.println("List of products of price >= given price and id is>= given id : " + names);

		// sum of the price of the products, if the product price is >=100.0f using
		// Stream and Lambda
		double priceCount = list.stream().filter(p -> p.price > 100.0f).collect(Collectors.summingDouble(p -> p.price));
		System.out.println("SUm of the product prices on the given condition : " + priceCount);

		// Finding the product whose price is Maximum
		Product pa = list.stream().max((product1, product2) -> product1.price < product2.price ? 1 : -1).get();
		System.out.println("Maximum priced product : " + pa.price);

		// Number of products, which are >= given condition
		int countProd = (int) list.stream().filter(p -> p.price >= 101).count();
		System.out.println("Number of products for the given filter condition : " + countProd);

		// Store the product names(using map(p->p.name)) into set based on the filter
		// condition
		Set<String> sf = list.stream().filter(p -> p.price < 200).map(p -> p.name).collect(Collectors.toSet());
		System.out.println("Product names matching for the filter  : " + sf);

		// Method referencing for the above example, Intead of Lambda expression , we
		// use Product::getName which refers the method
		Set<String> sf_mr = list.stream().filter(p -> p.price < 200).map(Product::getName).collect(Collectors.toSet());
		System.out.println("Method referencing --> Product names matching for the filter  :" + sf_mr);

		// Storing the products into map using the ID as KEY and Name as VALUE
		Map<Integer, String> map = list.stream().filter(p -> p.price < 200)
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println("Map contains : " + map);

		/*
		 * Now lets look at the below example to deal with List<String>
		 */

		// Add strings into List
		List<String> ls = new ArrayList<String>();
		ls.add("Windows");
		ls.add("Linux");
		ls.add("Ubuntu");
		ls.add("Ubuntu_duplicate");
		ls.add("iOS");

		System.out.println("Any match for the given condition : " + ls.stream().anyMatch(p -> p.startsWith("Win")));

		// Find all the values, if it starts with given condition and store them into
		// Set
		Set<String> names2 = ls.stream().filter(p -> p.startsWith("Ubuntu")).map(p -> p.toString())
				.collect(Collectors.toSet());
		System.out.println("values which are matched/ started with given condition : " + names2);

	}

}

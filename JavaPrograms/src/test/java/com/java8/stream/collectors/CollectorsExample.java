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

		list.add(new Product(1, "Dell", 101.0f));
		list.add(new Product(2, "Lenovo", 200.0f));
		list.add(new Product(3, "HP", 100.0f));
//		
		Set<String> priceList = list.stream().map(x->x.name).collect(Collectors.toSet());
		System.out.println(priceList);
//		
		int sum = list.stream().collect(Collectors.summingInt(x -> x.id));
		System.out.println(sum);
//		
		System.out.println(list.stream().count());

		Long count = list.stream().collect(Collectors.counting());
		System.out.println(count);

		List<String> names = list.stream().filter(p -> p.price >= 100.0f).filter(p -> p.id >= 1).map(p -> p.name)
				.collect(Collectors.toList());
		System.out.println(names);

		double priceCount = list.stream().filter(p -> p.price > 100.0f).collect(Collectors.summingDouble(p -> p.price));
		System.out.println(priceCount);

		Product pa = list.stream().max((product1, product2) -> product1.price < product2.price ? 1 : -1).get();
		System.out.println(pa.price);

		int countProd = (int) list.stream().filter(p -> p.price >= 101).count();
		System.out.println(countProd);

		Set<String> sf = list.stream().filter(p -> p.price < 200).map(p -> p.name).collect(Collectors.toSet());
		System.out.println(sf);
		// Method referencing
		Set<String> sf_mr = list.stream().filter(p -> p.price < 200).map(Product::getName).collect(Collectors.toSet());
		System.out.println("Method referencing" + sf_mr);

		Map<Integer, String> map = list.stream().filter(p -> p.price < 200)
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(map);

		List<String> ls = new ArrayList<String>();
		ls.add("Suresh");
		ls.add("kumar");
		ls.add("kumar2");
		ls.add("Advik");

		System.out.println(ls.stream().anyMatch(p -> p.startsWith("Sur")));
		Set<String> names2 = ls.stream().filter(p -> p.startsWith("muneetha")).map(p -> p.toString())
				.collect(Collectors.toSet());
		System.out.println(names2);

	}

}

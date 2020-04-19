package com.staticNestedClass;

public class StaticNestedClass {
	
	static String str ="Suresh";
	private int x=123;
	int y=456;
	
	static class abcd{
		void dis(){
			StaticNestedClass dfg = new StaticNestedClass();
//			System.out.println(dfg.y);
			System.out.println(str);
//			System.out.println(x);
//			System.out.println(y);
		}
	}

}

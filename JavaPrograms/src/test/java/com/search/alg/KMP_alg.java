package com.search.alg;

public class KMP_alg {

	public static void main(String[] args) {
		String str = "abcxabcdabcdabcy";
		String subString = "bcdabcdab";
		KMP_alg ss = new KMP_alg();
		boolean result = ss.KMP(str.toCharArray(), subString.toCharArray());
		System.out.print(result);
	}

	public boolean KMP(char[] text, char[] pattern) {
		int[] c = createCompiledArray(pattern);
		int i=0;
		int j=0;
		while(i<text.length&& j<pattern.length) {
			if(text[i]==pattern[j]) {
				i++;
				j++;
			}else {
				if(j!=0) {
					j=c[j-1];
				}else {
					i++;
				}
				
			}
		}
		if(j==pattern.length)
			return true;
		
		return false;
	}

	public int[] createCompiledArray(char[] p) {
		int len = p.length;
		int i = 0;
		int[] a = new int[len];
		int j = 1;
		while (j < len) {
			if (p[i] == p[j]) {
				a[j] = i + 1;
				j = j + 1;
				i = i + 1;
			} else {
				if (i != 0) {
					i = a[i - 1];

				} else {
					a[j] = 0;
					j++;
				}
			}
		}
		return a;

	}

}

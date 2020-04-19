package com.cirrusLogic.Interview;

public class BinaryPeriod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryPeriod bp = new BinaryPeriod();
		System.out.println(bp.solution(955));
	}
	
	int solution(long n) {
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = (int)n % 2;
            n /= 2;
            l++;
        }
        for (p = 1; p < 1 + l; ++p) {
            int i;
            boolean ok = true;
            for (i = 0; i < l - p; ++i) {
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return p;
            }
        }
        return -1;
    }

}

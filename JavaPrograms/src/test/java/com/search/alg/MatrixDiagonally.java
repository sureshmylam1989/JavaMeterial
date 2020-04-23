package com.search.alg;

public class MatrixDiagonally {

	public static void main(String[] args) {

		char[][] matrix = { { 'a', 'b', 'c', 'd', 'e' }, { 'g', 'h', 'i', 'j', 'k' }, { 'l', 'm', 'n', 'o', 'p' },
				{ 'q', 'r', 's', 't', 'u' }, };
		printMatrixDiagonally(matrix);
	}

	public static void printMatrixDiagonally(char[][] M) {
		int m = M.length;
		int n = M[0].length;
		// printing them from row side
		for (int x = 0; x < m; x++) {
			int i = x;
			int j = 0;
			while (i >= 0) {
				System.out.print(M[i][j]);
				i--;
				j++;
			}
			System.out.println();
		}
		// printing them from col side
		for (int y = 1; y < n; y++) {
			int i = m - 1;
			int j = y;
			while (j < n) {
				System.out.print(M[i][j]);
				i--;
				j++;
			}
			System.out.println();
		}

	}

}

package search;

import java.util.Scanner;

public class T1 {

	static int max = 0;
	static int tm = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] a = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j]=s.nextInt();
				
			}
		}
		s.close();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				tm = 0;
				if (a[i][j] == 1) {
					a[i][j] = 2;
					tm++;
					t(a, i - 1, j - 1, m, n);
					t(a, i - 1, j, m, n);
					t(a, i - 1, j+1, m, n);
					t(a, i + 1, j, m, n);
					t(a, i + 1, j + 1, m, n);
					t(a, i + 1, j-1, m, n);
					t(a, i, j + 1, m, n);
					t(a, i, j - 1, m, n);
					if (tm > max) {
						max = tm;
					}
				}

			}
		}
		System.out.println(max);
	}

	private static void t(int[][] a, int i, int j, int m, int n) {

		if (i < 0 || j < 0 || i >= m || j >= n || a[i][j] != 1) {
			return;
		} else {
			a[i][j]=2;
			tm++;
			t(a, i - 1, j - 1, m, n);
			t(a, i - 1, j, m, n);
			t(a, i - 1, j+1, m, n);
			t(a, i + 1, j, m, n);
			t(a, i + 1, j + 1, m, n);
			t(a, i + 1, j-1, m, n);
			t(a, i, j + 1, m, n);
			t(a, i, j - 1, m, n);
		}

	}
}
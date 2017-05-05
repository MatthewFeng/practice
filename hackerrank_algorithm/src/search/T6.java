package search;

import java.util.Scanner;

public class T6 {

	static int tm = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int z = 0; z < t; z++) {

			int m = s.nextInt();
			int n = s.nextInt();
			char[][] a = new char[m][n];

			int x = -1;
			int y = -1;
			s.nextLine();
			for (int i = 0; i < m; i++) {
				a[i] = s.nextLine().toCharArray();

			}

			int k = s.nextInt();
			boolean find = false;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i][j] == 'M') {
						x = i;
						y = j;
						break;
					}

				}
				if (find)
					break;
			}

			int c = 0;
			if (count(a, x, y, m, n) > 1)
				c++;

			tm = t(a, x - 1, y, m, n, c) + t(a, x + 1, y, m, n, c) + t(a, x, y + 1, m, n, c) + t(a, x, y - 1, m, n, c);
			if (tm == k) {
				System.out.println("Impressed");
			} else {
				System.out.println("Oops!");
			}
		}
		s.close();
	}

	private static int count(char[][] a, int i, int j, int m, int n) {

		return counts(a, i - 1, j, m, n) + counts(a, i + 1, j, m, n) + counts(a, i, j + 1, m, n)
				+ counts(a, i, j - 1, m, n);

	}

	private static int counts(char[][] a, int i, int j, int m, int n) {
		if (i < 0 || j < 0 || i >= a.length || j >= n || a[i][j] != '.') {
			return 0;
		}
		return 1;
	}

	private static int t(char[][] a, int i, int j, int m, int n, int c) {

		if (i < 0 || j < 0 || i >= m || j >= n || a[i][j] == 'X' || a[i][j] == 'M') {
			return 0;
		} else {

			if (a[i][j] == '*')
				return c;

			if (count(a, i, j, m, n) > 1)
				c++;

			a[i][j] = 'X';

			return t(a, i - 1, j, m, n, c) + t(a, i + 1, j, m, n, c) + t(a, i, j + 1, m, n, c)
					+ t(a, i, j - 1, m, n, c);
		}

	}
}
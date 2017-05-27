package graph;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] w = new int[n + 1][n + 1];

		for (int i = 1; i < w.length; i++) {
			for (int j = 1; j < w[i].length; j++) {
				if (i != j) {
					w[i][j] = -1;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int r = sc.nextInt();

			w[a][b] = r;

		}

		floyd(w);

		int q = sc.nextInt();
		while (q-- > 0) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			System.out.println(w[i][j]);
		}
		sc.close();

	}

	private static void floyd(int[][] w) {
		for (int k = 1; k < w.length; k++) {
			for (int i = 1; i < w.length; i++) {
				for (int j = 1; j < w.length; j++) {
					// int p = w[i][j];
					// if (i == 1 && j == 2) {
					//// System.out.println(p);
					// }
					if (!(w[i][k] < 0 || w[k][j] < 0)) {
						int t = w[i][k] + w[k][j];
						if (w[i][j] > t||w[i][j]<0) {
							w[i][j] = t;
						}
					}
				}
			}
		}
	}
}

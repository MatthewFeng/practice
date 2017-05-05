package matrixRotation;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int r = in.nextInt();
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
			}
		}

		int[][] b = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int k = Math.min(Math.min(i, m - i - 1), Math.min(j, n - j - 1));
				int p = 2 * (m - 2 * k + n - 2 * k) - 4;
				int inc = r % p;

				int x = i;
				int y = j;
				while (inc > 0) {
					if (y == k && x != m - k - 1) {
						x++;
					} else if (x == m - k - 1 && y != n - k - 1) {
						y++;
					} else if (y == n - k - 1 && x != k) {
						x--;
					} else if (x == k && y != k) {
						y--;
					}
					inc--;
				}

				b[x][y] = a[i][j];
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		in.close();

	}
}
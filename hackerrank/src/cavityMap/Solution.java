package cavityMap;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		char[][] m = new char[n][n];
		for (int i = 0; i < n; i++) {
			m[i] = in.next().toCharArray();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.print(m[i][j]);
				} else {
					char c = m[i][j];
					if (c > m[i - 1][j] && c > m[i][j - 1] && c > m[i + 1][j] && c > m[i][j + 1]) {
						System.out.print('X');
					} else {
						System.out.print(c);
					}
				}
			}
			System.out.println();
		}

		in.close();

	}
}
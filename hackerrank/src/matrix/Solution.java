package matrix;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			// tÂÖ²âÊÔ
			boolean flag = true;
			int r = in.nextInt();
			int c = in.nextInt();
			char p[][] = new char[r][c];
			for (int x = 0; x < r; x++) {
				String s = in.next();
				p[x] = s.toCharArray();
			}


			int m = in.nextInt();
			int n = in.nextInt();
			char[][] q = new char[m][n];
			for (int x = 0; x < m; x++) {
				q[x] = in.next().toCharArray();
			}

		
			for (int a = 0; a <= r - m; a++) {
				for (int b = 0; b <= c - n; b++) {
					 flag = true;
					for (int e = 0; e < m; e++) {
						for (int f = 0; f < n; f++) {
							if (p[a + e][b + f] != q[e][f]) {
								flag = false;
								break;
							}
						}
						if (!flag) {
							break;
						}
					}

					if (flag) {
						break;
					}

				}
				if (flag) {
					break;
				}
			}

			if (flag == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
		in.close();

	}
}
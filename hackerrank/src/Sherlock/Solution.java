package Sherlock;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int[] a = new int[l];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();

		}

		for (int i = 0; i < l; i++) {
			int n = a[i];

			if (n == 1 || n == 2 || n == 4 || n == 7) {
				System.out.println(-1);
				continue;
			}

			int k = n / 3;// 15µÄ±¶Êý
			int m = n % 3;

			StringBuffer sb = new StringBuffer();
			if (m == 0) {
				for (int j = 0; j < n; j++) {
					sb.append(5);
				}
				System.out.println(sb);
			} else if (m == 1) {
				for (int j = 0; j < (k - 2) * 3; j++) {
					sb.append(5);
				}
				System.out.println(sb.append("3333333333"));

			} else if (m == 2) {
				for (int j = 0; j < (k - 1) * 3; j++) {
					sb.append(5);
				}
				System.out.println(sb.append("33333"));
			}

		}
		in.close();
	}

}

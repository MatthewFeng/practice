package strings.thetLovetLettertMystery;

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
		in.nextLine();
		for (int i = 0; i < t; i++) {
			String s = in.nextLine();
			char[] a = s.toCharArray();

			int l = 0;
			int h = a.length - 1;
			int count = 0;
			while ((l < h)) {
				if (a[l] > a[h]) {
					count = count + a[l] - a[h];
				} else {
					count = count + a[h] - a[l];
				}
				l++;
				h--;
			}
			System.out.println(count);

		}

		in.close();

	}
}
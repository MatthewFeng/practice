package chocolateFeast;

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
			int r = 0;
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();

			int a = n / c;
			r = r + a;
			int k = a;
			while (k >= m) {
				int p=k/m;
				r = r + p;
				k = p+ k % m;
			}

			System.out.println(r);

		}
		in.close();

	}
}
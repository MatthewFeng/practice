package diagonal;

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


		int a = 0;
		int b = 0;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				int t = in.nextInt();
				if (i == j) {
					a = a + t;
				}
				if ((i + j) == (l - 1)) {
					b = b + t;
				}
			}

		}
		System.out.println(Math.abs(a-b));
		in.close();

	}
}
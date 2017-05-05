package strings.alternatingCharacters;

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
		for (int j = 0; j < t; j++) {

			String s = in.nextLine();
			char[] a = s.toCharArray();
			int count = 0;
			char p = a[0];
			for (int i = 1; i < a.length; i++) {
				if (p == a[i]) {
					count++;
				} else {
					p = a[i];
				}
			}
			System.out.println(count);
		}
		in.close();

	}
}
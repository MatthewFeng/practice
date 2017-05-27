package encryption;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution..
		 */

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int l = s.length();

		int r = (int) Math.floor(Math.sqrt(l));
		int c = (int) Math.ceil(Math.sqrt(l));
		if (r*c<l){
			r++;
		}

		char[] a = s.toCharArray();

		for (int j = 0; j < c; j++) {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < r; i++) {
				int k = i * c + j;
				if (k < l) {
					sb.append(a[k]);
				}
			}
			System.out.print(sb.toString() + " ");

		}

		in.close();

	}
}

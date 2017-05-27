package sum;

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
		long r = 0;
		for (int i = 0; i < l; i++) {
			r = r + in.nextInt();

		}
		System.out.println(r);
		in.close();

	}
}
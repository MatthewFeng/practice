package squares;

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
			int c=0;
			int l=in.nextInt();
			int h=in.nextInt();
			
				double a= Math.sqrt(l);
				double b= Math.sqrt(h);
				int m=(int)Math.ceil(a);
				int n=(int)Math.floor(b);
			System.out.println(n-m+1);
		}
		in.close();

	}
}
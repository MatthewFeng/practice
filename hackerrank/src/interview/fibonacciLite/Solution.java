package interview.fibonacciLite;

import java.io.*;
import java.util.*;


/**
 * 
 * @author Matthew Feng
 *
 */
public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		System.out.println(f(t));
		
	
		in.close();

	}

	private static int f(int t) {
		if (t==0) return 0;
		if (t==1) return 1;
		return f(t-1)+f(t-2);
		
	}
}
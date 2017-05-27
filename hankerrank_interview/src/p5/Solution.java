package p5;

import java.io.*;
import java.util.*;

/**
 * 
 * @author Matthew Feng
 *
 */
public class Solution {

	private static int B;
	private static int H;
	private static boolean flag = true;

	static {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		B = in.nextInt();
		H = in.nextInt();

		in.close();
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}

		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}

	public static void main(String[] args) {

	}// end of main

}// end of class

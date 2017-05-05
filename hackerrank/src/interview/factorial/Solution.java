package interview.factorial;

import java.io.*;
import java.math.BigInteger;
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
		
		BigInteger r=new BigInteger("1");
		
		for (int i=1;i<=t;i++){
			r=r.multiply(new BigInteger(""+i));
		}
		System.out.println(r);
		
		
	
		in.close();

	}
}
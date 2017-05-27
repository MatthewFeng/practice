package interview.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;


/**
 * 
 * @author Matthew Feng
 *
 */
public class Solution {
	
	public static BigInteger [] a= new BigInteger [100]; 

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		
		a[0]=new BigInteger("0");
		a[1]=new BigInteger("1");
		for (int i=2;i<a.length;i++){
			a[i]=a[i-1].add(a[i-2]);
		}

		Scanner in = new Scanner(System.in);
		
		
		while (in.hasNextLine()){
			
			int t = in.nextInt();
			System.out.println(a[t]);
		}
		
	
		in.close();

	}

}
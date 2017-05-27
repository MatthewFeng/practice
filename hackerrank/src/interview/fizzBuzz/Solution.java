package interview.fizzBuzz;

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
		for (int i=1;i<=t;i++){
			String  r=""+i;
			if (i%15==0){
				r="FizzBuzz";
			}else if(i%3==0){
				r="Fizz";
			}else if (i%5==0){
				r="Buzz";
			}
			System.out.println(r);
		}
		
	
		in.close();

	}
}
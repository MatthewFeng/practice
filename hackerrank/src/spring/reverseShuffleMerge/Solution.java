package spring.reverseShuffleMerge;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		String  s = in.next();
		
		int [] a=new int[26];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=0;
		}

		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i)-'a']++;
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i]=a[i]/2;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
		}
		
		
	
		in.close();

	}
}
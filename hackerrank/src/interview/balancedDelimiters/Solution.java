package interview.balancedDelimiters;

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
		String s = in.nextLine();

		boolean flag = true;
		
		char[] a=new char[s.length()];
		int cur=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			switch (c) {
			case '(':
				a[cur++]='(';
				break;
			case '[':
				a[cur++]='[';
				break;
			case '{':
				a[cur++]='{';
				break;
			case ')':
				
				if (cur>0 &&a[--cur]=='(' ){
				}else{
					flag=false;
				}
				break;
			case ']':
				if (cur>0 &&a[--cur]=='[' ){
				}else{
					flag=false;
				}
				break;
			case '}':
				if (cur>0 &&a[--cur]=='{' ){
				}else{
					flag=false;
				}
				break;
			}
			
			 if(!flag) break;

		}

		
		if (flag&&cur==0){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		in.close();

	}
}
package strings.gameofThrones;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		String  s = in.nextLine();
		int[] m=new int [26];
		
		for (int i =0;i<s.length();i++){
			m[s.charAt(i)-'a']++;
		}
		
		int count=0;
		for (int c:m){
			if(c%2==1){
				count++;
			}
		}
		if (count>1){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
		
	
		in.close();

	}
}
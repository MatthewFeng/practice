package tree;

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
		for (int i = 0; i < l; i++) {
			long h = 1;
			int n= in.nextInt();

			for(int j=0;j<n;j++){
				if (j%2==0){
					h=h*2;
				}else{
					h=h+1;
				}
			}
			
			System.out.println(h);
		}
		in.close();
	}
}
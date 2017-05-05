package findDigits;

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
			int c=0;
			int n=in.nextInt();
			
			int x=n;
			int y=x%10;
			while (x!=0){
				if ((y!=0)&&(n%y==0)){
					c++;
				}
				x=x/10;
				y=x%10;
			}
			
			System.out.println(c);

		}
		in.close();

	}
}
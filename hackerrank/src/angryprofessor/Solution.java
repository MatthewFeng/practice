package angryprofessor;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		
//		2
//		4 3
//		-1 -3 4 2

		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		
		int n;
		int k;
		
		for (int i = 0; i < l; i++) {
			boolean flag=false;
			n=in.nextInt();
			k=in.nextInt();
			int c=0;//上课的人数
			for (int j=0;j<n;j++){
				if (in.nextInt() <= 0){
					c++;
				}
			}
			
			if (c< k){
				flag=true;
			}
			
			if(flag){
				
				System.out.println("YES");
			}else{
				System.out.println("NO");
				
			}
			

		}
		
		in.close();

	}
}
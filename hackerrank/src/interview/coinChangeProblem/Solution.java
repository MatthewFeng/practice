package interview.coinChangeProblem;

import java.io.*;
import java.util.*;


/**
 * 
 * @author Matthew Feng
 *
 */
public class Solution {
	
	
	public static HashMap h=new HashMap();
	
	public static long change(int include,int total,int[] a,int k){
		 Object o=h.get(""+include+":"+total+":"+k);
		 if (o!=null){
			 return ((Long)o).longValue();
		 }
		
		if (total ==include) return 1;
		if (total < include) return 0;
		
		long r=0;
		for (int i=k;i<a.length;i++){
			long t =change(a[i],total-include,a,i);
			r=r+t;
		}
		h.put(""+include+":"+total+":"+k, r);
		return r;
		
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		int n=in.nextInt();
		int[] a=new int [n];
		for (int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		long r=0;
		for(int i=0;i<a.length;i++){
			
			long t =change(a[i],total,a,i);
			r=r+t;
		}
		
		System.out.println(r);
	
		in.close();

	}
}
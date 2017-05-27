package consecutivePrimeSum;

import java.io.*;
import java.util.*;

/**
 * 
 * @author Matthew Feng
 *
 */
public class Solution {

	
	public static HashSet<Integer> primeSet = new HashSet<Integer>() ;
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {

			int n = in.nextInt();
			ArrayList<Integer> s = new ArrayList<Integer>();
			for (int j = 0; j <= n; j++) {
				if (isPrime(j)) {
					s.add(j);
				}
			}

			int[] sum = new int[s.size() + 1];
			sum[0] = 0;
			for (int j = 0; j < s.size(); j++) {
				sum[j + 1] = sum[j] + s.get(j);
			}

			int maxcount = 0;
			int maxresult = 0;
			for (int k = 0; k < sum.length; k++) {
				for (int l = k+maxcount+1; l < sum.length; l++) {
					int dis = l - k;
					int result = sum[l] - sum[k];
					if (dis > maxcount && result<n&&isPrime(result)) {
						maxcount = dis;
						maxresult = result;
					}else if (result >n ){
						break;
					}
					
				}
			}

			System.out.println(maxresult + " " + maxcount);

		}

		
		in.close();
	}


	private static boolean isPrime(int i) {
		if (primeSet.contains(i) ) return true;
		if (i == 0 || i == 1)
			return false;
		if (i == 2){
			primeSet.add(i);
			return true;
		}
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0)
				return false;
		}
		// TODO Auto-generated method stub
		primeSet.add(i);
		return true;
	}
}
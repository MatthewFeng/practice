package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class T18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] ar = new int[n];
			for (int j = 0; j < n; j++) {
				ar[j] = in.nextInt();
				// System.err.println(ar[j]);
			}
			long c = insertSort(ar);
			System.out.println(c);
		}
	}

	public static long insertSort(int[] ar) {
		
		long count = 0;  
		
	
		
		

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					count++;
				}

			}
		}

		return count;

	}

}

package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class T3 {

	public static void insertIntoSorted(int[] ar) {
		int count=0;
		for (int j = 1; j < ar.length; j++) {
			int k = j;
			int e = ar[k];
			while (k != 0 && ar[k - 1] > e) {
				ar[k] = ar[k - 1];
				k--;
				count++;
//				printArray(ar);
			}

			ar[k] = e;
			
//			printArray(ar);
		}
		System.out.println(count);
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}

package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class T2 {

	public static void insertIntoSorted(int[] ar) {
		for (int j = 1; j < ar.length; j++) {
			int k = j;
			int e = ar[k];
			while (k!=0&&ar[k - 1] > e) {
				ar[k] = ar[k - 1];
				k--;
				printArray(ar);
			}

			ar[k] = e;

		}
		printArray(ar);
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
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}

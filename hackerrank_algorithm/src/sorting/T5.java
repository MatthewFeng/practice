package sorting;

import java.util.Scanner;

public class T5 {

	static void quickSort(int[] ar) {
		quickSort(ar, 0, ar.length - 1);

	}

	private static void quickSort(int[] ar, int i, int j) {
		if (i >= j)
			return;

		int m = partition(ar, i, j);
		quickSort(ar, i, m - 1);
		quickSort(ar, m + 1, j);
		printArray(ar, i, j);

	}

	private static void printArray(int[] ar, int i, int j) {
		for (int k = i; k <= j; k++) {
			System.out.print(ar[k] + " ");
		}
		System.out.println();
	}

	static int partition(int[] ar, int l, int h) {
		if (l == h)
			return l;

		int p = ar[l];

		while (l < h) {

			while (ar[h] >= p && l < h) {
				h--;
			}

			if (l < h) {
				ar[l] = ar[h];
			}

			while (ar[l] <= p && l < h) {
				l++;
			}

			if (l < h) {
				ar[h] = ar[l];
			}

		}

		ar[l] = p;

		return l;

	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		quickSort(ar);
	}
}

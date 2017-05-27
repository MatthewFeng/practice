package sorting;

import java.util.Scanner;

public class T4 {

	static void partition(int[] ar) {
		int p = ar[0];
		int l = 0;
		int h = ar.length - 1;

		while (l < h) {

			if (ar[l] == p && ar[h] < p) {
				int t = ar[h];
				ar[h] = ar[l];
				ar[l] = t;
				// h--;c
				l++;
			}

			if (ar[l] > p && ar[h] == p) {
				int t = ar[h];
				ar[h] = ar[l];
				ar[l] = t;
				h--;
				// l++;
			}

			if (ar[l] < p) {
				l++;
			}

			if (ar[h] > p) {
				h--;
			}

		}

		printArray(ar);

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
		partition(ar);
	}
}

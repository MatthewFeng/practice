package sorting;

import java.util.Scanner;

public class T7 {

	static void quickSort(int[] ar) {
		quickSort(ar, 0, ar.length - 1);

	}

	private static void quickSort(int[] ar, int i, int j) {
		if (i >= j)
			return;

		int m = partition(ar, i, j);
		printArray(ar);
		quickSort(ar, i, m - 1);
		quickSort(ar, m + 1, j);

	}
/**
 * Lomuto Partition
 * @param ar
 * @param l
 * @param h
 * @return
 */
	static int partition(int[] ar, int l, int h) {
		if (l == h)
			return l;

		int p = ar[h];

		int cur = l;

		int k = cur;

		while (cur < h) {

			while (cur < h && ar[cur] <= p) {
				cur++;
			}

			k = cur;

			cur++;

			while (cur < h) {
				while (cur < h && ar[cur] < p) {
					int t = ar[cur];
					ar[cur] = ar[k];
					ar[k] = t;
					k++;
					cur++;
				}

				while (cur < h && ar[cur] >= p) {
					cur++;
				}

			}

		}

		ar[h] = ar[k];
		ar[k] = p;

		return k;

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

package sorting;

import java.util.Scanner;

public class T9 {

	static int qc = 0;
	static int ic = 0;

	/**
	 * Lomuto Partition
	 * 
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
//				qc++;
			}

			k = cur;

			cur++;

			while (cur < h) {
				while (cur < h && ar[cur] < p) {
					int t = ar[cur];
					ar[cur] = ar[k];
					ar[k] = t;
					qc++;
					k++;
					cur++;
				}

				while (cur < h && ar[cur] >= p) {
					cur++;
				}

			}

		}

		if (h != k) {
			ar[h] = ar[k];
			ar[k] = p;
			qc++;
		}

		return k;

	}

	static void quickSort(int[] ar) {
		quickSort(ar, 0, ar.length - 1);

	}

	private static void quickSort(int[] ar, int i, int j) {
		if (i >= j)
			return;

		int m = partition(ar, i, j);
		quickSort(ar, i, m - 1);
		quickSort(ar, m + 1, j);

	}

	public static void insertIntoSorted(int[] ar) {
		for (int j = 1; j < ar.length; j++) {
			int k = j;
			int e = ar[k];
			while (k != 0 && ar[k - 1] > e) {
				ar[k] = ar[k - 1];
				k--;
				ic++;
			}

			ar[k] = e;

		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] qa = new int[n];
		int[] ia = new int[n];

		for (int i = 0; i < n; i++) {
			qa[i] = s.nextInt();

			ia[i] = qa[i];

		}
		s.close();
		quickSort(qa);
		insertIntoSorted(ia);
		System.out.println(ic - qc);

	}

}

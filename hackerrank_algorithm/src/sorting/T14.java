package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class T14 {

	static boolean find = false;

	static int partition(int[] a, int l, int h) {
		int pv = a[h];
		int left = l;
		for (int i = l; i < h - 1; i++) {

			if (a[i] < pv) {
				int t = a[i];
				a[i] = a[left];
				a[left] = t;
				left++;
			}
		}

		a[h] = a[left];
		a[left] = pv;
		return left;

	}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int l = 0;
		int h = a.length - 1;
		int m = a.length / 2;
		
		Arrays.sort(a);
		System.out.println(a[m]);
		
		
		
		boolean find = false;
		while (!find) {
			int p = partition(a, l, h);
			if (p == m) {
				find = true;
			} else if (p < m) {
				h = p - 1;
			} else {
				l = m + 1;
			}
		}

		System.out.println(a[m]);

	}

}

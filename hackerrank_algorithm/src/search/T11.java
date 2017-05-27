package search;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class T11 {

	public static void main(String[] args) throws FileNotFoundException {
		// Scanner sc = new Scanner(System.in);
		File f = new File("C:\\temp\\t\\in2.txt");
		Scanner sc = new Scanner(new FileInputStream(f));
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		int[] b = new int[q];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		int[] ans = new int[q];
		Arrays.sort(a);

		int t = 0;
		int sum = 0;
		int psum = 0;
		int nsum = 0;
		int nc = 0;
		int pc = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] > 0) {
				psum += a[i];
				pc++;
			} else {
				nsum += a[i];
				nc++;
			}
		}
		sum = psum - nsum;

		for (int i = 0; i < ans.length; i++) {
			t = t + b[i];
			if (t == 0)
				ans[i] = sum;
			if (t < 0) {
				int index_t = find(a, t * (-1));
				ans[i] = sum - t * nc + (a.length - index_t - 1) * t;
				for (int j = nc; j <= index_t; j++) {
					// ans[i] += 2 * a[j] + t;
					ans[i] += Math.abs(t + a[j]) - a[j];
				}

			}
			if (t > 0) {
				int index_t = find(a, t * (-1));
				ans[i] = sum + t * pc - t * (index_t + 1);
				for (int j = index_t + 1; j < nc; j++) {
					// ans[i] += t + 2 * a[j];
					ans[i] += Math.abs(a[j] + t) + a[j];
				}

			}

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

	private static int find(int[] a, int i) {

		int l = 0;
		int h = a.length - 1;
		int m = (h + l) / 2;

		while (l < h) {
			if (a[m] == i)
				return m;
			if (a[m] > i) {
				h = m - 1;
				m = (h + l) / 2;
			} else if (a[m] < i) {
				l = m + 1;
				m = (h + l) / 2;
			}
		}

		if (a[m] <= i) {
			return m;
		}
		return m - 1;
	}

}

package search;

import java.util.Scanner;
import java.util.TreeSet;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		for (int c = 0; c < t; c++) {

			int n = s.nextInt();
			long m = s.nextLong();

			long[] a = new long[n + 1];
			a[0] = 0;
			for (int i = 1; i <= n; i++) {

				a[i] = (s.nextLong() % m + a[i - 1]) % m;
			}

			long mo = 0;

			TreeSet<Long> ts = new TreeSet<Long>();
			ts.add(a[0]);

			for (int i = 1; i <= n; i++) {
				Long l = ts.higher(a[i]);
				if (l == null) {
					l = 0l;
				}

				long tl = (a[i] - l + m) % m;
				if (tl > mo) {
					mo = tl;
				}
				ts.add(a[i]);

			}

			System.out.println(mo);
		}
		s.close();
	}

}

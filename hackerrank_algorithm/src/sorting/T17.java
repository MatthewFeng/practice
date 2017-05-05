package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class T17 {

	public static void main(String[] ar) {

		Scanner s = new Scanner(System.in);
		long t = s.nextLong();

		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			long[] a = new long [n];
			for (int j = 0; j < n; j++) {
				a[j] = s.nextLong();
			}

			Arrays.sort(a);

			long sum = 0;
			long p = 1;
			for (int j = 0; j < n - 1; j++) {
				if (a[j + 1] == a[j]) {
					p++;
				} else {
					sum = sum + p * (p - 1);
					p=1;
				}
			}
			
			sum = sum + p * (p - 1);
			System.out.println(sum);
			
		}
		s.close();
	}
}

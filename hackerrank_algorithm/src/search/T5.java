package search;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			int[] a = new int[n];
			int sum = 0;
			boolean flag = false;

			for (int j = 0; j < n; j++) {
				sum = sum + s.nextInt();
				a[j] = sum;
			}
			if (n == 1) {
				flag = true;
			} else {

				for (int j = 1; j < n; j++) {
					if (a[j - 1] == a[n - 1] - a[j]) {
						flag = true;
						break;
				
					}
				}
			}

				if (flag) {
					System.out.println("YES");

				} else {
					System.out.println("NO");
				}

		}
		s.close();

	}

}

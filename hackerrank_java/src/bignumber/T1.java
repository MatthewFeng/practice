package bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class T1 {
	public static void main(String[] argh) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}


		Arrays.sort(s, new Comparator<String>() {
			{
			}

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return new BigDecimal(o2).compareTo(new BigDecimal(o1));
			}
		});

		
		
		// Write your code here

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

		sc.close();

	}

}

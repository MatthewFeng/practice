package sorting;

import java.util.Scanner;

public class T12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] r = new int[n];
		int[] c = new int[100];
		int[] p = new int[100];

		String[] name = new String[n];
		String[] rname = new String[n];

		for (int i = 0; i < n; i++) {
			int t = s.nextInt();
			a[i] = t;

			name[i] = s.next();
		}

		for (int i = 0; i < n; i++) {
			if (a[i] >= 0 && a[i] < 100) {
				c[a[i]]++;

			}
		}
		//Calculate the position of the a[i]
		int total = 0;
		for (int i = 0; i < 100; i++) {
			p[i] = total;
			total = p[i] + c[i];
		}

		for (int i = 0; i < n; i++) {
			r[p[a[i]]] = a[i];

			if (i < n / 2) {
				rname[p[a[i]]] = "-";
			} else {
				rname[p[a[i]]] = name[i];
			}
			p[a[i]]++;
		}

		s.close();

		printArray(rname);

	}

	private static void printArray(String[] rname) {
		StringBuffer sb = new StringBuffer();
		for (String s:rname){
			sb.append(s);
			sb.append(' ');
		}
		System.out.println(sb);
		
	}

	static void printArray3(int[] ar) {

		int count = 0;

		for (int i = 0; i < ar.length; i++) {

			count = count + ar[i];
			System.out.print(count + " ");

		}
	}

}

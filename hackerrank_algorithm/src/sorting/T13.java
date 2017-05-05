package sorting;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class T13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);

		LinkedList<Integer> l = new LinkedList<Integer>();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			int dis = Math.abs(a[i + 1] - a[i]);
			if (dis < min) {
				l = new LinkedList<Integer>();
				min=dis;
				l.add(i);
			} else if (dis == min) {
				l.add(i);
			}

		}
		
		for (int i:l){
			System.out.print(""+a[i]+" "+a[i+1]+" ");
		}

	}

}

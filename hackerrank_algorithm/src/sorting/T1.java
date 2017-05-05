package sorting;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int n = in.nextInt();
		int[] ar = new int[n];
		int i = 0;
		int ans = -1;
		while (i < 0) {
			ar[i] = in.nextInt();
			if (ar[i] == v) {
				ans = i;
				break;
			}
			i++;
		}
		
		System.out.println(ans);
		in.close();
	}

}

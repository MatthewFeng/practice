package sorting;

import java.util.Scanner;

public class T15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=sc.nextInt();
		int q=sc.nextInt();
		int[] a = new int[n];
//		int[] b = new int[n];
		int kk=k%n;
		for (int i=0;i<n;i++){
			a[(i+kk)%n]=sc.nextInt();
		}
		
		for (int i=0;i<q;i++){
			System.out.println(a[sc.nextInt()]);
		}
	
		sc.close();
		
	}
}

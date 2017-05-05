package search;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] a = new int[n];
		for (int j = 0; j < n; j++) {
			a[j] = s.nextInt();
		}
		int m = s.nextInt();
		int[] b = new int[m];
		for (int j = 0; j < m; j++) {
			b[j] = s.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		TreeSet<Integer> ts= new TreeSet<Integer>();
		int k=0;
		for (int i=0;i<a.length;i++){
			while (b[k]!=a[i]){
				ts.add(b[k]);
				k++;
			}
			k++;
		}
		for (int i=k;i<b.length;i++){
			ts.add(b[k]);
		}

		for(Integer in:ts){
			System.out.print(in+" ");
		}
		
		s.close();
		
		
		
	}

}

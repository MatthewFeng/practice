package search;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int m = s.nextInt();
			int n = s.nextInt();
			int[] a = new int[n];

			for (int j = 0; j < n; j++) {
				a[j] = s.nextInt();
			}

		
			int j=0;
			int k=j+1;
			boolean find=false;
			
			for ( j=0;j<n-1;j++){
				
				for ( k=j+1;k<n;k++){
					if (a[j]+a[k]==m){
						find=true;
						break;
					}
				}
				
				if (find) break;
			}
			
			System.out.println((j+1)+" "+(k+1));
		}
		s.close();

	}

}

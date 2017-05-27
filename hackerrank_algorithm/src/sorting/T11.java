package sorting;

import java.util.Scanner;

public class T11 {
	
	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] c= new int[100];
		for (int i = 0; i < n; i++) {
			int t= s.nextInt();
			if (t >=0 &&t<100){
				c[t]++;
			}
			s.next();
		}
		
		s.close();
		
		printArray3(c);
		
	}
	static void printArray2(int[] ar) {
		
		for (int i=0;i<ar.length;i++) {
			
			for (int j=ar[i] ;j>0;j--){
				
				System.out.print(i + " ");
			}
			
		}
	}
	
static void printArray3(int[] ar) {
	
		int count =0;
		
		for (int i=0;i<ar.length;i++) {
			
			count=count+ar[i];
			System.out.print(count + " ");
			
			
		}
	}
	
}

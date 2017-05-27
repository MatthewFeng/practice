package datastructure;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int [] a=new int [n];
		int [] s=new int [n+1];
		
		for (int i=0;i<n;i++){
			s[i+1]=s[i]+in.nextInt();
		};
		int count=0;
		for (int i=0;i<n;i++){
			for (int j=i+1;j<n+1;j++){
				if (s[j]-s[i]<0)
					count++;
			}
		}
		System.out.println(count);
		in.close();
	}

}

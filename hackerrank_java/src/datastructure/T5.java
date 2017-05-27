package datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		 Scanner s  = new Scanner(System.in);
		 int n =s.nextInt();
		 ArrayList<int[]> a= new ArrayList<int[]>(n);
		 for (int i = 0;i<n;i++){
			 int d = s.nextInt();
			 int[] b= new int[d];
			 a.add(b);
			 for (int j=0;j<d;j++){
				 b[j]=s.nextInt();
			 }
		 }
		 
		 int q=s.nextInt();
		 for (int i=0;i<q;i++){
			 int x=s.nextInt();
			 int y=s.nextInt();
			 if (x>a.size()||a.get(x-1).length<y){
				 System.out.println("ERROR");
				 continue;
			 }else {
				 
				 System.out.println(a.get(x-1)[y-1]);
			 }
		 }
		 s.close();
		 
	}

}

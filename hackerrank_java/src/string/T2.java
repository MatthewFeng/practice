package string;

import java.util.Scanner;

public class T2 {
	
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String s=sc.next();
	        int  k=sc.nextInt();
	        /* Enter your code here. Print output to STDOUT. */
	        sc.close();
	        String largest=s.substring(0,k);
	        String smallest=largest;
	        for(int i=0;i<s.length()-k+1;i++){
	        	String sub=s.substring(i, i+k);
	        	if (smallest.compareTo(sub)>0){
	        		smallest=sub;
	        	}
	        	if (largest.compareTo(sub)<0){
	        		largest=sub;
	        	}
	        }
	        
	        System.out.println(smallest);
	        System.out.println(largest);
	        
	        
	    }
}

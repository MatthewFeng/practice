package string;

import java.util.HashSet;
import java.util.Scanner;

public class T3 {
	 static boolean isAnagram(String A, String B) {
	      //Complete the function
		 int [] c=new int[26];
		 String a=A.toLowerCase();
		 String b=B.toLowerCase();
		 for(int i=0;i<A.length();i++){
			 c[a.charAt(i)-'a']++;
		 }
		 for(int i=0;i<B.length();i++){
			 c[b.charAt(i)-'a']--;
		 }
		 
		 for (int x:c){
			 if (x!=0){
				 return false;
			 }
		 }
		return true;
	   
	   }
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        boolean ret=isAnagram(A,B);
	        if(ret)System.out.println("Anagrams");
	        else System.out.println("Not Anagrams");
	        
	    }
	}
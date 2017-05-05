package string;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>=0?"Yes":"No");
        System.out.println("" +(char)(A.charAt(0)+'A'-'a')+A.substring(1));             
        System.out.println("" +(char)(B.charAt(0)+'A'-'a')+B.substring(1));
        sc.close();
    }
}

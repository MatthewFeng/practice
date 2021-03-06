package usernameChecker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 * @author Matthew Feng
 *
 */
public class Solution {
	   public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String username = in.nextLine();
		
	         String pattern="^[a-zA-Z]{1}[a-zA-Z_0-9]{7,29}+$";
	         
	         Pattern r = Pattern.compile(pattern);
	         Matcher m = r.matcher(username);
	          
	         if (m.find( )) {
	            System.out.println("Valid");
	         } else {
	            System.out.println("Invalid");
	         }
	         testCases--;
	      }
	   }
}

package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a= in.next();
		String b = in.next();
		in.close();
		int ia ,ib ,ans;
		
		try{
		ia= Integer.parseInt(a);
		ib = Integer.parseInt(b);}
		catch(NumberFormatException e){
			System.out.println(new InputMismatchException());
		return;
		}
		
		try{
			ans=ia/ib;
		}catch(ArithmeticException e){
			System.out.println(e);
		return;
		}
		
		System.out.println(ans);
		
	}

}

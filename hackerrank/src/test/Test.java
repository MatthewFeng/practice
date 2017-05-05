package test;

import java.util.Scanner;

public class Test {

	
	@SuppressWarnings("finally")
	public boolean  test(){
		
		try{
			
			return true;
		}catch ( Exception e){
			return false;
		}finally{
			return false;
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println(in.nextByte());
		
		boolean b = new Test().test();
		
		System.out.println(b);

	}

}

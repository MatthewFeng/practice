package test;

import java.math.BigDecimal;

public class T {
	
	public static void main(String[] arg){
		
		System.out.println(new BigDecimal("0.00"));
		System.out.printf("%-15s%03d","python", 5);
		System.out.println();
//		System.out.println((byte)0x80);
//		System.out.println((byte)0x7f);
		System.out.println((short)0x8000);
		System.out.println("short"+(short)0x7fff);
//		System.out.println((int)0x80000000);
//		System.out.println((int)0x7fffffff);
//		System.out.println(new Long("0x8000000000000000").longValue());
//		System.out.println(Integer.toHexString(-127));
//		System.out.println("end");
		
//		int x=0;
//
//                if(x>=-128 && x<=127)System.out.println("* byte");
//                if (x>=(short)0x8000&&x<(short)0x7ffff) System.out.println("* short");
//                if (x>=0x80000000&&x<0x7fffffff) System.out.println("* int");
//                if (x>=0x8000000000000000L&&x< 0x7fffffffffffffffL) System.out.println("* long");
	}

}

package bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class T2 {
	public static void main(String[] argh) {
		// Input
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		BigInteger ba = new BigInteger(a);
		BigInteger bb = new BigInteger(b);
		System.out.println(ba.add(bb));
		System.out.println(ba.multiply(bb));
		sc.close();
	}
}
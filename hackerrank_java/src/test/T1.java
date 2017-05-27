package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class T1 {
	
	public static void  test(List<Integer> v){
		long  s= System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			v.add(i);
			
		}
		long k=0;
		for (Integer e:v) {
			k+=e;
		}
		
		System.out.println(k);
		System.out.println(System.currentTimeMillis()-s);
		
	};

	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<Integer> ();
		ArrayList<Integer> a= new ArrayList<Integer>();
		System.out.println("vector");
		test(v);
		System.out.println("Arraylist");
		test(a);
		
	}

}

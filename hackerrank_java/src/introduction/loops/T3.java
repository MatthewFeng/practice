package introduction.loops;

import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=0;
		while (sc.hasNext()){
			String s=sc.nextLine();
			System.out.println(""+(++i)+" "+s);
			
		}
		sc.close();
	}

}

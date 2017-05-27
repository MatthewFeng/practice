package string;

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		// TODO Auto-generated method tub
		{
			Scanner in = new Scanner(System.in);
			while (in.hasNext()) {
				String IP = in.next();
				System.out.println(IP.matches(new myRegex().pattern));
			}

		}
	}
}

class myRegex {

	String pattern = "([0]{0,2}[0-9]|[0]{0,1}[0-9]{0,1}\\d|1\\d{2}|2[0-4]\\d|25[0-5])"
			+ "(\\.([0]{0,2}[0-9]|[0]{0,1}[0-9]{0,1}\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}";

}

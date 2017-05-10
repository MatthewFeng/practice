package feng.fubao.hiredintech;

public class DigitSum {
	public static int digit_sum(long number) {
		// Write your code here
		
		String s=""+number;
		char[] a=s.toCharArray();
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]!='-'){
				sum+=a[i]-'0';
			}
		}
		return sum;
	}
}
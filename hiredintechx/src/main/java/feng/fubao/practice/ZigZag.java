package feng.fubao.practice;

public class ZigZag {

	public static int longestZigZag(int[] a) {
		if (a == null || a.length == 0)
			return 0;
		int[] up = new int[a.length];

		int[] down = new int[a.length];
		up[0] = 1;
		down[0] = 1;

		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i]) {
					up[i] = Math.max(down[j] + 1, up[i]);
				}
				if (a[j] > a[i]) {
					down[i] = Math.max(up[j] + 1, down[i]);
				}
			}

		}
		int longest = 0;
		for (int i = 1; i < a.length; i++) {
			longest = Math.max(longest, up[i]);
			longest = Math.max(longest, down[i]);
		}
		return longest;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

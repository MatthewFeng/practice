package feng.fubao.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Permutation {

	public static List<String> getPermutation(char[] args) {

		return getPermutation(args, args.length);

	}

	private static List<String> getPermutation(char[] args, int length) {
		// TODO Auto-generated method stub
		List<String> l2 = new LinkedList<String>();
		if (length == 0)
			return new LinkedList<String>();
		else if (length == 1) {
			List<String> l = new LinkedList<String>();
			l.add(""+args[0]);
			return l;
		} else {
			List l = getPermutation(args, length - 1);
	
			for (Iterator iterator = l.iterator(); iterator.hasNext();) {
				String s = (String) iterator.next();
//				l2.add(s);
				for (int i = 0; i <= s.length(); i++) {
					String n = append(s, i, args[length - 1]);
					l2.add(n);
				}

			}

		}
		return l2;
	}

	private static String append(String s, int i, char c) {
		StringBuffer sb = new StringBuffer();
		sb.append(s, 0, i);
		sb.append(c);
		sb.append(s, i, s.length());
		return sb.toString();
	}

}

package feng.fubao.hiredintech;

import static org.junit.Assert.*;

import org.junit.Test;

import feng.fubao.hiredintech.ZigZag;

public class TestZigZag {

	@Test
	public void test() {
		
		int [] a= new int []			{12, 333, 700, 436, 1, 919, 959, 456, 456, 456, 1000, 193, 192, 13, 75, 818, 197, 197, 2, 777, 99, 81, 222, 109, 1000, 19, 27, 270, 62, 189, 987, 234, 55, 2, 718, 238, 901, 901, 900, 432, 55, 606, 89, 7, 7, 23, 789, 790, 800, 1000}		;
		assertEquals(26, ZigZag.longestZigZag(a));
	}

}

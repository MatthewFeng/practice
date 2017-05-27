package feng.fubao.hiredintech;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Test_Mathmatics {

	@Test
	public void test_simplify() {
		int[] result= new int [2];
		Mathematics.simplify_fraction(3, 24, result);
		
		assertTrue(Arrays.equals(new int[]{1,8}, result));
		
	}

}

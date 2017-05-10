package feng.fubao.hiredintech;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestInall {

	@Test
	public void testDigitSum() {
		assertEquals(18, DigitSum.digit_sum(-3456));
	}

	@Test
	public void test_is_numeric_palindrome() {
		assertTrue(Solution.is_numeric_palindrome(123));
	}

	@Test
	public void test_longest_numbers() {
		List<Integer> a= new ArrayList <Integer>(Arrays.asList(16, 3, 5, 19, 10, 14, 12, 0, 15));
		List<Integer> r=Solution.longest_increasing_subsequence(a);
		System.out.println(r.toArray());
		assertTrue(true);
		
		
	}
}

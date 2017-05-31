package feng.fubao.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestAll {


	@Test
	public void testPermutaion() {
		List<String> l= Permutation.getPermutation("abc".toCharArray());
		
		for(String s:l){
			System.out.println(s);
		}
		
	assertEquals(2,Permutation.getPermutation("ab".toCharArray()).size());

	}

}

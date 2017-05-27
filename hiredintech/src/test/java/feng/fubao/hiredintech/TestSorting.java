package feng.fubao.hiredintech;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestSorting {

	@Test
	public void test_max_task() {

		assertEquals(3, Sorting.maximum_completed_tasks(5, 65, Arrays.asList(24, 23, 22, 10, 20)));
	}

	@Test
	public void test_cover_border() {
		// [ [5, 10], [3, 25], [46, 99], [39, 40], [45, 50] ]
		List<List<Integer>> l = Arrays.asList(Arrays.asList(5, 10), Arrays.asList(3, 25),
				Arrays.asList(46, 99), Arrays.asList(39, 40), Arrays.asList(45, 50));
		assertEquals(77, Sorting.cover_the_border(100, l));

	}
}

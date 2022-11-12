package hw8;

import static org.junit.Assert.*;

import org.junit.Test;

import hw8.InterpolationSearcher;

public class TestInterpolationSearcher {

	@Test
	public void testSearcher01() {
		int Array[] = {1};
		InterpolationSearcher searcher = new InterpolationSearcher();
		assertEquals(0, searcher.search(Array, 1));
	}
	
	@Test
	public void testSearcher02() {
		int Array[] = {1};
		InterpolationSearcher searcher = new InterpolationSearcher();
		assertEquals(-1, searcher.search(Array, 0));
	}

	@Test
	public void testSearcher03() {
		int Array[] = {1};
		InterpolationSearcher searcher = new InterpolationSearcher();
		assertEquals(-1, searcher.search(Array, 2));
	}
	
	@Test
	public void testSearcher04() {
		int Array[] = {1, 2};
		InterpolationSearcher searcher = new InterpolationSearcher();
		assertEquals(0, searcher.search(Array, 1));
	}
	
	@Test
	public void testSearcher05() {
		int Array[] = {1, 3};
		InterpolationSearcher searcher = new InterpolationSearcher();
		assertEquals(-1, searcher.search(Array, 2));
	}
	
	@Test
	public void testSearcher06() {
		int Array[] = {1, 7, 10};
		InterpolationSearcher searcher = new InterpolationSearcher();
		assertEquals(-1, searcher.search(Array, 6));
	}

	@Test
	public void testSearcher07() {
		int Array[] = {1, 4, 8, 10};
		InterpolationSearcher searcher = new InterpolationSearcher();
		assertEquals(-1, searcher.search(Array, 7));
	}

	@Test
	public void testSearcher08() {
		int Array[] = {1, 4, 5, 6, 10};
		InterpolationSearcher searcher = new InterpolationSearcher();
		assertEquals(3, searcher.search(Array, 6));
	}

	@Test
	public void testSearcher09() {
		int Array[] = {1, 7, 9, 10};
		InterpolationSearcher searcher = new InterpolationSearcher();
		assertEquals(1, searcher.search(Array, 7));
	}
}

package org.alexgdev.codewars;

import java.util.Arrays;

import org.alexgdev.codewars.fivekyu.PaginationHelper;
import org.junit.Test;

import junit.framework.TestCase;

public class PaginationHelperTest extends TestCase {
	
	private PaginationHelper<Character> helper;
	protected void setUp() throws Exception {
		super.setUp();
		helper = new PaginationHelper<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
	}
	
	@Test
	public void testPageCount(){
		assertEquals(2, helper.pageCount());
	}
	
	@Test
	public void testItemCount(){
		assertEquals(6, helper.itemCount());
	}
	
	@Test
	public void testPageItemCount(){
		assertEquals(4, helper.pageItemCount(0));
		assertEquals(2, helper.pageItemCount(1));
		assertEquals(-1, helper.pageItemCount(2));
	}
	
	@Test
	public void testPageIndex(){
		assertEquals(1, helper.pageIndex(5));
		assertEquals(0, helper.pageIndex(2));
		assertEquals(-1, helper.pageIndex(20));
		assertEquals(-1, helper.pageIndex(-10));
	}


}

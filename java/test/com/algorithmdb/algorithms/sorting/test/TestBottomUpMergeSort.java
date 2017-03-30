package com.algorithmdb.algorithms.sorting.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.algorithmdb.algorithms.sorting.BottomUpMergeSort;

public class TestBottomUpMergeSort {

	Integer[] unSortedNumbers = {50,87,5,2,1000,9,23,90,8,32,1,23,18,100,11,980};
	Integer[] expectedSortedNumbers  = {1,2,5,8,9,11,18,23,23,32,50,87,90,100,980,1000};
	
	String[] unSortedStrings = {"jagan","Arunan","Albert","Vijay","stephen","Jack","Selva","Anbarasan",
	         "Richard","Venkat","Abi","Bharath","bala","Hedbert"};
	String[] expectedSortedStrings = {"Abi","Albert","Anbarasan","Arunan","Bharath","Hedbert","Jack",
			 "Richard","Selva","Venkat","Vijay","bala","jagan","stephen"};
	@Test
	public void testIntegerSorting() {
		new BottomUpMergeSort<Integer>().sort(unSortedNumbers);
		assertArrayEquals(expectedSortedNumbers, unSortedNumbers);
	}
	
	@Test
	public void testStringSorting() {
		new BottomUpMergeSort<String>().sort(unSortedStrings);
		assertArrayEquals(expectedSortedStrings, unSortedStrings);
	}
}

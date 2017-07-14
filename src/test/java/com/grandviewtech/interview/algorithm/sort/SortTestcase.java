package com.grandviewtech.interview.algorithm.sort;

import org.junit.Test;

import com.grandviewtech.interview.algorithm.sort.impl.BubbleSort;
import com.grandviewtech.interview.algorithm.sort.impl.InsertionSort;
import com.grandviewtech.interview.algorithm.sort.impl.MergeSort;

public class SortTestcase
	{
		public static int[]	input	= new int[] { -1, 10, 23, 22, 11, 2, 1, 11 };
		public static Sort	sort	= null;
		
		@Test
		public void bubleSort()
			{
				sort = new BubbleSort();
				sort.sort(input);
			}
			
		@Test
		public void insertionSort()
			{
				sort = new InsertionSort();
				sort.sort(input);
			}
			
		@Test
		public void mergeSort()
			{
				sort = new MergeSort();
				sort.sort(input);
			}
	}

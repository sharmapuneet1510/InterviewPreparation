package com.grandviewtech.interview.algorithm.sort.impl;

import com.grandviewtech.interview.algorithm.sort.Sort;
import com.grandviewtech.misc.Utility;

public class MergeSort implements Sort
	{
		
		private int[] data = null;
		
		public int[] sort(int[] input)
			{
				data = Utility.print("un-sorted", input);
				sort(0, input.length - 1);
				return Utility.print("sorted", input);
			}
			
		private void sort(int startIndex, int endIndex)
			{
				if (startIndex < endIndex)
					{
						int median = ((startIndex + endIndex) / 2) + ((endIndex % 2 == 0) ? 0 : 1);
						left(startIndex, median - 1);
						right(median, endIndex);
						merge(startIndex, median, endIndex);
					}
					
			}
			
		private void left(int startIndex, int endIndex)
			{
				//int left[] = subArray(startIndex, endIndex);
				sort(startIndex, endIndex);
			}
			
		private void right(int startIndex, int endIndex)
			{
				//int right[] = subArray(startIndex, endIndex);
				sort(startIndex, endIndex);
			}
			
		private void merge(int startIndex, int median, int endIndex)
			{
				if (median > 0)
					{
						merge(startIndex, subArray(startIndex, median - 1), subArray(median, endIndex));
					}
			}
			
		private void merge(int startIndex, int[] left, int[] right)
			{
				int startIndex1 = 0;
				int startIndex2 = 0;
				int startIndex3 = startIndex;
				while (startIndex1 < left.length && startIndex2 < right.length)
					{
						if (left[startIndex1] <= right[startIndex2])
							{
								this.data[startIndex3] = left[startIndex1];
								startIndex1 = startIndex1 + 1;
							}
						else
							{
								this.data[startIndex3] = right[startIndex2];
								startIndex2 = startIndex2 + 1;
							}
						startIndex3 = startIndex3 + 1;
					}
				udpateRemaining(startIndex1, left, startIndex2, right, startIndex3);
			}
			
		public void udpateRemaining(int startIndex1, int[] left, int startIndex2, int[] right, int startIndex3)
			{
				while (startIndex1 < left.length)
					{
						this.data[startIndex3] = left[startIndex1];
						startIndex1++;
						startIndex3++;
					}
				while (startIndex2 < right.length)
					{
						this.data[startIndex3] = right[startIndex2];
						startIndex2++;
						startIndex3++;
					}
			}
			
		private int[] subArray(int startIndex, int endIndex)
			{
				int size = (endIndex - startIndex) + 1;
				int[] subArray = new int[size];
				for (int i = 0; i < size; i++)
					{
						subArray[i] = data[i + startIndex];
					}
				return subArray;
			}
	}

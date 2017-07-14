package com.grandviewtech.interview.algorithm.sort.impl;

import com.grandviewtech.interview.algorithm.sort.Sort;
import com.grandviewtech.misc.Utility;

public class InsertionSort implements Sort
	{
		
		public int[] sort(int[] input)
			{
				int size = input.length;
				Utility.print("un-sorted", input);
				for (int i0 = 1; i0 < size; i0++)
					{
						//int i0Val = input[i0];
						int i1 = i0 - 1;
						while (i1 > -1 && (input[i1] > input[i1 + 1]))
							{
								int temp = input[i1 + 1];
								input[i1 + 1] = input[i1];
								input[i1] = temp;
								i1--;
							}
						//input[i1 + 1] = i0Val;
					}
				return Utility.print("sorted", input);
			}
			
	}

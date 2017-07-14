package com.grandviewtech.interview.algorithm.sort.impl;

import com.grandviewtech.interview.algorithm.sort.Sort;
import com.grandviewtech.misc.Utility;

public class BubbleSort implements Sort
	{
		
		public int[] sort(int[] input)
			{
				int size = input.length;
				Utility.print("un-sorted", input);
				for (int i = 0; i < size; i++)
					{
						for (int j = i + 1; j < size; j++)
							{
								if (input[i] > input[j])
									{
										int temp = input[i];
										input[i] = input[j];
										input[j] = temp;
									}
							}
					}
				return Utility.print("sorted", input);
			}
			
	}

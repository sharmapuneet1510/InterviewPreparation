package com.grandviewtech.misc;

import java.util.StringJoiner;

public class Utility
	{
		public static int[] print(String label, int[] output)
			{
				StringJoiner stringJoiner = new StringJoiner(" , ");
				for (int out : output)
					{
						stringJoiner.add("" + out);
					}
				System.out.println(label + " : " + stringJoiner.toString());
				return output;
			}
	}

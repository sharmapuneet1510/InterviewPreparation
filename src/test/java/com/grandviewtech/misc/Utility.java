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
			
		public static int findPrecedence(char charachter)
			{
				switch (charachter)
					{
						case '+':
						case '-':
							return 1;
						
						case '*':
						case '/':
							return 2;
						
						case '^':
							return 3;
					}
				return -1;
			}
	}

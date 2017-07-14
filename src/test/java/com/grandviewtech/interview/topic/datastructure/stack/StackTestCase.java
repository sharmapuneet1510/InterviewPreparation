
package com.grandviewtech.interview.topic.datastructure.stack;

import java.util.Stack;
import java.util.StringJoiner;

import org.junit.Test;

import com.grandviewtech.misc.Utility;

public class StackTestCase
	{
		
		@Test
		public void infix2PostFix()
			{
				String expression = "a+b*(c^d-e)^(f+g*h)-ia+b*(c^d-e)^(f+g*h)-i";
				String output = new String();
				Stack<Character> characters = new Stack<Character>();
				for (int i = 0; i < expression.length(); i++)
					{
						char character = expression.charAt(i);
						if (Character.isLetterOrDigit(character))
							{
								output += character;
							}
						else
							{
								if (character == '(')
									{
										characters.push(character);
									}
								else if (character == ')')
									{
										while (!characters.isEmpty() && characters.peek() != '(')
											{
												output += characters.pop();
											}
										if (!characters.isEmpty() && characters.peek() != '(')
											{
												System.out.println("Invalid Expression");
											}
										else
											{
												characters.pop();
											}
									}
								else // an operator is encountered
									{
										while (!characters.isEmpty() && Utility.findPrecedence(character) <= Utility.findPrecedence(characters.peek()))
											{
												output += characters.pop();
											}
										characters.push(character);
									}
							}
					}
				while (!characters.isEmpty())
					{
						output += characters.pop();
					}
				System.out.println("Output : " + output);
			}
			
		@Test
		public void reverseAString()
			{
				String input = "tereJasisa Yaar kaaha";
				StringBuilder reverse = new StringBuilder(input);
				Stack<Character> characters = new Stack<Character>();
				for (int i = 0; i < input.length(); i++)
					{
						characters.push(input.charAt(i));
					}
				StringJoiner output = new StringJoiner("");
				for (int i = 0; i < input.length(); i++)
					{
						output.add("" + characters.pop());
					}
					
				org.junit.Assert.assertTrue("String doesn't Match", reverse.reverse().toString().equals(output.toString()));
			}
			
	}

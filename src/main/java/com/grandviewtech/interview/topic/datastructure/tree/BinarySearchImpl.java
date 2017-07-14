package com.grandviewtech.interview.topic.datastructure.tree;

public class BinarySearchImpl implements BinarySearch
	{
		
		@Override
		public void insert(Node node, int value)
			{
				if (value < node.getValue())
					{
						if (node.getLeft() != null)
							{
								insert(node.getLeft(), value);
							}
						else
							{
								System.out.println("  Inserted " + value + " to left of " + node.getValue());
								node.setLeft(new Node(value));
							}
					}
				else if (value > node.getValue())
					{
						if (node.getRight() != null)
							{
								insert(node.getRight(), value);
							}
						else
							{
								System.out.println("  Inserted " + value + " to left of " + node.getValue());
								node.setRight(new Node(value));
							}
					}
					
			}
			
	}

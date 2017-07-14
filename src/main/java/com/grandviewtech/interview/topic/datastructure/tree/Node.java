package com.grandviewtech.interview.topic.datastructure.tree;

public class Node
	{
		
		private Node	left;
		
		private Node	right;
		
		private int		value;
		
		public int getValue()
			{
				return value;
			}
			
		public void setValue(int value)
			{
				this.value = value;
			}
			
		public Node getLeft()
			{
				return left;
			}
			
		public void setLeft(Node left)
			{
				this.left = left;
			}
			
		public Node getRight()
			{
				return right;
			}
			
		public void setRight(Node right)
			{
				this.right = right;
			}
			
		public Node()
			{
				super();
			}
			
		public Node(int value)
			{
				super();
				this.value = value;
			}
			
	}

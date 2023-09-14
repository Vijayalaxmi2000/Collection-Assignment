package com.jsp.collectionsAssignment;

public class CheckConstructor 
{
	private CheckConstructor()
	{
		System.out.println("it can be write implicitly");
	}
   public static void main(String[] args) 
   {
	 System.out.println("it cannot be write explicitly");
   }
}

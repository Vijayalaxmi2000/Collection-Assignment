package com.jsp.collectionsAssignment;

import java.util.TreeSet;


public class Library
{
	public  void addlibdetails()
	{
		LibraryDetails l1=new LibraryDetails("SOM","P K Nagaraj",8456123,8);
		LibraryDetails l2=new LibraryDetails("MOM","P K Nagaraj",123454896,5);
		LibraryDetails l3=new LibraryDetails("Maths-I","P K Nagaraj",78451851,10);
		LibraryDetails l4=new LibraryDetails("Design-I","P K Nagaraj",12456786,15);
		LibraryDetails l5=new LibraryDetails("CE","P K Nagaraj",845476143,30);
	    TreeSet<LibraryDetails> li=new TreeSet<LibraryDetails>();
	    li.add(l1);
	    li.add(l2);
	    li.add(l3);
	    li.add(l4);
	    li.add(l5);
	    System.out.println(li);
	}

	public static void main(String[] args)
	{
		Library l1=new Library();
		l1.addlibdetails();
	}

}

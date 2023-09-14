package com.jsp.collectionsAssignment;

import java.util.Collections;
import java.util.Vector;

public class CustomerMain 
{
	public void addDetails()
	{
		Customer c1=new Customer("abc","@123",101,1234567891);
		Customer c2=new Customer("cde","@121",102,1234567891);
		Customer c3=new Customer("efg","@112",103,1234567891);
		Customer c4=new Customer("abd","@456",104,1234567891);
		Customer c5=new Customer("xyz","@789",105,1234567891);
		
		Vector<Customer> clist=new Vector<Customer>();
		clist.add(c1);
		clist.add(c2);
		clist.add(c1);
		clist.add(c3);
		clist.add(c4);
		clist.add(c5);
		clist.add(c3);
		System.out.println(clist);
		Collections.sort(clist);
		System.out.println(clist);
		for(int i=0;i<clist.size();i++)
		{
			System.out.println(clist.get(i));
		}
	}
	

	public static void main(String[] args) 
	{
		CustomerMain c1=new CustomerMain();
		c1.addDetails();

	}

}

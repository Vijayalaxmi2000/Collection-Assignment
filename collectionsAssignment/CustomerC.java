package com.jsp.collectionsAssignment;

import java.util.Vector;

public class CustomerC 
{
	private String name;
	private String pw;
	private int id;
	private long mobileNo;
	public CustomerC(String name, String pw, int id, long mobileNo)
	{
		super();
		this.name = name;
		this.pw = pw;
		this.id = id;
		this.mobileNo = mobileNo;
	}
    @Override
    public String toString()
    {
    	return "[ Customer Name: "+name+" pw: "+pw+" id: "+id+"mobileNo: "+mobileNo+" ]";
    }
    public void addDetails()
    {
    	CustomerC c1=new CustomerC("abc","@123",101,1234567891); 
    	CustomerC c2=new CustomerC("def","@123",102,1234567891); 
    	CustomerC c3=new CustomerC("abd","@123",103,1234567891); 
    	CustomerC c4=new CustomerC("pqr","@123",104,1234567891); 
    	CustomerC c5=new CustomerC("xyz","@123",105,1234567891); 
    	Vector<CustomerC> clist=new Vector<CustomerC>();
    	clist.add(c5);
    	clist.add(c4);
    	clist.add(c3);
    	clist.add(c2);
    	clist.add(c5);
    	clist.add(c4);
    	clist.add(c1); 
    	System.out.println(clist);
    	for(int i=0;i<clist.size();i++)
    	{
    		System.out.println(clist.get(i));
    	}
    }
	
}

package com.jsp.collectionsAssignment;

public class Customer implements Comparable<Customer>
{
	private String name;
	private String pw;
	private int id;
	private long mobileNo;

	public Customer(String name, String pw, int id, long mobileNo) {
		super();
		this.name = name;
		this.pw = pw;
		this.id = id;
		this.mobileNo = mobileNo;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPw() 
	{
		return pw;
	}
	public void setPw(String pw) 
	{
		this.pw = pw;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}

	public long getMobileNo() 
	{
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) 
	{
		this.mobileNo = mobileNo;
	}
 
    @Override
    public String toString()
    {
    	return "[ Customer Name: " +name+"pw: "+pw+"id: "+id+"MobileNo: "+mobileNo+" ]";
    }
	
	@Override
	public int compareTo(Customer o) 
	{	
		return this.id-o.id;
	}
	
	
	
    
}

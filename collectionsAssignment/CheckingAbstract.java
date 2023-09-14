package com.jsp.collectionsAssignment;

 interface Checking
 {
	void pkglevel();
   	protected  void count();
 }
 class Demo implements Checking
 {
	 @Override
	 public  void pkglevel()
	 {
		 System.out.println("pkglevel can be abstracted");
	 }

	@Override
	public void count() 
	{
		System.out.println("protected can be abstracted");	
	}
	
	
 }
public class CheckingAbstract
{
	
	public static void main(String[] args) 
	{
       Demo d1=new Demo();
       d1.pkglevel();
       d1.count();
       
	}

}

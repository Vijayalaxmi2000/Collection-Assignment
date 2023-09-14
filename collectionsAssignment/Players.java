package com.jsp.collectionsAssignment;

public class Players implements Comparable <Players>
{
    String name;
    int ranking;
    String team;
	public Players(String name, int ranking, String team) 
	{
		super();
		this.name = name;
		this.ranking = ranking;
		this.team = team;
	}
	@Override
	public String toString()
	{
		return "Player[name: "+ name+" , ranking "+ranking + " , team "+team +"]";
	}
	@Override
	public int compareTo(Players o) 
	{	
		return this.ranking-o.ranking;
	}
    
}

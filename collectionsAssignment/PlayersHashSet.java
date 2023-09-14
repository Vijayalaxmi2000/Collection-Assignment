package com.jsp.collectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PlayersHashSet 
{
	public void addplayerdetails()
	{
		Players p1=new Players("Virat Kohli",1,"RCB");
		Players p2=new Players("Rohit Sharma",5,"MI");
		Players p3=new Players("Suresh Raina",3,"CSK");
		Players p4=new Players("ABD",2,"RCB");
		Players p5=new Players("K L Rahul",4,"KXIP");
		HashSet<Players> plist=new HashSet<Players>();
		plist.add(p1);
		plist.add(p5);
		plist.add(p2);
		plist.add(p4);
		plist.add(p3);
		System.out.println(plist);
		ArrayList<Players> players = new ArrayList<Players>(plist);
		System.out.println(players);
		Collections.sort(players);
		players.forEach(obj->System.out.println(obj));
		
	}

	public static void main(String[] args) 
	{
		PlayersHashSet ph=new PlayersHashSet();
		ph.addplayerdetails();

	}

}

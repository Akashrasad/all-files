package arra;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class hello {
	public static void main(String[] args) {
		SortedSet ss=new TreeSet();
		ss.add("a");
		ss.add("b");
		ss.add("c");
		ss.add("d");
		ss.add("e");
		ss.add("f");
		ss.add("g");
		SortedSet ss2=ss.headSet("e");
		Iterator ssitr2=ss2.iterator();
		while(ssitr2.hasNext())
		{
		System.out.println(ssitr2.next().toString());
		}
		}


}

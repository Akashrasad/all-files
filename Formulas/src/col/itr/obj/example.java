package col.itr.obj;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.html.HTMLDocument.Iterator;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<>();
	names.add("hi");
	names.add("hello");
	names.add("good");
	names.add("night");
	System.out.println(names);
	
	// traversing  iterator
	//for each loop;
	for(String str:names) {
		System.out.print(str+"\t"+str.length()+"\t");
		 StringBuffer br=new StringBuffer(str);
		 System.out.println(br.reverse());
	}
	System.out.println("_________________________________________");
	//traversing using Iterator
	java.util.Iterator<String> itr = names.iterator();
	while(itr.hasNext()) {
		String next =itr.next();
		System.out.println(next
				);
	}
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
	//backward traversal of collection Listitarator
	ListIterator<String> litr=names .listIterator(names.size()
			);
	while(litr.hasPrevious()) {
		String previous=litr.previous();
		System.out.println(previous);
	}
	//h.w--Enumeration
	//for each method
	//names.forEach(e ->{ System.out.println(e);  });
	names.forEach(e->{
		System.out.println(e);
	});
	System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	names.forEach(e -> {
		System.out.println(e);
	});
	names.forEach(e -> {
		System.out.println(e);
	});

	}
	TreeSet<String> set=new TreeSet<>();
	
//	set.ad(names);
//	set.forEach(e -> {System.out.println(e);});
	

}

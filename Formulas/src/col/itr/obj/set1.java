package col.itr.obj;

import java.util.ArrayList;
import java.util.TreeSet;

public class set1 {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<>();
	names.add("hi");
	names.add("hello");
	names.add("good");
	names.add("night");
	System.out.println(names);
	TreeSet<String> set=new TreeSet<>();
	set.addAll(names);
	set.forEach(e -> {
		System.out.println(e);
	});
	//comaparable
	//comparator
	
}
}

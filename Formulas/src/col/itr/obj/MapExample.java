package col.itr.obj;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> courses=new HashMap<>();
		//adding elements
		courses.put("core", 4000);
		courses.put("basic", 3500);
		courses.put("gwsbgd", 5000);
		courses.put("android",83273);
		System.out.println(courses);
//		set.forEach(e -> {
//			System.out.println(e);
//		});
//		courses.forEach(e -> {
//			System.out.println(e);
//			});
		courses.forEach((e1,e2) -> {
			System.out.println(e1+"=>"+e2
					);
		});
		courses.forEach((key,value) ->{
			System.out.println(key);
			System.out.println("=>");
			System.out.println(value);
			System.out.println();
		});
		//entry set
		//key set
		System.out.println(courses.get("core")
				);
		
	}

}

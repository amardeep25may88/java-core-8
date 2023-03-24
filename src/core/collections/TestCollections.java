package core.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class TestCollections {

	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<>();
		List<String> list=new ArrayList<>();
		list.add("amardeep");
		list.add("karan");
		list.add("ajay");
		list.add("rahul");
		list.add("alok");
		list.add("alok");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			 String i = itr.next();
			set.add(i);
		}
		
		Iterator<String> itr1=set.iterator();
		while(itr1.hasNext()) {
			 String i = itr1.next();
			System.out.println(i);
		}
	}

}

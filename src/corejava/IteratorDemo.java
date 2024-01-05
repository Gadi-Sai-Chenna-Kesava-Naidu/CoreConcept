package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Sai");
		list.add("Pavan");
		list.add("Jeevana");
		list.add("Deeksha");
		list.add("Siddhu");
		list.add("Harsha");
		
		System.out.println("List Of Names: "+list);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("Sai")) {
				itr.remove();
				System.out.println(str + " is removed.");
			}
		}
		System.out.println("List :"+list);
	}

}

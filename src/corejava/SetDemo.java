package corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		//it don't allow duplicates
		//HashSet -- Random Order
		//Linked HashSet -- Insertion Order
		//TreeSet -- Sorting Order
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(7);
		list.add(7);
		list.add(5);
		
		System.out.println("List Of Numbers :"+list);
		
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int number:list) {
			set.add(number);
		}
		
		int sum_of_numbers =0;
		for(int num:set) {
			sum_of_numbers = sum_of_numbers + num;
		}
		
		System.out.println("Sorting Order of Numbers after removing Duplicates :"+set);
		System.out.println("Sum of Numbers: "+sum_of_numbers);
		
	}

}


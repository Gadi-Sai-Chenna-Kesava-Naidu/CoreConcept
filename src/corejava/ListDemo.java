package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		//Insertion Order
		//allows duplicated
		//allows null value
		Employee employee = new Employee("Pavan", "Phanindra", "Analyst", "pavan@gamil.com", 9876567890L,
				"Bangolaore");
		
		Employee employee1 = new Employee("Gadi Sai", "Chenna Kesava Naidu", "Analyst", "sai@gamil.com", 9876543210L,
				"Hyderabad");
		
		Employee employee2 = new Employee("Jeevana", "Sree", "Analyst", "jeevana@gamil.com", 9123456780L,
				"Chennai");
		
		Employee employee3 = new Employee("Sai", "Siddhu", "Senior Analyst", "siddhu@gamil.com", 9123456708L,
				"Chennai");
		
		Employee employee4 = new Employee("Shanmukh", "Harsha", "Associate Analyst", "harsha@gamil.com", 9123456087L,
				"Chennai");
		
		Employee employee6 = new Employee();
		
		List<Employee> employee_list = new ArrayList<Employee>();
		
		employee_list.add(employee);                 //adding an employee
		employee_list.add(employee1);
		employee_list.add(employee2);
		employee_list.add(employee3);
		employee_list.add(employee4);
		
		for(Employee emp:employee_list) {
			System.out.println(emp);
		}
		
		System.out.println("===================================================");
		//removing an employee whose firstName is "Gadi Sai"
		Iterator<Employee> iterator = employee_list.iterator();
		while(iterator.hasNext()) {
			Employee employee5 = iterator.next();
			if(employee5.getFirstName().equalsIgnoreCase("Gadi Sai")) {
				iterator.remove();
				System.out.println("Employee with "+employee5.getFirstName()+" is Removed.");
			}
		}
		
		for(Employee emp:employee_list) {
			System.out.println(emp);
		}
		
	}
}

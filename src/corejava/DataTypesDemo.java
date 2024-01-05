package corejava;

import java.util.Arrays;

public class DataTypesDemo {
	
	public static void main(String[] args) {
		
		//primitive data types - byte,short,int,long,float,double,char,boolean
		
		int number = 10;               
		System.out.println("Integer -"+number);
		
		byte number_1 = 12;
		System.out.println("Byte -"+number_1);
		
		short number_2;
		number_2 = 129;
		System.out.println("Short -" +number_2);
		
		long number_3 = 12345678909876L;
		System.out.println("Long -"+number_3);
		
		float number_4 = 123.234f;
		System.out.println("Float -"+number_4);
		
		double number_5 = 123.45;
		System.out.println("Double -"+number_5);
		
		boolean value = false;
		System.out.println("Boolean -"+value);
		
		char character = 'a';
		System.out.println("Character -"+character);
		
		System.out.println("=================================");
		
		
		//non-primitive data types
		//String
		
		String name = "Sai Chenna Kesava Naidu";   //String is a combination of characters
		System.out.println(name);
		
		String firstname = new String("Pavan");
		System.out.println(firstname);
		
		char[] lastname = {'K','u','m','a','r'};      //another way of declaring array
		String lname = new String(lastname);
		System.out.println(lname);
		
		System.out.println("Length Of String : "+name.length());
		
		String[] names = name.split(" ");
		for(String part:names) {
			System.out.println(part);
		}
		
		System.out.println(Arrays.toString(names));
		
	}

}

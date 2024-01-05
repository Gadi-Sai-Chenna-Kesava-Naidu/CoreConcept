package corejava;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		String[] names ;
		names = new String[6];
		
		names[0] = "Siddhu";      //one way to store the value
		names[1] = "Harsha";
		names[2] = "Jeevana";
		names[3] = "deeksha";
		names[4] = "nikshita";
		names[5] = "deekshita";
		
		System.out.println(Arrays.toString(names));
		
		names[2] ="Jeeva Sree";
		
		System.out.println(Arrays.toString(names));   //changing the already existed value
		
	}

}

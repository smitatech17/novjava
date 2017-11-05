package Homework;

import java.util.Scanner;

public class hw3_1_oct21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A census is going on in your county. 
		//Make a program that will allow you to input a person's name , age , and occupation. 
		//After inputing the person's information will display
	
		Scanner reader=new Scanner(System.in);
		System.out.println("Input person's name");
		String name=reader.next(); 
		
		
		System.out.println("Input person's age");
		int age=reader.nextInt(); 
		
		System.out.println("Input person's occupation");
		String occupation=reader.next();
		
		System.out.println("Person's name is "+ name); 
		System.out.println("Person's age is "+ age); 
		System.out.println("Person's occupation is "+ occupation);
	
	}

}

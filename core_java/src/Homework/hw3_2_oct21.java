package Homework;

import java.util.Scanner;

public class hw3_2_oct21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Make a currency converter program , that will allow you to convert any inputed amount of US Dollar to Yen. 
		//Check the conversion rate from online.
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter dollar amount");
		int a=reader.nextInt();
				
		double yen=a*112.08;
		
		System.out.println("this dollar amount is equivalent to "+ yen +" yen");
		
	}

}

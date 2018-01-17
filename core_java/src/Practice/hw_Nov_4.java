package Practice;

import java.util.Scanner;

public class hw_Nov_4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String x="momo";
	String y="chicken";
	String z="burger";
		
		Scanner reader=new Scanner(System.in);
		System.out.println("name");
		String name=reader.next(); 
	
	if (name==x) {
		
			System.out.println("price is $5");}
	if (name==y) {
		System.out.println("price is $8");}
	else if (name==z)
	{
		System.out.println("no food");
		
	}
	}
}



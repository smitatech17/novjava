package Practice;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class classwork_Oct_29_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner read=new Scanner(System.in);
		//System.out.println("Input a number: ");
		//int a = read.nextInt();
		//System.out.println(a);
		
		String number;
		number=JOptionPane.showInputDialog("choose a number: "); //this has to be a string
		int convernum=Integer.parseInt(number);// convert to an int:::convernum
		System.out.println(number);
		
		Random rand=new Random();
		int n=rand.nextInt(5);
				
		number=JOptionPane.showInputDialog(null,"This is my message", "This is my input box", n);
		
		System.out.println("Your random number is: " +n);
		System.out.println("you guessed: "+convernum);
		
		if(convernum==n) {
			System.out.println("you guessed it correctly");
		}else {
				System.out.println("your guess is incorrect");
		}
		
	}

}

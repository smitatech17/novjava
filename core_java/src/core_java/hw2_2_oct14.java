package core_java;

public class hw2_2_oct14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Make a 3X4 double array table that displays food name. print 1st row column 2, and 3 row column 4
		
		String Food[][]=new String[3][4];
		
		//1st row
		Food[0][0]="Rice";
		Food[0][1]="Roti";
		Food[0][2]="Biryani";
		Food[0][3]="Pulaou";
		
		//Second row
		Food[1]	[0]="Barbeque";
		Food[1][1]="Pasta";
		Food[1][2]="Bread";
		Food[1][3]="Paratha";
		
		//third row
		Food[2][0]="ice-cream";
		Food[2][1]="Pie";
		Food[2][2]="cake";
		Food[2][3]="brownie";
		
		System.out.println(Food[0][1]);
		System.out.println(Food[2][3]);
		
		
		
		
		
		
		
	}

}

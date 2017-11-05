package Homework;

public class hw3_4_oct21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Make a  2X3 double array and list the number of countries you want to visit. 
		//Then print all the values from the table.

		String countries[][]=new String[2][3];
		//first row
		countries[0] [0]="Great Britain";
		countries[0] [1]="Italy";
		countries[0] [2]="Switzerland";
			
		//second row
		countries[1] [0]="India";
		countries[1] [1]="Canada";
		countries[1] [2]="Mexico";
				
		int rows=countries.length;
		int columns=countries[0].length;
		
		for(int rownum=0; rownum<rows; rownum++) {
			
		for(int colnum=0; colnum<columns; colnum++) {
				
		System.out.println(countries[rownum][colnum]);
				
	}
		}
}
}

package core_java;

public class Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String flights[][]=new String[4][4];
		//first row
		flights[0] [0]="Dallas";
		flights[0] [1]="New York City";
		flights[0] [2]="Miami";
		flights[0] [3]="Chicago";
		
		//second row
		flights[1] [0]="LA";
		flights[1] [1]="Seatle";
		flights[1] [2]="Washington DC";
		flights[1] [3]="Newark"; 
		
		//third row
		flights[2] [0]="New Orleans";
		flights[2] [1]="Baton Rouge";
		flights[2] [2]="Kansas";
		flights[2] [3]="Toronto";
		
		//fourth row
		flights[3] [0]="Denver";
		flights[3] [1]="Honolulu";
		flights[3] [2]="Anchorage";
		flights[3] [3]="Houston";
		
		//System.out.println(flights[2][1]);
		//System.out.println(flights[3][2]);
		//System.out.println(flights[0][0]);
		
		int rows=flights.length;
		int columns=flights[0].length;
		
		//argument for rows
		
		for(int rownum=0; rownum<rows; rownum++) {
			
		//argument for column
			
		for(int colnum=0; colnum<columns; colnum++) {
				
		//argument for printing rows and columns together
				
		System.out.println(flights[rownum][colnum]);
				
				//for ( int x=0; x<flights.length; x++) {
						
				//for (int y=0; y<flights [0].length; y++){
				
				//System.out.println(flights[x][y]);	
			}
			
		}
					
		
	}

}

package core_java;

public class Single_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Rainbow[]= new String[7];
		
		Rainbow[0]="yellow";
		Rainbow[1]="blue";
		Rainbow[2]="red";
		Rainbow[3]="green";
		Rainbow[4]="violet";
		Rainbow[5]="indigo";
		Rainbow[6]="orange";
		
		//System.out.println(Rainbow[0]);	
		//System.out.println(Rainbow[4]);
		
		//		System.out.println(Rainbow.length); // gives you a table row count
		
		for(int x=0; x<Rainbow.length;x++)	
		{
			System.out.println(Rainbow[x]);
		}
		}
	}



package core_java;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum();
		argument_sum(8,7);
		substract();
		argument_sub(10,12);
	}	
		
		
	public static void sum()
	{
		int add=9+8;
		System.out.println(add);
	}

	
	public static void argument_sum(int a, int b) {
		
		int adding=a+b;
		System.out.println(adding);
		
	}
	
	public static void substract()
	{
		int subs=9-8;
		System.out.println(subs);
	}
	
	public static void argument_sub(int c, int d) {
		int substracting=c-d;
		System.out.println(substracting);
	}
	
}

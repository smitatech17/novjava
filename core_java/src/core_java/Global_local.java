package core_java;

public class Global_local {
	
	static int c=500; // global variable can be called in any function
int b=200; //non static global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 age();
	salary();
	System.out.println(c);
	
	Global_local y=new Global_local();
	System.out.println(y.b); //printing a non static global variable
	
	}
public static void age(){
	int x=3+c; // local variable - you can use local variable for a specific function only
	System.out.println(x);
	System.out.println(c);
}

public static void salary() {
	int y=300; // local variable
	System.out.println(y);
	System.out.println(c);
	}	

public static void apple() {
	System.out.println(c);
}
}

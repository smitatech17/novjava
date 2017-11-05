package Practice;

public class classwork_Oct_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x=20;
	int y=30;
	int z;
	System.out.println("My age is " + x);//concat
	System.out.println("My sister's age is " + y);
	System.out.println("Our total age is " + (x+y));
	
	z=x;//swap
	x=y;
	y=z;
	
	System.out.println("My age is " + x);
	System.out.println("My sister's age is " + y);
	
	if (x>21)//if else loop
	System.out.println("I can drink");
	else
		System.out.println("I can't drink");
	if(y>21)
		System.out.println("My sister can drink");	
	else
		System.out.println("My sister can't drink");}

}

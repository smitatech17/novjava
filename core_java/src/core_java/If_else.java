package core_java;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i=500;
	int j=200;
	int a=300;
	
	//System.out.println(i);
	//System.out.println(j);
	//System.out.println(a);
	
	if (i==j) //condition
		System.out.println("value of i and j are equal");
	else
		System.out.println("value of i and j are not equal");
	
	if(i<j)
		System.out.println("i is less than j");
	else
		System.out.println("i is not less than j");
	
	if (i<a)
		System.out.println("i is less than a");
	else
		System.out.println("i is not less than a");
	
	if (j==a) // equal condition
		System.out.println("value of j and a are equal");
	else
		System.out.println("they are not same, value of j is "+j);
	
	if(!(i==a))// not eual condition
		System.out.println("a and i are not the same");
	else
		System.out.println("a and i are the same");
			
	}

}

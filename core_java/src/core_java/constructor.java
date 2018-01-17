package core_java;
//constructor is an instance method that usually has the same name as class, 
//and it is used for assigning a new default value
//constructor should be always non static

public class constructor {

	int age;   //variable without values
	int salary; //default values are 0,0,0, null
	int house;
	String name;
	// the purpose of constructor is to rewrite your default values.
	//constructor variables always have to be non-static.
	
	constructor(){
	
		int age=20;       //in this constructor method we are giving new values and printing the values
		int salary=1000;
		int house=2;
		String name="John";
		
	System.out.println(age);
	System.out.println(salary);
	System.out.println(house);
	System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructor x=new constructor();//we are executing the constructor method with the object 
		
	}

}

package core_java;

public class Non_static {

//to call a non static function, we have to make an object, and an object is instance of a class
//if static is not mention in a function, it becomes non static	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Non_static x=new Non_static(); //object=instance of a class
x.car();
x.flower();
x.school();
x.country();
	}

	public void car() { // non static function. non static functions can be called everywhere easily
		System.out.println("Toyota");
	}
	
	public void flower() {
		System.out.println("rose");
	}
	
	public void school() {
		System.out.println("high school");
	}
	
	public void country() {
		System.out.println("Nepal");
	}
	
}

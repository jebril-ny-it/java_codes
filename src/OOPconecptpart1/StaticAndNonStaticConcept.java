package OOPconecptpart1;

public class StaticAndNonStaticConcept {

	//global variables; the scope of global variables will be available across all the functions
	//if its a static variable than you can call them directly or by class name...
	//if the are non static than you can call them threw an object ref. variable...
	
	
	
	String name="tom";
	static int age =25;
	
	public static void main(String[] args) {
	
		//how to call static methods and variables
		//1-direct calling
		sum();
		//2-calling by class name
		StaticAndNonStaticConcept.sum();
		
		//calling non static global variables;
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static variables and methods
		StaticAndNonStaticConcept object=new StaticAndNonStaticConcept();
		object.sendmail();
		System.out.println(object.name);
		
		//can i access static method by using object reference? yes
		object.sum();//warning will be given-->should be accessed in static way
		
		
		
		
	}

public void sendmail() {
	System.out.println("send mail method");
}

public static void sum() {
	System.out.println("sum method");
}



}

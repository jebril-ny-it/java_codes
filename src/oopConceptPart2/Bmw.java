package oopConceptPart2;

public class Bmw extends Car {

	
	
		// TODO Auto-generated constructor stub
	
	//method overriding
	//when same method is present in parent class
	//as will as in child class with the same name 
	//and same number of arguments thats method overriding
	
		// TODO Auto-generated constructor stub
	
	//constructor
	public Bmw(String happy) {
		super(happy);
		// TODO Auto-generated constructor stub
	}
	public void start() {  //overridding method
		System.out.println("bmw starts");
		}
	public void theftsafety() {
		System.out.println("bmw theft safety");
	}
	public static void main(String[] args) {
	
		String a="ahmad";
		String b="mahmouda";	
		System.out.println(a+b);
	
	
	
		int c=100;
		int d=200;
		System.out.println(c+d);
	
		System.out.println(a+b+c+d);
		System.out.println(c+d+b+a);
		System.out.println(a+b+(c+d));
	
	
		double f=10.00;
		double u=20.00;
		System.out.println(f+u);
	
	
	
	
	
	
		//morning practice//
		String w ="money";
		String f1 ="dollars";
	
		System.out.println(w+f1);
	
		System.out.println(f1+w);
	
	
		double mo=20.90;
		double so=20.99;
	
		System.out.println(mo+so);
		System.out.println(so+mo);
	
	
		System.out.println(w+f1+mo+so);
		System.out.println(so+mo+w+f1);
	
		System.out.println(w+f1+(mo+so));
	
	}


}

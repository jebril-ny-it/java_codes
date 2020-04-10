package OOPconecptpart1;



public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading object=new MethodOverLoading();
		object.sum();
		object.sum(10);
		object.sum(10,15);
		object.sum(12.0, 12.9);
		object.sum(1, 10.19);
		object.sum("hi my name is string", 29.99);
		
	
	
	}
	
	public static void main(int p) {
		
	}
	public static void main(int p,int h) {
		
	}
	//we can overload main method also;
	
	//you can not create a method inside another method;
	
	//method overloading-->when the method name is the same with different input parameters
	//('arguments and different data types'}within the same class
	
	public void sum() {
		System.out.println("sum method --zero input parameters");
		
	}
	
	public void sum(int i) {
		System.out.println("sum method--one input parameter");
		System.out.println(i);
	}

	public void sum(int k,int l) {
		System.out.println("sum method--two input parameter");
		System.out.println(k+l);
		
	}
	
///new practice monday feb 24
	public void sum(double a, double b) {
	System.out.println("sum method--two input parameteres");
	System.out.println(a+b);
}

	public void sum(String a,double f) {
	System.out.println("sum method--two different input parameters");
	System.out.println(a+f);
}
	
	public void sum(int f ,double n) {
	System.out.println("sum method--two different inpur parameters");
	System.out.println(f+n);
	
}	
	
	

}

package Begginer;

public class IfElseComparisonOpereators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		double c=40.444;
		
		
		
		if(a>b) {
			System.out.println("Happy");
		}else if (c<a) {
			System.out.println("money");
		}else if (b<c) {
			System.out.println("paper");
		}else {
			System.out.println("Dat right");
		}
	
		
		

		if(a>b && b<a) {
			System.out.println("Happy");
		}else if (c<a && c>a) {
			System.out.println("money");
		}else if (b<c && c>a) {
			System.out.println("paper money");
		}else {
			System.out.println("Dat right");
		}
	
	
	
	
	double m=12.0;
	double n=13.0;
	int f=25;
	if (m>n) {
		System.out.println("learn more");
	}else if (f<n) {
		System.out.println("need more");
		
	}
	
	
	
	
	
	
	
	
	}

}

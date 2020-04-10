package OOPconecptpart1;

//main is always void because void never returns a value.....
//need more practice here//

public class FunctionsInJava {




	public static void main(String[] args) {
		FunctionsInJava object=new FunctionsInJava();
		
		object.test();

		int m=object.test2();
		System.out.println(m);
	
		String a=object.test3();
		System.out.println(a);
		
		int f=object.division(10, 10);
		System.out.println(f);
	}




	//non static method

	//void-- does not return value
	//return type=void
	public void test() {
		System.out.println("no input no output");
	}

	//return type=int
	public int test2() {
		System.out.println("no input some output");
		int a=10;
		int b=20;
		int c=a+b;
		return c;

	}
	//return type=string
	public String test3() {
		System.out.println("no input:::some output");
		String s= "seluinum";
		return s;

	}

	//return type-->int
	//x,y-->input parameters/arguments
	public int division(int x, int y ) {
		System.out.println("some input some output");
		int d=x/y;
		return d;

	}



}

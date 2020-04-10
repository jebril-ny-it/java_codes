package OOPconecptpart1;

public class Car {

	int mod;
	int wheel;

	
	
	public static void main(String[] args) {
	
		//new)();----this is the object of car class
		//(NEW) keyword is used to create the object.
		//a,b,c---->ARE THE OBJECT REFRENCE VARIABLES....
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
			
		
		a.mod=2020;
		a.wheel=4;
		
		b.mod=2019;
		b.wheel=6;
		
		c.mod=2018;
		c.wheel=18;
		
		System.out.println("before assigning the refrences");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		
		System.out.println("after shifting the refrences");

		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);//10
		c.mod=20;
		System.out.println(a.mod);//20
		System.out.println(c.mod);//20
		
	}

}

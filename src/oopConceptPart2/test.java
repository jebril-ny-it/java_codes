package oopConceptPart2;

public class test {

	public static void main(String[] args) {
	
		//static polymorphisim or compile time polymorphism
		//many methods ny overriding
		Bmw bmw=new  Bmw ("hi"); 
		 bmw.start();
		 bmw.stop();
		 bmw.refuel();
		 bmw.theftsafety();
	
		 System.out.println("*******");
			
		 Car c=new Car("hi");
		 c.start();
		 c.stop();
		 c.refuel();
		 
		 System.out.println("==========");
	//top casting
	Car c1=new Bmw("hi");//child class object can be referred by parent class
	//refrence variable--dynamic polimorphism-->>run time polimorphism
	c1.start();
	c1.stop();
	c1.refuel();
	
	
	//down casting		//ClassCastException Error
// Bmw b1=(Bmw)new Car();	
	}

}

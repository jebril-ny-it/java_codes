package abstractConcept;


public abstract class Bank {
	
	//interface should be used when using 100% abstract methods.hides all methods 
	//abstraction should be used when creating abstract and non abstract classes
	//partial abstraction
	//hiding the implementation logic--thats abstraction
	// abstract class can have abstract methods and non abstract methods
	public abstract void loan();// abstract method
								// no method body
	//non abstract methods
	public void credit() {
		System.out.println("bank ---credit");

	}

	public void debit() {
		System.out.println("bank ---debit");
	}

}

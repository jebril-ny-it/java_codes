package OOPconecptpart1;

import javax.xml.transform.Source;

public class ConstructorConcept {

	// class variables
	String name;
	int age;

	// default constructor 0 parameters
	public ConstructorConcept() {
		System.out.println("deafult constructor");
	}

	// i parameters
	public ConstructorConcept(int i) {
		System.out.println(i);
		System.out.println("1 parameters");
	}

	public ConstructorConcept(int i, int j) {
		System.out.println(i + j);
		System.out.println("2 parameters");
	}

	public ConstructorConcept(String name, int age) {
		this.name=name;
		this.age=age;
		
	}

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);
		ConstructorConcept obj3 = new ConstructorConcept("tom", 25);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		
	}

}

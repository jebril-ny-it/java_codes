package OOP3;

import oopConceptPart2.test;

public class Test extends Shape {

	Test(){
		System.out.println("test class constructor");
	}
	
	
	public static void main(String[] args) {

		//Shape s = new Test();
		//s.drawing();
		//s.fill();
		
		Test test = new Test();
		
	}

	@Override
	void drawing() {
		System.out.println("test drawing");
		
	}

	
	

	}



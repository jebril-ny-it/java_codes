package FinalFinallyFinalizeConcept;

import java.lang.management.GarbageCollectorMXBean;

public class FinalizeConcept {

	
	//finalize is a mthod 
	public void finalize() {
		System.out.println("finalize method");
	}
	
	
	
	public static void main(String[] args) {
	
		FinalizeConcept f1= new FinalizeConcept();
		
		FinalizeConcept f2= new FinalizeConcept();
		
		
		f1 = null;
		f2= null;
		
		System.gc();
		
		
		
		
		
	}

}
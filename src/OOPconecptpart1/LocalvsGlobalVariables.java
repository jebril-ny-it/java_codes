package OOPconecptpart1;

//difference between local and global variables

public class LocalvsGlobalVariables {

	String name="tom";
	int age =25;
	
	public static void main(String[] args) {
	//local variables for main method;
		int i=10;
	System.out.println(i);
		
	LocalvsGlobalVariables object=new LocalvsGlobalVariables();
	object.sum();
	System.out.println(object.name);
	System.out.println(object.age);
	
	}	

	public void sum() {
	//local variables;	
	int i1=15;
	int j=20;
	
	
	System.out.println(i1);
	System.out.println(j);
	
	}
	                 
	
}

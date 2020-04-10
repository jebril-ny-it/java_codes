package ListConcept;


import java.util.ArrayList;
import java.util.Iterator;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class ArrayLIst {

	public static void main(String[] args) {

		//static array== size is fixed 1d or 2d array
		
		//dynamic array= arraylist
		
		//1.it can contain duplicate values/elements
		
		//2.maintains insertion order..(0,1,2,3,4)
		
		//3.  synchronized
		
		//4.allows random access to fetch any element because it stores the values on the basis of index
		
		ArrayList ar= new  ArrayList();
		
		//non generic arraylist object;;can store different types of values
		
		ar.add(100);	//0
		ar.add(200);	//1
		ar.add(300);	//2

		System.out.println(ar.size());

		ar.add(400);	//3
		ar.add(500);	//4

		System.out.println(ar.size());
		ar.add("tom");	//5
		ar.add("hello");	//6
		ar.add(12.33);	//7
		ar.add('m');	//8
		ar.add(600);	//9
		
		System.out.println(ar.size());

	//ar.remove will remove from array-list
		
		ar.remove(9);
		
		System.out.println(ar.size());//size of array
		
		System.out.println(ar.get(4));//get the value of an index
		System.out.println(ar.get(7));

		//for loop in order to print all values from arraylist
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		//generic array-list object;can only store specific variable value 

	ArrayList<Integer> ar1 =new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("tom");
		
		//generic array-list object;can only store specific variable value 

	ArrayList<String> ar3 = new ArrayList<String>();	
		ar3.add("generic array using a string");

		
		
		
		//create class object
		Employee e1=new Employee("mjay", 29,"qa");
		Employee e2=new Employee("shakir", 25,"scrum master");
		Employee e3=new Employee("shahid", 31,"lead");
	
	//create array-list
	ArrayList<Employee> ar4 = new ArrayList<Employee>();
	
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	
	//iterator to traverse the values
	
	Iterator<Employee> it = ar4.iterator();
	
	while(it.hasNext()) {
	Employee emp= it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
	
	System.out.println("===========");
	
	//add all
	
	ArrayList<String> ar5= new ArrayList<String>();
	
	ar5.add("test");
	ar5.add("java");
	ar5.add("mohammad");
	System.out.println(ar5);
	System.out.println("=======");
	
	ArrayList<String> ar6= new ArrayList<String>();
	
	ar6.add("test");
	ar6.add("sql");
	ar6.add("iqra");
	
	//i added ar5 + AR6
	ar5.addAll(ar6);
	
	for (int i = 0; i < ar5.size(); i++) {
		System.out.println(ar5.get(i));
		
	}
	//I SUBTRACTED AR5 - AR6	///why is it not working
	//remove all
	System.out.println("=============");
	
	ar5.removeAll(ar6);
	for (int i = 0; i < ar5.size(); i++) {
		System.out.println(ar5.get(i));
	}
	System.out.println(ar5);
	//retain all
	
	
	
	}

}

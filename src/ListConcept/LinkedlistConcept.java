package ListConcept;

import java.sql.Savepoint;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class LinkedlistConcept {

	public static void main(String[] args) {
	
		LinkedList<String > ll = new LinkedList<String>();
	
	//add
		ll.add("test");
		ll.add("qtp");
		ll.add("selinum");
		ll.add("Rpa");
		ll.add("Rft");
		
	//print
		System.out.println("content of linked list"+ll);
		
	//add first
		
	ll.addFirst("BigMoney");
	
	//add last
	ll.addLast("automation");
	System.out.println("content of linked list"+ll);
	
	//get inside the value
	System.out.println(ll.get(0));
	
	//set the value///insert
	ll.set(0, "tom");
	System.out.println(ll.get(0));
	
	//remove first and last element
	ll.removeFirst();
	ll.removeLast();
	
	System.out.println("content of linked list"+ll);
	
	//remove an index
	ll.remove(2);
	System.out.println("content of linked list"+ll);
	
	//how to itertate/print all the values of linkedlist
	
	//for loop
	System.out.println("=====using for loop");
	for (int i = 0; i < ll.size(); i++) {
		System.out.println(ll.get(i));
		}
	
	//advanced for loop
	System.out.println("=====using advanced for each loop");
	for(String str : ll) {
		System.out.println(str);
	}
	
	//iterator
	System.out.println("=====using iterator");
	Iterator<String> it=ll.iterator();
	while (it.hasNext()) {
	System.out.println(it.next());
		
	}
	
	
	//while loop
	System.out.println("=====using while loop");
	int num=0;
			while (ll.size()>num) {
				System.out.println(ll.get(num));
			num++;
			}
	
	}
	
	
	}



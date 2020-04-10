package Begginer;

import java.io.ObjectInputStream.GetField;
import java.util.Hashtable;

public class HashTabelConcept {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();

		h.put("A", "Test");
		h.put("b", "Hello");
		h.put("c", "World");

		System.out.println(h.size());

		h.put(1, 100);
		h.put(2, 200);

		System.out.println(h.get(2));
		System.out.println(h.get("c"));

		h.put(3, "tom");

		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 100);
		h1.put(10, 200);
		;
		System.out.println(h1.get(10));

		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(100, "mike");
		h2.put(1000, "jack");
		
		System.out.println(h2.get(100));

	}

}

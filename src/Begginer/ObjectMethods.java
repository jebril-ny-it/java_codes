package Begginer;

import java.io.ObjectInputValidation;

public class ObjectMethods {

	double grosspay;
	String prductName;
	int hourlyRate;

	public static void main(String[] args) {

		ObjectMethods a = new ObjectMethods();
		ObjectMethods b = new ObjectMethods();
		ObjectMethods c = new ObjectMethods();

		a.grosspay = 100;
		b.prductName = "cat";
		System.out.println(a.grosspay);
		System.out.println(b.prductName);
		// practice concatination
		System.out.println(a.grosspay + b.prductName);

		ObjectMethods me = new ObjectMethods();
		ObjectMethods him = new ObjectMethods();
		ObjectMethods her = new ObjectMethods();
		ObjectMethods heshe = new ObjectMethods();

		me.grosspay = 1200;
		me.hourlyRate = 50;
		me.prductName = "ENGINEER";

		//////train practice 03/02/2020 night
		System.out.println(me.grosspay + me.hourlyRate + me.prductName);

		System.out.println("++++++++++============+++++++++=+++=====+++++++======");

		him.grosspay = 1900;
		him.hourlyRate = 150;
		him.prductName = "mechanical";
		System.out.println(him.grosspay);

		her.grosspay = 12000;
		her.hourlyRate = 200;
		her.prductName = "doc";
		System.out.println(her.prductName);

		System.out.println("+++==========================================");

		heshe.grosspay = 122;
		heshe.hourlyRate = 12;
		heshe.prductName = "nyll";

	}

}

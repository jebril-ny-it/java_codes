package Begginer;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;
import javax.xml.bind.ParseConversionEvent;
import javax.xml.transform.Source;
import javax.xml.ws.Holder;

public class DataTypes {

	public static void main(String[] args) {
		// train practice 03/02/2020

		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000000; // 2.1 billion
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F; // machine dependent //6 decimal places
		double bigDouble = 3.148765434567887654345; // 15 decimal places //it can take alot more value than float
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		boolean trueOrFalse = true;
		char randomChar = 66;
		char achar = 'A';
		char escapecharacters='/';
		
		String bytestring=Byte.toString(bigByte);
		String shortstring=Short.toString(bigShort );
		String intstring=Integer.toString(bigInt);
		String longstring=Long.toString(bigLong );
		String doublestring=Double.toString(bigDouble);
		String floatstring=Float.toString(bigFloat);
		String booleanstring=Boolean.toString(trueOrFalse);
		
		double aDoubleValue = 3.1456788;
		int doubleToint = (int)aDoubleValue;
	
		int stringToInt = Integer.parseInt(intstring);
		
		//parseShort, parseLong, parseDouble, parseInt, parseBoolean, parseByte
		
		
		
		System.out.println(achar);
		System.out.println(randomChar);

		
		
		// premitive data type non premitive
		// int string
		// double array
		// char class
		// boolean interface
		// short
		// long
		// float
		// bite?????not a data type

		int a = 100;
		System.out.println(a);
		a = 10;
		System.out.println(a);

		double b = 100.00;
		System.out.println(b);
		b = 10.00;
		System.out.println(b);

		char m = '1';
		System.out.println(m);
		m = '9';
		System.out.println(m);

		boolean f = true;

		System.out.println(f);
		f = false;
		System.out.println(f);

		// morning practice
		int a7 = 12;
		double f7 = 10.00;
		Boolean m8 = true;
		char b8 = 1;

		int a1 = 20;
		double f1 = 20.00;
		char u = 'm';

	}

}

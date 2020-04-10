package OOPconecptpart1;



public class WrapperClassConcept {

	public static void main(String[] args) {
	
		String x="100";
		System.out.println(x+20);
		
		//Data conversion-string to int;  
	int i=	Integer.parseInt(x);
		System.out.println(i+20);

		//integer ;double;boolean
		
		//string to double conversion
		String y="12.33";
	double a=Double.parseDouble(y);
System.out.println(a+10);	
	
	//string to boolean;
     String k ="true";
	boolean b=Boolean.parseBoolean(k);
	System.out.println(b);
	
	
	//int to string conversion
	int j =200;
	System.out.println(j+20);
	
	String s=String.valueOf(j);//"200"
	System.out.println(s+20);
	
	//String u="100A";
	//Integer.parseInt(u);//numberformat exception--for input string 100A should be pure integar


	
	
	
	
	//shahid practice of wrapper class
	//string into int
	String f="500";
	System.out.println(f);
	int fu=Integer.parseInt(f);
	System.out.println(fu+20);
	
	//int into string
	int ja=600;
	System.out.println(ja+20);
	String mm=String.valueOf(ja);
	System.out.println(mm+29);
	
	//string into double
    String be="10.00";
	double eb=Double.parseDouble(be);
	System.out.println(eb+10);
	
	//string into boolean
	String u="me";
	boolean uu=Boolean.parseBoolean(u);
	System.out.println(uu);
	
	
	
	}

}

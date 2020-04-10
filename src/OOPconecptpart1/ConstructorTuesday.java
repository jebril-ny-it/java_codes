package OOPconecptpart1;

//dynamic when you put value in the parameters

/////constructors
public class ConstructorTuesday {

	String sweet;
	String sour;

	public ConstructorTuesday(String sweet, String sour) {

		this.sweet = sweet;

		this.sour = sour;

	}

	public ConstructorTuesday() {

	}

	public static void main(String[] args) {

		ConstructorTuesday obj = new ConstructorTuesday("happy", "sad");

		ConstructorTuesday obj1 = new ConstructorTuesday();

	}
	////////// method overloading/////////

	public void sum() {

	}

	public void sum(int x, int y) {

	}

	public void sum(String a, String b) {

	}

	public void sum(double u) {

	}

	public void sum(int g, double a) {

	}

}

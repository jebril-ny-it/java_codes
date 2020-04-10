package oopConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.minbal);

		HSBCBank hs = new HSBCBank();

		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationloan();
		hs.carloan(); // called from class not from interface

		// dynamic polimorphism
		// child class object can be reffered by parent interface variable
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();

	}

}

package oopConceptPart2;

public class HSBCBank implements USBank, BrazilBank {// WE ARE ACHIVING MULTIPALE INHERATANCE
	// is a relstionship ;;between interfacde and class
	// has a relationship is between class top class

	// if a class is implementing any interface,
	// than its mandatory to define/override the methods of interface

	public void credit() {
		System.out.println("hsbc---credit");
	}

	public void debit() {
		System.out.println("hsbc---debit");

	}

	public void transferMoney() {
		System.out.println("hsbc---transfer money");
	}

	// SEPERTE METHODS OF HSBC BANK CLASS
	public void educationloan() {
		System.out.println("HSBC education loan");
	}

	public void carloan() {
		System.out.println("HSBC car loan");
	}

	// BRAZIL BANK OVERRIDING
	public void mutualfunds() {
		System.out.println("HSBC MUTUAL FUND THREW BRAZIL BANK");

	}

}

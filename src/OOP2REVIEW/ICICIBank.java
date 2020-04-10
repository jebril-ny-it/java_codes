package OOP2REVIEW;

public class ICICIBank implements USBank, RBI {

	// RBI INTERFACE
	@Override
	public void educationLoan() {
		System.out.println("ICICI EDU LOAN");

	}

	@Override
	public void homeLoan() {
		System.out.println("ICICI HOME LOAN");

	}

	@Override
	public void carLoan() {
		System.out.println("ICICI CAR LOAN");

	}

	// USBANK INTERFACE
	@Override
	public void debit() {
		System.out.println("ICICI DEBIT");

	}

	@Override
	public void credit() {
		System.out.println("CREDIT LOAN");

	}

	@Override
	public void transferMoney() {
		System.out.println("ICICI TRNSFER MONEY");

	}

	@Override
	public void trading() {
		System.out.println(" ICICI trading");

	}

	//icici bank class methods ;
	
	public void mutualfunds() {
		System.out.println(" icici mutual funds");
	}
	
	public void insrance () {
		System.out.println("icici insurance");
		
	}
	
	
	
	
	
	
	
}

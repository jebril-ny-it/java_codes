package OOP2REVIEW;

public class TestBank {

	public static void main(String[] args) {

		ICICIBank ic = new ICICIBank();

		ic.educationLoan();
		ic.homeLoan();
		ic.carLoan();

		ic.credit();
		ic.trading();
		ic.transferMoney();

		ic.mutualfunds();
		ic.insrance();

		System.out.println(USBank.min_bal);

		USBank us = new ICICIBank();

		us.credit();
		us.debit();
		us.trading();
		us.transferMoney();
		
		
	}

}

package abstractConcept;



public class TestBAnk {

	public static void main(String[] args) {
	
		HdfcBank hp=new HdfcBank();
		
		hp.credit();
		hp.debit();
		hp.loan();
		hp.funds();
		
		Bank b = new HdfcBank();
		
		b.credit();
		b.credit();
		b.loan();
		
	}

}

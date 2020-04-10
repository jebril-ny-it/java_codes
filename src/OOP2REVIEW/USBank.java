package OOP2REVIEW;

import org.omg.CORBA.PUBLIC_MEMBER;

public interface USBank {

	int min_bal =100;
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
	
	public void trading();
	
	//no method body ,only method declaration
	//method prototype
	//can not create the object of interface
	//no static methods
	//you can declare a variable
	//interface variables are static by default
	//100% abSTRACTION
	
}

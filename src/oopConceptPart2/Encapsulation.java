package oopConceptPart2;

//encapsulation is when you create  private variable,
//


public class Encapsulation {

	private int gatecode;
	private String students;
	

	
	public int getGatecode() {
		return gatecode;
	
	}
	public void setGatecode(int gatecode) {
		this.gatecode = gatecode;
	}

	
	public String getStudents() {
		return students;
	}
	public void setStudents(String students) {
		this.students = students;
	}


public static void main(String[] args) {
	
	Encapsulation obj= new Encapsulation();
	
	obj.setGatecode(1226);
	System.out.println(obj.gatecode);
	
	obj.setStudents("ahmad");
	System.out.println(obj.students);
	
}






}

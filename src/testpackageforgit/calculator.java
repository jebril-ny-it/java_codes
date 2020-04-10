import java.util.Scanner;

public class calculator {

		
	//variable Decleration
	 static String productName;
	static double quantity;
	static double unitPrice;
	static double total;
	
	
	        //Module : welcome
		public static void welCome() {

			System.out.println("welCome to EMP Cal - Please Fallow Instuctions.....");
			System.out.println("");
			System.out.println("");
				
		}
		
		       //input
		public static void getinput() {
			//Taking an object Refrence for scanning information from any input system
			Scanner hrscan = new Scanner(System.in);
			
			System.out.println("productName: ");
			
			productName= hrscan.nextLine();
			
			System.out.println("quantity");
			quantity = hrscan.nextDouble();
			
			System.out.println("unitPrice ");
			unitPrice = hrscan.nextDouble();
	
		}
       
            
		public static void calculateUnitPrice() {
			//process 
			total = quantity * unitPrice;
	
		}
		      //display out put
		public static void diplayOutput() {

			//display output
			System.out.println("productName:"+ productName);
			System.out.println("quantity:"+ quantity);
			System.out.println("unitPrice:"+ unitPrice);
			System.out.println("===========================================");
			System.out.println("Total:"+ total);

			}
		       //Exit program
		public static void exitProgram() {
			System.out.println("");
			System.out.println("");
			System.out.println("Thank You For Using EMP Cal - GOODBYE");
				
		}
	           //main
		public static void main(String[]args) {
		
		
			welCome();
			getinput();
			calculateUnitPrice();
			diplayOutput();
			exitProgram(); 
	
			System.out.println("welCome to EMP Cal - Please Fallow Instuctions.....");	
			System.out.println("welCome to EMP Cal - Please Fallow Instuctions.....");
			
			welCome();
			getinput();
			calculateUnitPrice();
			diplayOutput();
			exitProgram(); 
			
			System.out.println("welCome to EMP Cal - Please Fallow Instuctions.....");
			System.out.println("welCome to EMP Cal - Please Fallow Instuctions.....");
			
			welCome();
			getinput();
			calculateUnitPrice();
			diplayOutput();
			exitProgram(); 
		
			System.out.println("welCome to EMP Cal - Please Fallow Instuctions.....");
			System.out.println("welCome to EMP Cal - Please Fallow Instuctions.....");	
			
			welCome();
			getinput();
			calculateUnitPrice();
			diplayOutput();
			exitProgram(); 
			
			System.out.println("welCome to EMP Cal - Please Fallow Instuctions.....");
			System.out.println("welCome to EMP Cal - Please Fallow Instuctions.....");

			welCome();
			getinput();
			calculateUnitPrice();
			diplayOutput();
			exitProgram(); 

		
		}			

}		

			
		
		

		




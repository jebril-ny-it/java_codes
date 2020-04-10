package OOPconecptpart1;

public class CarPractice {

	String name;
	int price;
	String engine;
	
	public  CarPractice(String name,int Price,String engine) {
		this.name=name;
		this.price= Price;
		this.engine=engine;
		
	}
	
	public static void main(String[] args) {
		CarPractice obj1 = new CarPractice("bmw",10,"Automatic");
		CarPractice obj2 = new CarPractice("audi",20,"Automatic");
		CarPractice obj3 = new CarPractice("honda",5,"Manual");
	
		System.out.println(obj1.name +" "+ obj1.price +" "+ obj1.engine);
	}
	

}

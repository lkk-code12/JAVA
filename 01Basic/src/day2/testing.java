package day2;

public class testing {
	static String name; //static variable
	int price;
	
	void display() { //instance method
		int barCode = 1001; //local variable
		name = "Juice";
		price = 1500;
		
		System.out.println("Code :" + barCode);
		System.out.println("Name :" + name);
		System.out.println("Price : " + price);
		
	}
	
	static void Method() {
		//can access only static data;
		//if instance data is needed to access, create object;
		name = "Coffee";
		//price = 300;
		System.out.println("This is static method.");
	}
	
	public static void main(String[] args) {
		//Method();
		//display();
		Testing_1 obj = new Testing_1();
		obj.display();
	}
}
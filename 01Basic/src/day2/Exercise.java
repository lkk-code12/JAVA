package day2;

public class Exercise {
	void display() {
		//local variable
		int barCode;
		String name = 'Coffee';
		System.out.println('BarCode : ' + barCode);
		System.out.println('Name : ' + name);
	}
	
	public static void main(String[] args) {
		{
			String shopName = 'ABC';
		}
		System.out.println('Name : ' + shopName);
	}
}

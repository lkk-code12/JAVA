package Day_3;

public class while_loop {

	public static void main(String[] args) {
		boolean condition = false;
		int i = 3;
		while(!condition) {
			System.out.println(i+"\t");
			i--;
			if(i==0) condition = true;
		}
	}
}

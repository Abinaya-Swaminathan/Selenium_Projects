
public class Swap_two_no_without_temp {

	public static void main(String[] args) {
		int a=10; 
		int b=20;
		System.out.println("The main Starts");
		System.out.println("***Before swapping***");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("***After swapping***");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("The main Ends");
		
		
		

	}

}

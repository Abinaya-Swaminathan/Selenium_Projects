//Swapping_of_two_numbers
class E{	
		int i;
		static void test(E e1,E e2)
		{
			int temp = e1.i;
			e1.i=e2.i;
			e2.i=temp;
			return;
		}
	

	public static void main(String[] args) {
	 System.out.println("The main Starts");
	 E rv1=new E();
	 E rv2=new E();
	 rv1.i=10;
	 rv2.i=20;
	 System.out.println("*****Before Swapping******");
	 System.out.println("rv1.i:" + rv1.i);
	 System.out.println("rv2.i:" + rv2.i);
	 test(rv1,rv2);
	 System.out.println("*****After Swapping******");
	 System.out.println("rv1.i:" + rv1.i);
	 System.out.println("rv2.i:" + rv2.i);
	 System.out.println("The main Ends");
	}
}


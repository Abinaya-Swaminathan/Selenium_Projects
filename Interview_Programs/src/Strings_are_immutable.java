
public class Strings_are_immutable {

	public static void main(String[] args) {
		String rv1="Shah";
		String rv2="Shah";
		String rv3="Shah";
		System.out.println(rv1);
		System.out.println(rv2);
		System.out.println(rv3);
		
		System.out.println("**************");
		
		rv2="Rukh";
		System.out.println(rv1);
		System.out.println(rv2);
		System.out.println(rv3);
		
		System.out.println("**************");
		
		rv3="Khan";
		System.out.println(rv1);
		System.out.println(rv2);
		System.out.println(rv3);
		
		//Strings are immutable because once you create string object u cannot make changes to existing string object so we say strings are immutable
		
				

	}

}

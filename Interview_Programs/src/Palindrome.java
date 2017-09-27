
public class Palindrome {

	public static void main(String[] args) {
		String rv1 = "Dad";
		rv1=rv1.toUpperCase();
		String rv2="";
		for(int i=rv1.length()-1;i>=0;i--)
		{
			rv2=rv2+rv1.charAt(i);
		}
		System.out.println("Original String="+rv1);
		System.out.println("Original String="+rv2);
		if(rv1.equalsIgnoreCase(rv2))
		{
			System.out.println("So, Its a palindrome");
		}
		else
		{
			System.out.println("So, Its not a palindrome");
		}
		

	}

}

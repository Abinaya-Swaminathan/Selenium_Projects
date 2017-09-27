
public class Reverse_a_string {

	public static void main(String[] args) {
		String rv="SREDIPSQYEH";
		System.out.println(rv.length());
		System.out.println("The Original String="+rv);
		System.out.println("The Reversed String=");
		for(int i=rv.length()-1;i>=0;i--)
		{
			System.out.print(rv.charAt(i));
		}
	}
}

//Why we should take length()-1 and not length() only - because array index value starts from 0 and therefore total count-1 will give u the array value.
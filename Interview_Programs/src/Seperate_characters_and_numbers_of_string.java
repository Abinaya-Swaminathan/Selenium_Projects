
public class Seperate_characters_and_numbers_of_string {

	public static void main(String[] args) {
		String rv="Hello123??@#abi";
		String chars="";
		String digits="";
		String special="";
		for(int i=0;i<rv.length();i++)
		{
			if(Character.isDigit(rv.charAt(i)))
				
			{
				digits = digits+rv.charAt(i);
				
			}
			else if(Character.isAlphabetic(rv.charAt(i)))
			{
				chars=chars+rv.charAt(i);
			}
			else
			{
				special=special+rv.charAt(i);
			}
			
		}
		
		System.out.println("Character values are:"+chars);
		System.out.println("Digits values are:"+digits);
		System.out.println("Special character values are:"+special);
	}

}

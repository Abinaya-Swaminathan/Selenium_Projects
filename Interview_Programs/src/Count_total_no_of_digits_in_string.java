
public class Count_total_no_of_digits_in_string {

	public static void main(String[] args) {
		String rv="Hello12345678";
		int count=0;
		for(int i=0;i<rv.length();i++)
		{
			char ch=rv.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}

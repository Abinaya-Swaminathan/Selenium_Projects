
public class Count_no_of_words_in_sentense {

	public static void main(String[] args) {
		String rv="Welcome to java programming";
		String[] ref=rv.split(" ");
		System.out.println("The Total Number of Words=" +ref.length); //if you give length() alone instead of ref.length() the output will be 27, it will not count the number of characters
	}
}

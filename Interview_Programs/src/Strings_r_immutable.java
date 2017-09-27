
public class Strings_r_immutable {

	public static void main(String[] args) {
//		 String s1 = "JAVA";
//		 
//	        String s2 = "JAVA";
//	        
//	        System.out.println(s1);
//	        System.out.println(s2);
//	        System.out.println(s1 == s2);         //Output : true
//	 
//	        s1 = s1 + "J2EE";
//	        System.out.println(s1);
//	        System.out.println(s2);
//	        System.out.println(s1 == s2);  

		
		 String str1="String1";  
		 String str2 = "String2";  
		 System.out.println("str1 " + str1.hashCode());  
		 System.out.println("str2 = " + str2.hashCode());  

		 str1=str1 + str2;  
		 System.out.println("The hashcode str1 changed : " + str1.hashCode());
	}

}

package testngFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod //is the prerequisite for ever test case (ie) it run for each method
	// eg : 5 test case -> 5 times execution
	public void useridGeneration()
	{
	System.out.println("---This block executes before each method---");
	}
	
	@BeforeTest //is the prerequisite for all the test case (ie) it runs only once
	// eg : 5 test case -> 1 Single execution
	public void cookies()
	{
		System.out.println("---This block executes before all test cases---");
	}
	
	@AfterTest //is the post requisite for all the test case (ie) it runs only once
	// eg : 5 test case -> 1 Single execution
	public void cookiesclose()
	{
		System.out.println("---This block executes after all test cases---");
	}
	
	@AfterMethod  //is the post requisite for ever test case (ie) it run for each method
	// eg : 5 test case -> 5 times execution
	public void reportAdding()
	{
		System.out.println("---This block executes After each method---");
	}
	
	@Test
	public void openingBrowser()
	{
	System.out.println("---Executing test 2---");
	}
	
	@Test
	@Parameters({"adminuserid"})  //gets parameter from Parameter.xml file // you have to execute from xml level ie, from Parameter.xml
	public void flightBooking(String Userid)
	{
		System.out.println(Userid);
		System.out.println("---Executing test 1---");
	}

}

package datadriven;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import packTwo.TestBase;

public class Annotations extends TestBase{
	
	@BeforeMethod //is the prerequisite for ever test case (ie) it run for each method
	// eg : 5 test case -> 5 times execution
	public void useridGeneration()
	{
			System.out.println("---This block executes before each method---");
	}
	
	@Test(dataProvider="getData")
	public void userid(String username,String password,String id)
	{
		
		System.out.println("---This block executes before each test---");
		System.out.println(username);
		System.out.println(password);
		System.out.println(id);
		
	}
	
	@Test
	public void inheritance() throws IOException
	{
		Login();
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
	
	
	@DataProvider
	public Object[][] getData() // you have to provide two dimensional array in data provider
	{		
		// 1st row stands for number of times ur test case should parameterize
		//eg: If u want to execute userid() above for 3 times with 3 different data
		
		//Object[i][j];
		//i=number of time the test case should execute/run
		//j=number of parameter it should send for one go 
		Object[][] data=new Object[3][3];
		data[0][0]="1abcd"; //--> username //when it is running for 1st time/1st run
		data[0][1]="1xyz"; //--> password
		data[0][2]="1hij"; //--> id
		
		data[1][0]="2abcd"; //--> username //when it is running for 2nd time/2nd run
		data[1][1]="2xyz"; //--> password
		data[1][2]="2hij"; //--> id
		
		data[2][0]="3abcd"; //--> username //when it is running for 2nd time/2nd run
		data[2][1]="3xyz"; //--> password
		data[2][2]="3hij"; //--> id
		
		return data;
				
	}

}

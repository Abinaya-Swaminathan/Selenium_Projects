package packTwo;

import java.io.IOException;

import org.testng.annotations.Test;

public class DependencyAnnotatins extends TestBase {
	
	@Test
	public void openingBrowser() throws IOException
	{
		Login();
		//this opens the browser
	System.out.println("---Executing opening browser---");
	}
	
	//to prioritize the methods execution --> here flightBooing() method depends on openingBrowser() method
	@Test(dependsOnMethods={"openingBrowser"})
	public void flightBooking()
	{
		System.out.println("---Executing flight booking---");
	}
	
	//to execute even if the dependency method fails
	@Test(dependsOnMethods={"flightBooking"},alwaysRun=true)
	public void checkingSeatAvailbility()
	{
		System.out.println("---check seat availability---");
	} 
	
	@Test(timeOut=45000)
	public void timeRelated()
	{
		//this opens the browser
	System.out.println("---time out skip this method---");
	}
	
	//to skip test case use enabled=false
	@Test(enabled=false)
	public void payment()
	{
		//this opens the browser
	System.out.println("new test case");
	}


}

package testngFiles2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeSuite  //pre requsite
	public void installSoftware()
	{
		System.out.println("---I am the first---");
	}
	
	
	@Test
	public void executeSoftware()
	{
		System.out.println("---I am the test---");
	}
	
	@AfterSuite // post reqisite
	public void uninstallSoftware()
	{
		System.out.println("---I am the last---");
	}

}

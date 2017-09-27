package packTwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {
	
	public WebDriver driver = null; //WebDriver is declared globally
	
	@BeforeSuite  //pre requsite
	public void installSoftware()
	{
		System.out.println("---I am the first---");
	}
	
	
	@Test
	public void Login() throws IOException
	{		
		
		// to create a properties file - rc ur package-new-others-general-file-next-give filename.properties-finish
		//.properties extension is must to create a properties file
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Selenium_Projects\\Framework\\src\\packTwo\\datadriven.properties");  //tell to java where exactly properties file exixt
		prop.load(fis);

		System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").contains("firefox"))
		{
		//WebDriver driver = new FirefoxDriver();
			driver = new FirefoxDriver();
		//rc & run this class Annotaions2.java 
		}
		else if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	}
	
	@AfterSuite // post reqisite
	public void uninstallSoftware()
	{
		System.out.println("---I am the last---");
	}

}

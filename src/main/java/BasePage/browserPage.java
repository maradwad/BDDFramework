package BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserPage {

	static Properties prop;
	public static WebDriver driver;
	
	public browserPage() throws IOException
	{
		String file="C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\BDDFramework\\src\\main\\resources\\config.properties";
		FileInputStream fi=new FileInputStream(file);
		prop=new Properties();
		prop.load(fi);
	}
	
	public static void setUp()
	{
		String browser=prop.getProperty("browserName");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\BDDFramework\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\BDDFramework\\chromedriver.exe");
			driver =new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\BDDFramework\\chromedriver.exe");
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("Invalid browser name!");
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
}

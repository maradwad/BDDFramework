package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import BasePage.browserPage;

public class loginPage extends browserPage {

	public loginPage() throws IOException {
		super();
	}
	
	static By title=By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1");
	static By username=By.id("userName");
	static By password=By.id("password");
	static By login=By.id("login");
	static JavascriptExecutor js;
	
	public static String pageTitle()
	{
		String pageTitle=driver.findElement(title).getText();
		return pageTitle;
	}
	public static void enterUsername()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		driver.findElement(username).sendKeys("maradwad");
	}
	public static void enterPassword()
	{
		driver.findElement(password).sendKeys("Madhuri@27");
	}
	public static void login()
	{
		driver.findElement(login).click();
	}
	
	
}

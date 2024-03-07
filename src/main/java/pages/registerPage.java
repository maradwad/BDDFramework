package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import BasePage.browserPage;

public class registerPage extends browserPage {

	public registerPage() throws IOException {
		super();
	}
	
	static By newUser=By.id("newUser");
	static By firstName=By.id("firstname");
	static By lastName=By.id("lastname");
	static By userName=By.id("userName");
	static By password=By.xpath("//*[@id=\"password\"]");
	static By register=By.id("register");
	static By backToLogin=By.id("gotologin");
	static By output=By.xpath("//*[@id=\"output\"]");
	static JavascriptExecutor js;
	
	
	public static void clickOneNewUser() {
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		driver.findElement(newUser).click();
		
	}
	
	public static void enterfirstName()
	{
		driver.findElement(firstName).sendKeys("Madhuri");
	}
	public static void enterLastName()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		driver.findElement(lastName).sendKeys("Aradwad");
	}
	public static void enterUserName()
	{
		
		driver.findElement(userName).sendKeys("madhuriara");
	}
	public static void enterPassword()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(password).sendKeys("Madhuri@27");
	}
	public static void clickOnCheckBox() throws InterruptedException
	{
		Thread.sleep(50000);
	}
	public static void clickOnRegister()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(register).click();		
	}
	public static void backToLoginPage() throws InterruptedException
	{
		Thread.sleep(5000);
		String outPut=driver.findElement(output).getText();
		if(outPut.equalsIgnoreCase(""))
		{
			driver.findElement(backToLogin).click();
		}
		else
		{
			System.out.println(outPut);
		}
	}

	
}

package stepDefinition;

import java.io.IOException;

import org.junit.Assert;

import BasePage.browserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class loginSteps extends browserPage {

	public loginSteps() throws IOException {
		super();
	}

	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		Assert.assertEquals("Login", loginPage.pageTitle());
	}
	

	@When("user enter username")
	public void user_enter_username() {
		loginPage.enterUsername();
	}

	@When("enter valid password")
	public void enter_password() {
		loginPage.enterPassword();
	}

	@When("click on login button")
	public void click_on_login_button() {
		loginPage.login();
	}

	@Then("user should be navigated to bookstore page")
	public void user_should_be_navigated_to_bookstore_page() {
		Assert.assertEquals("https://demoqa.com/profile", driver.getCurrentUrl());
	}
}

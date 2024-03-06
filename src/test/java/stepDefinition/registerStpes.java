package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import BasePage.browserPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.registerPage;

public class registerStpes extends browserPage{
	public registerStpes() throws IOException {
		
	}
	@Before
	public void browserSetUp()
	{
		setUp();
	}

	@Given("user is on DemoQA Login page")
	public void user_is_on_demo_qa_login_page() {
	}

	@When("user click on new user button")
	public void user_click_on_new_user_button() {
		registerPage.clickOneNewUser();
	}

	@When("user enter firstName")
	public void user_enter_first_name() {
		registerPage.enterfirstName();
	}

	@When("enter lastName")
	public void enter_last_name() {
		registerPage.enterLastName();
	}

	@When("enter username")
	public void enter_username() {
		registerPage.enterUserName();
	}
	@When("enter password")
	public void enter_password() {
		registerPage.enterPassword();
	}

	@When("click on I am not robot checkbox")
	public void click_on_i_am_not_robot_checkbox() throws InterruptedException {
		registerPage.clickOnCheckBox();
	}

	@When("click on register button")
	public void click_on_register_button() {
		registerPage.clickOnRegister();
	}

	@Then("vallidate User Register Successfully")
	public void vallidate_user_register_successfully() throws InterruptedException {
		registerPage.backToLoginPage();
	}
}

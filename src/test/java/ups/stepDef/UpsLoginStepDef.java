package ups.stepDef;

import static org.testng.Assert.fail;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ups.upsActions.UpsLoginActions;

public class UpsLoginStepDef {

	UpsLoginActions upsLoginAction = new UpsLoginActions();

	@Given("Customer launch in UPS home page")
	public void customer_launch_in_UPS_home_page() {

		upsLoginAction.getUpsHomepage();
		Assert.assertEquals(upsLoginAction.verifyHomepage(), true);
	}

	@When("Customer clicks on login")
	public void customer_clicks_on_login() {
		upsLoginAction.clickLoginLink();
	}

	@Then("Customer able to launch in UPS login page successfully")
	public void customer_able_to_launch_in_UPS_login_page_successfully() {
		boolean actual = upsLoginAction.verifyLoginpage();
		Assert.assertEquals(actual, true);
	}

	@When("Customer put wrong Username {string} and wrong Password {string}")
	public void customer_put_wrong_Username_and_wrong_Password(String username, String password) {
		upsLoginAction.handleCookieBanner();
		upsLoginAction.inputUserName(username);
		upsLoginAction.inputPassword(password);
	}
	
	@When("Customer put correct Username {string} and wrong Password {string}")
	public void customer_put_correct_Username_and_wrong_Password(String username, String password) {
		upsLoginAction.handleCookieBanner();
		upsLoginAction.inputUserName(username);
		upsLoginAction.inputPassword(password);
	}

	@When("Customer clicks on LogIn button")
	public void customer_clicks_on_LogIn_button() {
		upsLoginAction.clickLoginBtn();

	}

	@Then("Customer should receive an error message")
	public void customer_should_receive_an_error_message() {

		if (upsLoginAction.loginErrorMsg().contains("unsuccessful")) {
			System.out.println("Error Message Test: PASSED");
		} else {
			System.out.println("Error Message Test: FAILED");
			fail();
		}

	}

}

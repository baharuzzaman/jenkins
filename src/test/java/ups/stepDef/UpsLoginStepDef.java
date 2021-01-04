package ups.stepDef;

import static org.testng.Assert.fail;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ups.upsActions.UpsLoginActions;

public class UpsLoginStepDef {

	UpsLoginActions upsAction = new UpsLoginActions();

	@Given("Customer launch in UPS home page")
	public void customer_launch_in_UPS_home_page() {

		upsAction.getUpsHomepage();
		Assert.assertEquals(upsAction.verifyHomepage(), true);
	}

	@When("Customer clicks on login")
	public void customer_clicks_on_login() {
		upsAction.clickLoginBtn();
	}

	@Then("Customer able to launch in UPS login page successfully")
	public void customer_able_to_launch_in_UPS_login_page_successfully() {
		upsAction.verifyLoginpage();
		fail();
	}

	@When("Customer put wrong Username {string} and wrong Password {string}")
	public void customer_put_wrong_Username_and_wrong_Password(String string, String string2) {

	}

	@When("Customer clicks on LogIn button")
	public void customer_clicks_on_LogIn_button() {

	}

	@Then("Customer should receive an error message")
	public void customer_should_receive_an_error_message() {

	}

}

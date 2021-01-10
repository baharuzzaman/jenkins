package ups.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ups.upsActions.MouseHoverTestActions;

public class MouseHoverTestStepDef {

	MouseHoverTestActions mouseHoverTestActions = new MouseHoverTestActions();

	@Given("Customer in Myntra homepage {string}")
	public void customer_in_Myntra_homepage(String url) {
		mouseHoverTestActions.getMyntraHomePage(url);
		mouseHoverTestActions.verifyMyntraHomePage();
	}

	@When("Customer wants to access the Men's watches")
	public void customer_wants_to_access_the_Men_s_watches() throws InterruptedException {

		System.out.println("Navigating to the MEN menu");
		mouseHoverTestActions.navigateToMenMenu();
		System.out.println("Navigating to the MEN watches");
		mouseHoverTestActions.navigateToMenWatches();
	}

	@Then("Customer should be able to navigate to the watches page")
	public void customer_should_be_able_to_navigate_to_the_watches_page() {

		mouseHoverTestActions.verifyMenWatchesPage();
	}

}

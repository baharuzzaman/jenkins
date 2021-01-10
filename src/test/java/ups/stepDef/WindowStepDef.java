package ups.stepDef;

import java.util.Set;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ups.upsActions.WindowActions;
import ups.utilities.SetupDrivers;

public class WindowStepDef {

	WindowActions popupActions = new WindowActions();
	String parentWindow;

	@Given("I am in ToolsQA {string} page")
	public void i_am_in_ToolsQA_page(String url) {
		popupActions.getToolsQA(url);
		popupActions.verifyToolsQAPage();
	}

	@When("I click in SDLC link")
	public void i_click_in_SDLC_link() {

		parentWindow = SetupDrivers.chromeDriver.getWindowHandle();
		System.out.println(">> Parent Window Handler: " + parentWindow);
		popupActions.clickSDLCLink();
	}

	@Then("New tab should be opened")
	public void new_tab_should_be_opened() {

		Set<String> windows = SetupDrivers.chromeDriver.getWindowHandles();
		for (String childWindow : windows) {
			if (!parentWindow.equals(childWindow)) {

				SetupDrivers.chromeDriver.switchTo().window(childWindow);
				System.out.println("Child Window Handler: "+ childWindow);
				System.out.println(">> Child Window title: "+SetupDrivers.chromeDriver.switchTo().window(childWindow).getTitle());
			}

		}

	}

	@Then("I would be able to navigate to the SDLC page")
	public void i_would_be_able_to_navigate_to_the_SDLC_page() throws InterruptedException {
		popupActions.verifySDLCPage();
		System.out.println(">> Going Back To The Parent Page >>");
		SetupDrivers.chromeDriver.switchTo().window(parentWindow);
		popupActions.verifyToolsQAPage();
		Thread.sleep(6000);
		
	}

}

package ups.upsActions;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import ups.pageElements.MouseHoverTestElement;
import ups.utilities.SetupDrivers;

public class MouseHoverTestActions {

	MouseHoverTestElement mouseHoverTestElements = null;

	public MouseHoverTestActions() {
		this.mouseHoverTestElements = new MouseHoverTestElement();
		PageFactory.initElements(SetupDrivers.chromeDriver, this.mouseHoverTestElements);
	}

	public void getMyntraHomePage(String url) {
		SetupDrivers.chromeDriver.get(url);
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public void verifyMyntraHomePage() {
		if (SetupDrivers.chromeDriver.getTitle().toLowerCase().contains("shopping")) {
			System.out.println("Successfully Navigated to The Myntra Home Page");
		} else {
			System.out.println("Navigation to the Myntra Home Page site failed!");
			fail();
		}

	}

	public void navigateToMenMenu() throws InterruptedException {
		Actions action = new Actions(SetupDrivers.chromeDriver);
		action.moveToElement(mouseHoverTestElements.menMenu);
		action.perform();
		Thread.sleep(4000);

	}

	public void navigateToMenWatches() {
		Actions action = new Actions(SetupDrivers.chromeDriver);
		action.moveToElement(mouseHoverTestElements.menWatches);
		action.click();
		action.perform();
	}

	public void verifyMenWatchesPage() {
		if (SetupDrivers.chromeDriver.getTitle().toLowerCase().contains("mens watches")) {
			System.out.println("Successfully Navigated to the Men's Watches Page");
		} else {
			System.out.println("Navigation to the Men's Watches failed!");
			fail();
		}

	}

}

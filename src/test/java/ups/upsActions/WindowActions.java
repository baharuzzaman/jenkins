package ups.upsActions;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import ups.pageElements.windowElements;
import ups.utilities.SetupDrivers;

public class WindowActions {

	windowElements popupElements = null;

	public WindowActions() {
		this.popupElements = new windowElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, this.popupElements);
	}

	public void getToolsQA(String url) {
		SetupDrivers.chromeDriver.get(url);
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public void verifyToolsQAPage() {
		if (SetupDrivers.chromeDriver.getTitle().toLowerCase().contains("tutorial")) {
			System.out.println("Successfully Navigated to The ToolsQA Site");
		} else {
			System.out.println("Navigation to the ToolsQA site failed!");
			fail();
		}

	}

	public void clickSDLCLink() {
		popupElements.sdlcLink.click();
	}

	public void verifySDLCPage() {
		if (SetupDrivers.chromeDriver.getTitle().toLowerCase().contains("software")) {
			System.out.println("Successfuly Navigated to The SDLC Site");
		} else {
			System.out.println("Navigation to the SDLC site failed!");
			fail();
		}
	}

}

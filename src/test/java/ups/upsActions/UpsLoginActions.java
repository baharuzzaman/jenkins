package ups.upsActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import ups.pageElements.UpsLoginElements;
import ups.utilities.SetupDrivers;

public class UpsLoginActions {

	UpsLoginElements loginElements;

	public UpsLoginActions() {
		this.loginElements = new UpsLoginElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, loginElements);

	}

	public void getUpsHomepage() {
		SetupDrivers.chromeDriver.get("https://www.ups.com/us/en/Home.page");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	public boolean verifyHomepage() {
		boolean bool = false;
		System.out.println(SetupDrivers.chromeDriver.getTitle());

		if (SetupDrivers.chromeDriver.getTitle().contains("United States")) {
			bool = true;
		}

		return bool;
	}

	public void clickLoginBtn() {
		System.out.println("Number of Elements found: "+loginElements.logInLink.size());
		loginElements.logInLink.get(0).click();
		//loginElements.logInLink.click();

	}

	public boolean verifyLoginpage() {
		boolean bool = false;
		System.out.println(SetupDrivers.chromeDriver.getTitle());
		if (SetupDrivers.chromeDriver.getTitle() == "login|UPS - United States") {
			bool = true;
		}

		return bool;
	}

}

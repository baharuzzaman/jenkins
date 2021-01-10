package ups.pageElements;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class UpsLoginElements {

	/*
	 * @FindBy(xpath = "//a[@class='acq_main_header_signupLogin']") public
	 * WebElement logInLink;
	 */

	@FindAll(@FindBy(xpath = "//a[contains(text(),'Log')]"))
	public List<WebElement> logInLink;

	@FindBy(xpath = "//*[@id='__tealiumImplicitmodal']/div/button/span[1]")
	public WebElement cookieBanner;

	@FindBy(id = "email")
	public WebElement username;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(css = "#submitBtn")
	public WebElement submitBtn;

	@FindBy(xpath = "//*[@id='errorMessages']")
	public WebElement errorMsg;

}

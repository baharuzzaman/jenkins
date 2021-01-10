package ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MouseHoverTestElement {
	
	@FindBy(xpath="//a[@data-group='men']")
	public WebElement menMenu;

	@FindBy(linkText="Watches")
	public WebElement menWatches;
}

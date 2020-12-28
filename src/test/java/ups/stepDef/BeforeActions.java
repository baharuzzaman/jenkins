package ups.stepDef;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import ups.utilities.SetupDrivers;

public class BeforeActions {

	@Before
	public void beforeScenario(Scenario scen) {

		System.out.println("..Chrome Driver initialization..");
		SetupDrivers.setupChromeDriver();
		System.out.println("..Chrome Driver initialized..");
		System.out.println("scen.getName()");

	}

}

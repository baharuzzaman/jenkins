package ups.stepDef;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import ups.utilities.SetupDrivers;

public class AfterActions {

	@After
	public void afterScenario(Scenario scen) {
		
		System.out.println("..Test End..");
		System.out.println("..Closing Chrome Browser Starts..");
		SetupDrivers.quitChromeDriver();
		System.out.println("..Closing Chrome Browser End..");
		
	}
	
}

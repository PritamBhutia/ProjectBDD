package Com.Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/Com/features",
		glue="Com.Stepdef",
		plugin="html:target",
		monochrome=true,
		dryRun = false
		//tags="@Test1or@Test2"
	
		
		
		
		
		
		)
public class RunnerClass {

}

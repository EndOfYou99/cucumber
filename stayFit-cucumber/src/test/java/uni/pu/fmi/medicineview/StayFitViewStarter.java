package uni.pu.fmi.medicineview;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin ={"pretty", "html:target/report.html"} )
public class StayFitViewStarter {
}

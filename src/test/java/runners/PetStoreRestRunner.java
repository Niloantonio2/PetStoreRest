package runners;


import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/PetStoreRest.feature",
		glue = "stepDefinitions",
		snippets = CucumberOptions.SnippetType.CAMELCASE)
public class PetStoreRestRunner {

}

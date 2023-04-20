package co.com.konex.certification.ventas.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/login_ventas.feature",
        tags = "@HuLogin",
        glue = "co.com.konex.certification.ventas.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTags {
}

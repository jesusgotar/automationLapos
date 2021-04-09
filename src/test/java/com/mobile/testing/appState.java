package com.mobile.testing;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report", "com.mobile.testing.customreporting.CucumberFormatter", "com.mobile.testing.customreporting.CucumberReporter"},
        features = "src/test/resources/features/MobileTesting/01_appState.feature")
public class appState {
    @Managed
    WebDriver driver;
}

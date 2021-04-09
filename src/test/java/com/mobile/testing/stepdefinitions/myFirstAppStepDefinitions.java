package com.mobile.testing.stepdefinitions;

import com.mobile.testing.pages.pageDefinitions;
import com.mobile.testing.steps.initialPageSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class myFirstAppStepDefinitions {

    public static final Logger LOGGER = LoggerFactory.getLogger(initialPageSteps.class);

    @Steps
    initialPageSteps initialPageSteps;

    @Before
    public  void setPlatform() {
        String platform =  System.getProperty("testPlatform");
        LOGGER.info("The platform is " + platform);
        if (platform.compareToIgnoreCase("android") == 0) {
            pageDefinitions.setAndroid(true);
            pageDefinitions.setIOS(false);
        }
        else {
            pageDefinitions.setAndroid(false);
            pageDefinitions.setIOS(true);
        }
    }

    @Given("^Que esta abierta la app$")
    public void queEstaAbiertaLaApp() {
        initialPageSteps.isDisplayedPageTittle();
    }

    @When("^Hago tap sobre un boton$")
    public void hagoTapSobreUnBoton() {
        initialPageSteps.tapSomeButton();
    }

    @Then("^La app cambia de estado$")
    public void laAppCambiaDeEstado() {
        initialPageSteps.isDisplayedSomeItem();
    }
}

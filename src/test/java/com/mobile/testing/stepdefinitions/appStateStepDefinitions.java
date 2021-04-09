package com.mobile.testing.stepdefinitions;

import com.mobile.testing.pages.pageDefinitions;
import com.mobile.testing.steps.appSteps;
import com.mobile.testing.steps.initialPageSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class appStateStepDefinitions {

    public static final Logger LOGGER = LoggerFactory.getLogger(initialPageSteps.class);

    @Steps
    initialPageSteps initialPageSteps;

    @Steps
    appSteps appSteps;

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

    @Given("^La Pantalla de Inicio de la app ha sido desplegada$")
    public void laPantallaDeInicioDeLaAppHaSidoDesplegada() {
        initialPageSteps.isDisplayedPageTittle();
    }

    @When("^Reseteo la app$")
    public void reseteoLaApp() {
        appSteps.resetApp();
    }
}

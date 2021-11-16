package com.mobile.testing.stepdefinitions;

import com.mobile.testing.pages.pageDefinitions;
import com.mobile.testing.steps.helpInitialPageSteps;
import com.mobile.testing.steps.initialPageSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class pruebaHelpAppStepDefinitions {

    public static final Logger LOGGER = LoggerFactory.getLogger(initialPageSteps.class);

    @Steps
    //initialPageSteps initialPageSteps;
    helpInitialPageSteps helpInitialPageSteps;

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

    @Given("^Que la app de ayuda esta abierta$")
    public void QueLaAppAyudaEstaAbierta() {
        helpInitialPageSteps.isDisplayedPageTittle();
    }

    @And("^Hago tap en el check de informacion consusa o incompleta$")
    public void hagTapCheckInformacionConsusa() {
        helpInitialPageSteps.tapInfoCOnfusa();
    }

    @When("^Hago tap sobre el campo de texto a buscar$")
    public void hagoTapSobreCampoTextoBuscar() {
        helpInitialPageSteps.tapTextoABuscar();
    }

    @And("^Escribo el texto '(.*)' en el campo de texto a buscar$")
    public void escriboTextoCampoTextoBuscar(String texto) {
        helpInitialPageSteps.typeFindOutText(texto);
    }

    @And("^Escribo el texto '(.*)' en el campo detalles$")
    public void escriboTextoCampoDetalles(String texto) {
        helpInitialPageSteps.typeDetailsText(texto);
    }

    @And("^Hago tap sobre el primer resultado$")
    public void hagoTapSobrePrimerResultado() {
        helpInitialPageSteps.tapPrimerResultado();
    }

    @And("^Hago tap sobre el boton de respuesta util '(.*)'$")
    public void hagoTapSobreElBotonDeRespuestaUtil(String valoracion) {
        helpInitialPageSteps.tapRespuestaUtil(valoracion);
    }

    @And("^Espero la cantidad de '(.*)' segundos$")
    public void esperoUnaCantidadDeSegundos(String espera) {
        try {
            Thread.sleep(Integer.valueOf(espera) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("^Se muestra el mensaje agradecimiento$")
    public void seMuestraMensajeAgradecimiento() {
        helpInitialPageSteps.isDisplayedFeedbackMessaje();
    }

    @And("^Hago tap en el boton enviar feedback$")
    public void hagoTapBotonEnviarFeedback() {
        helpInitialPageSteps.tapSendFeedBackButton();
    }

    /*@When("^Hago tap sobre un boton$")
    public void hagoTapSobreUnBoton() {
        initialPageSteps.tapSomeButton();
    }

    @Then("^La app cambia de estado$")
    public void laAppCambiaDeEstado() {
        initialPageSteps.isDisplayedSomeItem();
    }*/
}

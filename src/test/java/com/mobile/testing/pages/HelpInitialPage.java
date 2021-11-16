package com.mobile.testing.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

public class HelpInitialPage extends pageDefinitions {

    //Page Tittle
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Ayuda\"]")
    //@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"IntegerA\"]")
    private WebElement pageTittle;

    //feedback Message
    @AndroidFindBy(id = "mobile.smartlapos.help:id/feedbackResponse")
    //@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"IntegerA\"]")
    private WebElement feedbackMessage;

    //Help Button
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id = 'mobile.smartlapos.help:id/help']")
    //@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"IntegerA\"]")
    private WebElement helpButton;

    //findOut TextBox
    @AndroidFindBy(xpath = "//android.widget.EditText")
    //@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"IntegerA\"]")
    private WebElement findOutTextBox;

    //details TextBox
    @AndroidFindBy(id = "mobile.smartlapos.help:id/editCommentFeedBack")
    //@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"IntegerA\"]")
    private WebElement detailsTextBox;

    //check Info Confusa
    @AndroidFindBy(id = "mobile.smartlapos.help:id/cbInformationNotClear")
    //@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"IntegerA\"]")
    private WebElement checkInfoConfusa;

    //valoracion Positiva
    @AndroidFindBy(id = "mobile.smartlapos.help:id/feedbackLike")
    //@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"IntegerA\"]")
    private WebElement valoracionPositiva;

    //valoracion Negativa
    @AndroidFindBy(id = "mobile.smartlapos.help:id/feedbackDislike")
    //@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"IntegerA\"]")
    private WebElement valoracionNegativa;

    //PrimerResultado
    @AndroidFindBy(xpath = "(//android.widget.TextView)[3]")
    //@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"IntegerA\"]")
    private WebElement primerResultado;

    @AndroidFindBy(id = "io.appium.android.apis:id/add")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"show alert\"]")
    private WebElement someButton;

    @AndroidFindBy(id = "io.appium.android.apis:id/text")
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    private WebElement someItem;

    @AndroidFindBy(id = "mobile.smartlapos.help:id/btnSendFeedback")
    private WebElement sendFeedbackButton;

    public boolean isDisplayedPageTittle() {
        LOGGER.info("Validando visibilidad de pageTittle JJC");
        return isDisplayed(pageTittle);
    }

    public boolean isDisplayedFeedbackMessaje() {
        LOGGER.info("Validando visibilidad de mensaje de agradecimiento");
        return isDisplayed(feedbackMessage);
    }

    public boolean isDisplayedWithTextPageTittle(String text) {
        LOGGER.info("Validando visibilidad de pageTittle con texto " + text);
        return isDisplayedWithText(pageTittle, text);
    }

    public boolean isEnabledPageTittle() {
        LOGGER.info("Validando si pageTittle esta habilitado");
        return isEnabled(pageTittle);
    }

    public boolean isDisabledPageTittle() {
        LOGGER.info("Validando si pageTittle esta deshabilitado");
        return isDisabled(pageTittle);
    }

    public void typePageTittle(String text) {
        LOGGER.info("Escribiendo en pageTittle");
        type(pageTittle, text);
    }

    public void tapPageTittle() {
        LOGGER.info("Tap en pageTittle");
        tap(pageTittle);
    }

    public boolean isDisplayedSomeButton() {
        LOGGER.info("Validando visibilidad de someButton");
        return isDisplayed(someButton);
    }

    public boolean isDisplayedWithTextSomeButton(String text) {
        LOGGER.info("Validando visibilidad de someButton con texto " + text);
        return isDisplayedWithText(someButton, text);
    }

    public boolean isEnabledSomeButton() {
        LOGGER.info("Validando si someButton esta habilitado");
        return isEnabled(someButton);
    }

    public boolean isDisabledSomeButton() {
        LOGGER.info("Validando si someButton esta deshabilitado");
        return isDisabled(someButton);
    }

    public void typeSomeButton(String text) {
        LOGGER.info("Escribiendo en someButton");
        type(someButton, text);
    }

    public void tapSomeButton() {
        LOGGER.info("Tap en someButton");
        tap(someButton);
    }

    public boolean isDisplayedSomeItem() {
        LOGGER.info("Validando visibilidad de someItem");
        return isDisplayed(someItem);
    }

    public boolean isDisplayedWithTextSomeItem(String text) {
        LOGGER.info("Validando visibilidad de someItem con texto " + text);
        return isDisplayedWithText(someItem, text);
    }

    public boolean isEnabledSomeItem() {
        LOGGER.info("Validando si someItem esta habilitado");
        return isEnabled(someItem);
    }

    public boolean isDisabledSomeItem() {
        LOGGER.info("Validando si someItem esta deshabilitado");
        return isDisabled(someItem);
    }

    public void typeSomeItem(String text) {
        LOGGER.info("Escribiendo en someItem");
        type(someItem, text);
    }

    public void tapSomeItem() {
        LOGGER.info("Tap en someItem");
        tap(someItem);
    }

    public void tapTextoABuscar() {
        LOGGER.info("Tap en textBox Buscar");
        tap(findOutTextBox);
    }

    public void tapInfoCOnfusa() {
        LOGGER.info("Tap en check de informacion confusa o incompleta");
        tap(checkInfoConfusa);
    }

    public void tapPrimerResultado() {
        LOGGER.info("Tap en textBox Buscar");
        tap(primerResultado);
    }

    public void tapRespuestaUtil(String valoracion) {
        LOGGER.info("Tap en respuesta util: " + valoracion);
        switch (valoracion.toUpperCase()){
            case "POSITIVA":
            {LOGGER.info("Tap en valoracion positiva");
                tap(valoracionPositiva);
                break;}
            case "NEGATIVA":
            {LOGGER.info("Tap en valoracion negativa");
                tap(valoracionNegativa);
                break;}
            default:
            {LOGGER.info("No se pudo validar utilidad, valor erroneo: " + valoracion);}
        }
    }

    public void typeFindOOutTextBox(String text) {
        LOGGER.info("Escribiendo en findOutTextBox");
        type(findOutTextBox, text);
    }

    public void typeDetailsText(String text) {
        LOGGER.info("Escribiendo en texto detalles");
        type(detailsTextBox, text);
    }

    public void tapSendFeedBackButton() {
        LOGGER.info("Tap en boton enviar feedback");
        tap(sendFeedbackButton);
    }
}


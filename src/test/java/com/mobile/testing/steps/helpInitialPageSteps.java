package com.mobile.testing.steps;

import com.mobile.testing.pages.HelpInitialPage;
import com.mobile.testing.pages.InitialPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

public class helpInitialPageSteps extends ScenarioSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(helpInitialPageSteps.class);

    private InitialPage initialPage;
    private HelpInitialPage helpInitialPage;


    @Step
    public void isDisplayedPageTittle() {
        assertTrue(helpInitialPage.isDisplayedPageTittle());
    }

    @Step
    public void isDisplayedFeedbackMessaje() {
        assertTrue(helpInitialPage.isDisplayedFeedbackMessaje());
    }

    @Step
    public void isDisplayedWithTextPageTittle(String text) {
        assertTrue(initialPage.isDisplayedWithTextPageTittle(text));
    }

    @Step
    public void isEnabledPageTittle() {
        assertTrue(initialPage.isEnabledPageTittle());
    }

    @Step
    public void isDisabledPageTittle() {
        assertTrue(initialPage.isDisabledPageTittle());
    }

    @Step
    public void typePageTittle(String text) {
        initialPage.typePageTittle(text);
    }

    @Step
    public void tapPageTittle() {
        initialPage.tapPageTittle();
    }

    @Step
    public void isDisplayedSomeButton() {
        assertTrue(initialPage.isDisplayedSomeButton());
    }

    @Step
    public void isDisplayedWithTextSomeButton(String text) {
        assertTrue(initialPage.isDisplayedWithTextSomeButton(text));
    }

    @Step
    public void isEnabledSomeButton() {
        assertTrue(initialPage.isEnabledSomeButton());
    }

    @Step
    public void isDisabledSomeButton() {
        assertTrue(initialPage.isDisabledSomeButton());
    }

    @Step
    public void typeSomeButton(String text) {
        initialPage.typeSomeButton(text);
    }

    @Step
    public void tapSomeButton() {
        initialPage.tapSomeButton();
    }

    @Step
    public void tapTextoABuscar() {
        helpInitialPage.tapTextoABuscar();
    }

    @Step
    public void tapInfoCOnfusa() {
        helpInitialPage.tapInfoCOnfusa();
    }

    @Step
    public void tapPrimerResultado() {
        helpInitialPage.tapPrimerResultado();
    }

    @Step
    public void tapRespuestaUtil(String valoracion) {
        helpInitialPage.tapRespuestaUtil(valoracion);
    }

    @Step
    public void isDisplayedSomeItem() {
        assertTrue(initialPage.isDisplayedSomeItem());
    }

    @Step
    public void isDisplayedWithTextSomeItem(String text) {
        assertTrue(initialPage.isDisplayedWithTextSomeItem(text));
    }

    @Step
    public void isEnabledSomeItem() {
        assertTrue(initialPage.isEnabledSomeItem());
    }

    @Step
    public void isDisabledSomeItem() {
        assertTrue(initialPage.isDisabledSomeItem());
    }

    @Step
    public void typeSomeItem(String text) {
        initialPage.typeSomeItem(text);
    }

    @Step
    public void typeFindOutText(String text) {
        helpInitialPage.typeFindOOutTextBox(text);
    }

    @Step
    public void typeDetailsText(String text) {
        helpInitialPage.typeDetailsText(text);
    }

    @Step
    public void tapSomeItem() {
        initialPage.tapSomeItem();
    }

    @Step
    public void tapSendFeedBackButton() {
        helpInitialPage.tapSendFeedBackButton();
    }
}

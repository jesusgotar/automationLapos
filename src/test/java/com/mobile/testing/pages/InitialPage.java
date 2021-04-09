package com.mobile.testing.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

public class InitialPage extends pageDefinitions {

    //Page Tittle
    @AndroidFindBy(id = "android:id/title")
    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"IntegerA\"]")
    private WebElement pageTittle;

    @AndroidFindBy(id = "io.appium.android.apis:id/add")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"show alert\"]")
    private WebElement someButton;

    @AndroidFindBy(id = "io.appium.android.apis:id/text")
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    private WebElement someItem;

    public boolean isDisplayedPageTittle() {
        LOGGER.info("Validando visibilidad de pageTittle");
        return isDisplayed(pageTittle);
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
}


package com.mobile.testing.pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class pageDefinitions extends PageObject {
    public static final Logger LOGGER = LoggerFactory.getLogger(pageDefinitions.class);
    private static boolean isIOS;
    private static boolean isAndroid;
    private static  final String app = "my.first.app";

    Date date= new Date();

    long time = date.getTime();

    public static void setAndroid(boolean android){
        isAndroid = android;
    }

    public static boolean isAndroid(){
        return isAndroid;
    }

    public static void setIOS(boolean iOS){
        isIOS = iOS;
    }

    public static boolean isIOS(){
        return isIOS;
    }

    public  void scrollDown(){
        WebDriver driver = getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "up");
        js.executeScript("mobile: swipe", params);
    }

    //general
    public WebElement waitForElement(WebElement element){
        return waitForElement(element, 5);
    }
    public WebElement waitForElement(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(getDriver(), seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitForElementLocatedBy(By locator){
        return waitForElementLocatedBy(locator, 5);
    }
    public WebElement waitForElementLocatedBy(By locator, int seconds){
        WebDriverWait wait = new WebDriverWait(getDriver(), seconds);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElemenToBeClickable(WebElement element){ return waitForElemenToBeClickable(element, 5); }
    public WebElement waitForElemenToBeClickable(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(getDriver(), seconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public boolean isAppCurrent() {
        if(isAndroid()){
            WebDriver facade = getDriver();
            WebDriver driver = ((WebDriverFacade)facade).getProxiedDriver();
            LOGGER.info((((AndroidDriver) driver).currentActivity()));
            return ((AndroidDriver) driver).currentActivity().contains(app);
        }
        else {
            return false;
        }

    }

    public boolean isDisplayed(WebElement element) {
        try{
            return waitForElement(element, 5).isDisplayed();
        } catch (Exception e){
            swipeUp();
            try{
                return waitForElement(element, 5).isDisplayed();
            } catch (Exception e1){
                swipeDown();
                return waitForElement(element, 5).isDisplayed();
            }
        }
    }

    public boolean hasText(WebElement element, String text){
        return isDisplayed(element) && sanitizeText(element.getText().toUpperCase()).equals(sanitizeText(text.toUpperCase()));
    }

    public boolean isDisplayedWithText(WebElement element, String text){
        return isDisplayed(element) && hasText(element, text);
    }

    public void swipeUp(){
        LOGGER.info("Dentro del swipeup");
        LOGGER.info("Calculando coordenadas");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriver facade = getDriver();
        AppiumDriver driver = (AppiumDriver) ((WebDriverFacade)facade).getProxiedDriver();
        Dimension size = driver.manage().window().getSize();

        int x = size.width / 2;
        int y = ((size.height) - (3 * (size.height / 4)));
        int y1 = ((size.height) - (size.height / 4));

        LOGGER.info("Generando accion");
        TouchAction action = new TouchAction(driver);
        action.press(x, y1)
                .waitAction(500)
                .moveTo(x, y)
                .release()
                .perform();
    }

    public void swipeDown(){
        LOGGER.info("Dentro del swipedown");
        LOGGER.info("Calculando coordenadas");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriver facade = getDriver();
        AppiumDriver driver = (AppiumDriver) ((WebDriverFacade)facade).getProxiedDriver();
        Dimension size = driver.manage().window().getSize();

        int x = size.width / 2;
        int y1 = ((size.height) - (3 * (size.height / 4)));
        int y = ((size.height) - (size.height / 4));

        LOGGER.info("Generando accion");
        TouchAction action = new TouchAction(driver);
        action.press(x, y1)
                .waitAction(500)
                .moveTo(x, y)
                .release()
                .perform();
    }

    public boolean isEnabled(WebElement element) {
        return isDisplayed(element) && element.isEnabled();
    }

    public boolean isDisabled(WebElement element) {
        if(isDisplayed(element)) {
            return !isEnabled(element);
        }
        return false;
    }

    public void type(WebElement element, String text) {
        if(isDisplayed(element)){
            waitForElement(element, 5).sendKeys(text);
        }
    }

    public void tap(WebElement element) {
        if(isDisplayed(element)) {
            waitForElement(element, 5).click();
        }
    }

    public void tapMiddleRight(WebElement element) {
        LOGGER.info("Dentro del tapAt");
        WebDriver facade = getDriver();
        AppiumDriver driver = (AppiumDriver) ((WebDriverFacade)facade).getProxiedDriver();
        Dimension size = element.getSize();
        Point position = element.getLocation();

        int x = position.getX() +  size.width - (size.width / 10);
        int y = position.getY() + (size.height / 2);

        LOGGER.info("Generando accion");
        TouchAction action = new TouchAction(driver);
        action.press(x, y)
                .waitAction(500)
                .release()
                .perform();
    }

    public void tapMiddleLeft(WebElement element) {
        LOGGER.info("Dentro del tapAt");
        WebDriver facade = getDriver();
        AppiumDriver driver = (AppiumDriver) ((WebDriverFacade)facade).getProxiedDriver();
        Dimension size = element.getSize();
        Point position = element.getLocation();

        int x = position.getX() +  (size.width / 10);
        int y = position.getY() + (size.height / 2);

        LOGGER.info("Generando accion");
        TouchAction action = new TouchAction(driver);
        action.press(x, y)
                .waitAction(500)
                .release()
                .perform();
    }

    public void tapBottomCenter(WebElement element) {
        LOGGER.info("Dentro del tapAt");
        WebDriver facade = getDriver();
        AppiumDriver driver = (AppiumDriver) ((WebDriverFacade)facade).getProxiedDriver();
        Dimension size = element.getSize();
        Point position = element.getLocation();

        int x = position.getX() +  (size.width / 2);
        int y = position.getY() + size.height -  (size.height / 10);

        LOGGER.info("Generando accion");
        TouchAction action = new TouchAction(driver);
        action.press(x, y)
                .waitAction(500)
                .release()
                .perform();
    }

    public String sanitizeText(String text){
        return text.replaceAll("(\n|\r)", "");
    }

    public void closeApp(){
        WebDriver facade = getDriver();
        AppiumDriver driver = (AppiumDriver) ((WebDriverFacade)facade).getProxiedDriver();
        driver.closeApp();
    }

    public void launchApp(){
        WebDriver facade = getDriver();
        AppiumDriver driver = (AppiumDriver) ((WebDriverFacade)facade).getProxiedDriver();
        driver.launchApp();
    }

    public void restartApp(){
        closeApp();
        launchApp();
    }

    public void resetApp(){
        WebDriver facade = getDriver();
        AppiumDriver driver = (AppiumDriver) ((WebDriverFacade)facade).getProxiedDriver();
        driver.resetApp();
    }
}

package com.mobile.testing.steps;

import com.mobile.testing.pages.pageDefinitions;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class appSteps {
    public static final Logger LOGGER = LoggerFactory.getLogger(appSteps.class);
    private com.mobile.testing.pages.pageDefinitions pageDefinitions;


    @Step
    public void restartApp() {
        pageDefinitions.restartApp();
    }

    @Step
    public void closeApp() {
        pageDefinitions.closeApp();
    }

    @Step
    public void launchApp() {
        pageDefinitions.launchApp();
    }

    @Step
    public void resetApp() {
        pageDefinitions.resetApp();
    }

}

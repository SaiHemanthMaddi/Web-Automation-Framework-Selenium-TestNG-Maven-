package com.example.automation.framework;

import com.example.automation.framework.utils.WaitHelper;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger log = LoggerFactory.getLogger(BasePage.class);

    protected void click(By locator) {
        log.info("Clicking: {}", locator);
        WaitHelper.waitForClickable(locator).click();
    }

    protected void type(By locator, String text) {
        log.info("Typing into {} text: {}", locator, text);
        WaitHelper.waitForVisible(locator).clear();
        WaitHelper.waitForVisible(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        log.info("Getting text from: {}", locator);
        return WaitHelper.waitForVisible(locator).getText();
    }
}

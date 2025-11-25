package com.example.automation.framework.pages;

import com.example.automation.framework.BasePage;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InventoryPage extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(InventoryPage.class);

    private final By title = By.className("title");

    public String getInventoryTitle() {
        log.info("Fetching inventory page title.");
        return getText(title);
    }
}

package com.example.automation.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static final Logger log = LoggerFactory.getLogger(DriverManager.class);

    public static void initDriver() {
        log.info("Initializing WebDriver...");

        WebDriverManager.chromedriver().setup();
        log.info("ChromeDriver setup completed.");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        log.info("Launching Chrome browser...");
        driver.set(new ChromeDriver(options));

        log.info("Browser launched successfully.");
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        log.info("Closing browser...");
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
        log.info("Browser closed successfully.");
    }
}

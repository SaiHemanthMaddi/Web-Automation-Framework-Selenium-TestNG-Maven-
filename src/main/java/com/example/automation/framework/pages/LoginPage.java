package com.example.automation.framework.pages;

import com.example.automation.framework.BasePage;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginBtn = By.id("login-button");

    public void login(String user, String pwd) {
        log.info("Logging in with username: {}", user);
        type(username, user);
        type(password, pwd);
        click(loginBtn);
        log.info("Login button clicked.");
    }
}

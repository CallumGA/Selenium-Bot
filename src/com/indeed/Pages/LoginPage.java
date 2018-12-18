package com.indeed.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * Pattern: Page object model
 *
 * This class will store all the locators and methods of login page
 *
 */


public class LoginPage {

    WebDriver driver;

    By signIn = By.xpath("//*[@id=\"desktopGlobalHeader\"]/nav/ul[2]/li[2]/a");
    By email = By.id("signin_email");
    By password = By.id("signin_password");
    By submit = By.xpath("//*[@id=\"loginform\"]/button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void selectSignin() {
        driver.findElement(signIn).click();
    }

    public void typeEmail() {
        driver.findElement(email).sendKeys("callum.g.anderson@gmail.com");
    }

    public void typePassword() {
        driver.findElement(password).sendKeys("rugbyrugby2");
    }

    public void submitCredentials() {
        driver.findElement(submit).click();

    }
}

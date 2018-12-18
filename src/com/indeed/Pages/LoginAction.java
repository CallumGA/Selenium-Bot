package com.indeed.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 *
 * Pattern: Page object model
 *
 * This class contains  all action calls for login page
 *
 */

public class LoginAction extends TestBase{


    public void verifyLogin() {

       /** System.setProperty("webdriver.chrome.driver", "/Users/callumanderson/IdeaProjects/Indeed_Bot_POM/chromedriver 2");
        WebDriver driverLogin = new ChromeDriver();

        driverLogin.manage().window().maximize();
        driverLogin.get("https://www.indeed.ca/");
        **/

        this.OpenBrowser();

        LoginPage login = new LoginPage(this.getDriver());
        login.selectSignin();
        login.typeEmail();
        login.typePassword();
        login.submitCredentials();
        //driver.quit();

    }

}

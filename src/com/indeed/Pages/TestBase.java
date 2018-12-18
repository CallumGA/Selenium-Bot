package com.indeed.Pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {

    public static WebDriver driver = null;
    String baseurl = "https://www.indeed.ca/";

    public void OpenBrowser(){

        System.setProperty("webdriver.chrome.driver", "/Users/callumanderson/IdeaProjects/Indeed_Bot_POM/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600,900));
        driver.get(baseurl);
    }

    public WebDriver getDriver() {
        return driver;
    }
}

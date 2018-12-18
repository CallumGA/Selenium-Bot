package com.indeed.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 *
 * Pattern: Page object model
 *
 * This class will store all the locators and methods of landing page
 *
 */
public class LandingPage{

    WebDriver driver;

    By criteriaInput = By.xpath("//*[@id=\"text-input-what\"]");
    By findJobs = By.xpath("//*[@id=\"whatWhere\"]/form/div[3]/button");

    public LandingPage(WebDriver driver){

        this.driver = driver;
    }

    public void enterCriteria(){

        driver.findElement(criteriaInput).sendKeys("remote");

    }

    public void findJobs(){

        driver.findElement(findJobs).click();

    }




}

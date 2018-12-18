package com.indeed.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JobPage {

    WebDriver driver;

    public JobPage(WebDriver driver) {
        this.driver = driver;
    }

    public void applyJob() {


        // Determines how man applications you want to send out
        for (int i = 1; i < 3; i++) {

            By selectJob = By.id("sja" + i);
            driver.findElement(selectJob).click();

            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(By.className("indeed-apply-button")));

            By applyButton = By.className("indeed-apply-button");
            driver.findElement(applyButton).click();


            By continueButton = By.id("form-action-continue");
            driver.findElement(continueButton).click();



        }
    }


}






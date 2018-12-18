package com.indeed.Pages;

public class JobAction extends TestBase {


    public void clickJob(){

        JobPage jobs = new JobPage(this.getDriver());
        jobs.applyJob();

    }

}

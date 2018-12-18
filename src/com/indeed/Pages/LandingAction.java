package com.indeed.Pages;


public class LandingAction extends TestBase{


    public void searchJobs(){


        LandingPage landing = new LandingPage(this.getDriver());
        landing.enterCriteria();
        landing.findJobs();

    }





}

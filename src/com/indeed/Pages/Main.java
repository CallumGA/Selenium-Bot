package com.indeed.Pages;

public class Main {

    // Have this as the view, then hae a GUI take in credentials for what I want
    // to apply for(remote, developer etc)

    public static void main(String[] args){

        // Login to indeed
        LoginAction login = new LoginAction();
        login.verifyLogin();

        // Fill in the "what" page object here
        LandingAction landing = new LandingAction();
        landing.searchJobs();

        // Next Page object will be for applying to first list of jobs
        JobAction job = new JobAction();
        job.clickJob();
    }


}

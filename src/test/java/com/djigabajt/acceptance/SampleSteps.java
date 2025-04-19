package com.djigabajt.acceptance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleSteps {

    @Given("the application is running")
    public void theApplicationIsRunning() {
        System.out.println("Application is running");
    }

    @When("I perform a sample action")
    public void iPerformASampleAction() {
        System.out.println("Performing a sample action");
    }

    @Then("I should see a sample result")
    public void iShouldSeeASampleResult() {
        System.out.println("Sample result is displayed");
    }

}

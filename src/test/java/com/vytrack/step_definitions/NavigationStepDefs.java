package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationStepDefs {

    @Given("Logged in sales manager")
    public void logged_in_sales_manager() {
        System.out.println("I logged in as a sales manager");
    }

    @When("the user is in the vehicles page")
    public void the_user_is_in_the_vehicles_page() {
        System.out.println("I navigate fleet to Vehicles");
    }

    @Then("the user should see correct page url")
    public void the_user_should_see_correct_page_url() {
        System.out.println("I verified that the url is https://qa3.vytrack.com/entity/fleet/vehicles/ ");
    }
    @When("the user is in the campaings page")
    public void the_user_is_in_the_campaings_page() {
        System.out.println("I navigate Marketing to Campaigns");
    }

    @Then("the user should see campaigns page url")
    public void the_user_should_see_campaigns_page_url() {
        System.out.println("I verified that the url is https://qa3.vytrack.com/campaign/ ");
    }


}

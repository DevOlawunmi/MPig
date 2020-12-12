package com.Moonpig.stepDefinitions;

import com.Moonpig.pages.BasePage;
import com.Moonpig.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class BuyPersonalisedChristmasCardForParentsSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    @Given("I navigate to moonpig homepage")
    public void i_navigate_to_moonpig_homepage() {
launchURL();
    }

    @When("I click on Christmas")
    public void i_click_on_christmas() {
        homePage.clickOnChristmasButton();


    }
    @Then("a list of Christmas card options are displayed")
    public void a_list_of_christmas_card_options_are_displayed() {

    }
    @Then("I click on Cards For Parents")
    public void i_click_on_cards_for_parents() {

    }
}

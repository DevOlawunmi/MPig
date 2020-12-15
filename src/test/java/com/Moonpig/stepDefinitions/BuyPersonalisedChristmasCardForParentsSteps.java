package com.Moonpig.stepDefinitions;

import com.Moonpig.pages.BasePage;
import com.Moonpig.pages.ChristmasCardForParentsPage;
import com.Moonpig.pages.ChristmasPage;
import com.Moonpig.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class BuyPersonalisedChristmasCardForParentsSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    ChristmasPage christmasPage = PageFactory.initElements(driver,ChristmasPage.class);
    ChristmasCardForParentsPage christmasCardForParentsPage = PageFactory.initElements(driver, ChristmasCardForParentsPage.class);
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
        christmasPage.isChristmasPageDisplayed();

    }
    @Then("I click on Cards For Parents")
    public void i_click_on_cards_for_parents() {
        christmasPage.clickOnCardsForParents();

    }

    @And("cards for parents are displayed")
    public void cardsForParentsAreDisplayed() {
        christmasCardForParentsPage.assertPageTitleIsPresent();
    }
}

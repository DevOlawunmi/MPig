package com.Moonpig.pages;

import com.Moonpig.commons.DriverLibrary;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChristmasPage extends BasePage {
    public ChristmasPage(WebDriver driver){
        DriverLibrary.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(tagName = "h1")
    private WebElement pageTitle;
    @FindBy (xpath = "//*[@id=\"__next\"]/div[2]/div[4]/div/div/div/div[3]/a")
    private WebElement cardsForParentsButton;


    public void isChristmasPageDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());

    }
    public void clickOnCardsForParents(){
        cardsForParentsButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}

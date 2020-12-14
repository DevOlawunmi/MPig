package com.Moonpig.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChristmasCardForParentsPage extends BasePage {
    public ChristmasCardForParentsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(tagName = "h1")
    private WebElement pageTitle;

    public void assertPageTitleIsPresent(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
}

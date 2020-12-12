package com.Moonpig.pages;

import com.Moonpig.commons.DriverLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        DriverLibrary.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//*[@id=\"mega-nav-content\"]/ul/li[1]/div[1]/a/span")
    private WebElement christmasButton;

    public ChristmasPage clickOnChristmasButton(){
        christmasButton.click();
        return new ChristmasPage(driver);


    }










}

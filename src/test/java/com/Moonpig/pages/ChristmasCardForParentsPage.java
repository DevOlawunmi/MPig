package com.Moonpig.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChristmasCardForParentsPage extends BasePage {
    public ChristmasCardForParentsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}

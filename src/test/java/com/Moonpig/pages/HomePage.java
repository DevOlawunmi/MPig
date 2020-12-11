package com.Moonpig.pages;

import com.Moonpig.commons.DriverLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        DriverLibrary.driver = driver;
        PageFactory.initElements(driver, this);
    }


}

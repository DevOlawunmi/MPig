package com.Moonpig.pages;

import com.Moonpig.commons.DriverLibrary;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverLibrary {
    String BASE_URL = "https://www.moonpig.com/uk/";
    public Select select;

    public void launchURL(){
        driver.navigate().to(BASE_URL);
    }
}

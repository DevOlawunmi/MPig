package com.Moonpig.hooks;

import com.Moonpig.commons.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends Browsers {
    private Scenario scenario;
    @Before
    public void setUp(Scenario scenario){
        this.scenario = scenario;
        String defaultBrowser = "Chrome";
        launchBrowser(defaultBrowser);
    }

    @After
    public void teardown(){
        closeBrowser();
    }
}

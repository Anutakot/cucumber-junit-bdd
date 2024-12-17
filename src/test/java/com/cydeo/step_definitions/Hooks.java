package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void before() {
      //  Driver.get().get(ConfigurationReader.getValue("url"));
    }

    @After
    public void after(Scenario scenario) {

        BrowserUtils.wait(3);
        Driver.close();

    }
}

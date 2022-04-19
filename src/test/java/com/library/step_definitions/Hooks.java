package com.library.step_definitions;


import com.library.utility.DB_Util;
import com.library.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;




public class Hooks {

@Before
    public void ConnectDB(){
    DB_Util.createConnectionLibrary();
}

@After
public void teardownScenario(Scenario scenario){


    if (scenario.isFailed()){
        byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }

    Driver.closeDriver();

}
}


package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BaseSetup {
    @Before
    public void setUpDriver() {
        startDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://carnisero.com/login");
    }

    @After
    public void tearDown() {
        stopDriver();
    }
}

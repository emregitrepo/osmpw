package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp() {
        Driver.getPage();
    }

    @After
    public void tearDown() {
        Driver.closePage();
    }

    @After("@browser")
    public void tearDownBrowser() {
        Driver.closeDriver();
    }
}

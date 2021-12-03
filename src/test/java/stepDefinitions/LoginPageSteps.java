package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginPageSteps extends BaseSetup{
    @Given("^I have enter login information$")
    public void i_have_enter_login_information() {
        new LoginPage().loginInfo();
    }

    @When("^I click on submit$")
    public void i_click_on_submit() {
        new LoginPage().clickSubmit();
    }


    @And("^I observed the text \"([^\"]*)\"$")
    public void iObservedTheText(String expectText) {
        Assert.assertEquals(expectText, new LoginPage().setTextDisplayed());
    }
}

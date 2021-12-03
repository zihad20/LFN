package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BaseSetup;

public class LoginPage extends BaseSetup {
    @FindBy(xpath = "//*[@placeholder=\"Email/Username\"]")
    private WebElement userEmail;

    @FindBy(xpath = "//*[@placeholder=\"Password\"]")
    private WebElement userPass;

    @FindBy(xpath = "//*[contains(text(), \" Submit\" )]")
    private WebElement submit;

    @FindBy(xpath = "//*[contains(text(), \"User List\")]")
    private WebElement textUserList;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void loginInfo() {
        userEmail.click();
        userEmail.sendKeys("admin@gmail.com");
        sleepFor(3);
        userPass.click();
        userPass.sendKeys("12345");
    }

    public void clickSubmit() {
        sleepFor(3);
        submit.click();
    }

    public String setTextDisplayed() {
        sleepFor(3);
        return textUserList.getText();
    }

}

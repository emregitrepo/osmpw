package stepDefinitions;

import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.LoginPage;
import utilities.Driver;

public class LoginStepDef {

    private Page page;
    private LoginPage loginPage;

    public LoginStepDef() {
        // Constructor'da page ve loginPage'i initialize ediyoruz
        // Hooks sınıfı zaten page'i hazır hale getiriyor
        page = Driver.getPage();
        loginPage = new LoginPage(page);
    }

    @Given("Open the Osmanli Yatirim login page")
    public void openTheOsmanliYatirimLoginPage() throws InterruptedException {
        loginPage.openLoginPage();
       Thread.sleep(3000);
        // Sayfanın yüklendiğini kontrol et

    }

    @And("enter account no")
    public void enterAccountNo() {
        loginPage.enterAccountNo();
    }

    @And("enter password")
    public void enterPassword() {
        loginPage.enterpasswordNo();
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("enter sms code")
    public void enterSmsCode() throws InterruptedException {
        loginPage.enterSmsPassword();
    }
}

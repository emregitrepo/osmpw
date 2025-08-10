package stepDefinitions;

import com.microsoft.playwright.Page;
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
    public void openTheOsmanliYatirimLoginPage() {
        loginPage.openLoginPage();
        // Sayfanın yüklendiğini kontrol et
        if (loginPage.isPageLoaded()) {
            System.out.println("Login sayfası başarıyla açıldı");
        } else {
            throw new RuntimeException("Login sayfası yüklenemedi");
        }
    }
}

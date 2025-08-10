package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage extends CommonPage {

    // --------------------------------------- Locators------------------------------------------------------//
    private final String emailInputTextField = "input[type='email']";
    private final String passwordInputTextField = "input[type='password']";
    private final String loginButton = "button[type='submit']";
    private final String loginFormIsLoadedCheck = "form";






    // --------------------------------------- METHODS ------------------------------------------------------//


    public LoginPage(Page page) {
        super(page);
    }


    public void openLoginPage() {
        page.navigate("https://esubedev.osmanlimenkul.com.tr/login");
        loggerInfo("Osmanli Yatirim login sayfasi acildi");
    }

    public void enterEmail(String email) {
        Locator emailInput = page.locator(emailInputTextField);
        fill(emailInput, email);
        loggerInfo("Email adresi girildi: " + email);
    }

    public void enterPassword(String password) {
        Locator passwordInput = page.locator(passwordInputTextField);
        fill(passwordInput, password);
        loggerInfo("Sifre Girildi");
    }

    public void clickLoginButton() {
        Locator loginButton = page.locator(this.loginButton);
        click(loginButton);
        loggerInfo("Login butonuna tiklandi");
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
        loggerInfo("Login işlemi tamamlandı");
    }

    public boolean isPageLoaded() {
        return page.locator(loginFormIsLoadedCheck).isVisible();
    }





}

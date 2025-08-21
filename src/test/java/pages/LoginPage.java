package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage extends CommonPage {

    // --------------------------------------- Locators------------------------------------------------------//
   /* private final String emailInputTextField = "input[type='email']";
    private final String passwordInputTextField = "input[type='password']";
    private final String loginButton = "button[type='submit']";

    */
   // private final String loginFormIsLoadedCheck = "form";


    public Locator accountNoTextField;
    public Locator passwordNoTextField;
    public Locator loginButton;
    public Locator otpVerificationTextField;


    // --------------------------------------- METHODS ------------------------------------------------------//

    public LoginPage(Page page) {
        super(page);
        accountNoTextField=page.locator("#idInput");
        passwordNoTextField=page.locator("#passwordInput");
        loginButton=page.locator("#loginButton");
        otpVerificationTextField=page.locator("#smsPasswordInput");
    }




    public void openLoginPage() {
        page.navigate("https://esubedev.osmanlimenkul.com.tr/login");
        loggerInfo("Osmanli Yatirim login sayfasi acildi");
    }

    public void enterAccountNo() {
        waitFor(accountNoTextField);
       accountNoTextField.click();
        fill(accountNoTextField, "900092");
        loggerInfo("Account no girildi:");
    }

    public void enterpasswordNo() {
        passwordNoTextField.click();
        fill(passwordNoTextField, "123456");
        loggerInfo("Şifre girildi:");
    }

    public void clickLoginButton() {

        click(loginButton);
        loggerInfo("Giris Yap butonuna tiklandi");
    }

    public void enterSmsPassword() throws InterruptedException {
        //click(otpVerificationTextField);
        Thread.sleep(1000);
        type(otpVerificationTextField, "123456");
        Thread.sleep(1000);
        loggerInfo("OTP girildi:");
    }



    /*

    public void enterPassword(String password) {
        Locator passwordInput = page.locator(passwordInputTextField);
        fill(passwordInput, password);
        loggerInfo("Sifre Girildi");
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


*/


}

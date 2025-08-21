package stepDefinitions;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
public class HomePageStepDef {
private Page page;
    private HomePage homePage;


    public HomePageStepDef() {
        // Constructor'da page ve loginPage'i initialize ediyoruz
        // Hooks sınıfı zaten page'i hazır hale getiriyor
       page = Driver.getPage();
        homePage=new HomePage(page);

    }

    @And("check tabs")
    public void checkTabs() throws InterruptedException {
        Thread.sleep(3000);
        homePage.checkLotTab();
        Thread.sleep(2000);
        homePage.checkFundTab();
        Thread.sleep(2000);
        homePage.checkBesTab();
        Thread.sleep(2000);
        homePage.checkVadeliTab();
        Thread.sleep(2000);
        homePage.checkVarrantTab();
        Thread.sleep(2000);
        homePage.checkBondTab();
        Thread.sleep(2000);
        homePage.checkEurobondTab();
        Thread.sleep(2000);
        homePage.checkCashTab();

    }
}

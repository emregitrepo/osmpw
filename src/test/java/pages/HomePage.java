package pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePage extends CommonPage{
    public Locator lotTab;
    public Locator fundTab;
    public Locator besTab;
    public Locator vadeliTab;
    public Locator varrantTab;
    public Locator bondTab;
    public Locator euroBondTab;
    public Locator cashTab;
    public Locator lotTabTextCheck;
    public Locator fundTabCurrency;
public Locator besTabTextCheck;
public Locator vadeliTabTextcheck;
public Locator varrantTabTextCheck;
public Locator bondTabTextCheck;
public Locator euroBondTabTextCheck;
public Locator cashTabTextCheck;

    public HomePage(Page page) {
        super(page);
        lotTab=page.locator("(//button[normalize-space()='Hisse'])[1]");
        fundTab=page.locator("(//button[normalize-space()='Fon'])[1]");
        besTab=page.locator("(//button[normalize-space()='BES'])[1]");
        vadeliTab=page.locator("(//button[normalize-space()='Vadeli'])[1]");
        varrantTab=page.locator("(//button[normalize-space()='Varant'])[1]");
        bondTab=page.locator("(//button[normalize-space()='Bono'])[1]");
        euroBondTab=page.locator("(//button[normalize-space()='Eurobond'])[1]");
        cashTab=page.locator("(//button[normalize-space()='Nakit'])[1]");
        lotTabTextCheck=page.locator("(//div[@class='alert-text'])[1]");
        fundTabCurrency=page.locator("(//button[normalize-space()='TRL'])[1]");
        besTabTextCheck=page.locator("//div[contains(text(),' Portföyünüzde BES bulunmamaktadır. İşlem yapmak için ')]");
        vadeliTabTextcheck=page.locator("(//span[contains(text(),'Uzlaşma Fiyatı')])[1]");
        varrantTabTextCheck=page.locator("(//span[contains(text(),'Alım/ Satım')])[1]");
        bondTabTextCheck=page.locator("(//span[normalize-space()='Nominal'])[1]");
        euroBondTabTextCheck=page.locator("(//div[@class='alert-text'])[1]");
        cashTabTextCheck=page.locator("(//span[normalize-space()='Para Birimi'])[1]");
    }
    public void checkLotTab() {
        lotTabTextCheck.scrollIntoViewIfNeeded();
        assertThat(lotTabTextCheck).hasText("Hisse ve varant maliyetlerine hisse başına komisyon bedeli ilave edilmiştir ve kar/zarar hesaplamalarında fifo yöntemi (satışlarda ilk alınan kıymetlerden başlanması yöntemi) uygulanır.");
       // lotTabTextCheck.getByText("Hisse ve varant maliyetlerine hisse başına komisyon bedeli ilave edilmiştir ve kar/zarar hesaplamalarında fifo yöntemi (satışlarda ilk alınan kıymetlerden başlanması yöntemi) uygulanır.");
        loggerInfo("Hisse tabı tıklandı");


    }

    public void checkFundTab(){
        fundTab.click();
        assertThat(fundTabCurrency).hasText("TRL");

    }

    public void checkBesTab(){
        besTab.click();
        assertThat(besTabTextCheck).hasText(" Portföyünüzde BES bulunmamaktadır. İşlem yapmak için tıklayınız. ");

    }
     public void checkVadeliTab(){
        vadeliTab.click();
        assertThat(vadeliTabTextcheck).hasText("Uzlaşma Fiyatı");
     }
     public void checkVarrantTab(){
        varrantTab.click();
        assertThat(varrantTabTextCheck).hasText(" Alım/ Satım ");

     }
     public void checkBondTab(){
        bondTab.click();
        assertThat(bondTabTextCheck).hasText("Nominal");

     }

     public void checkEurobondTab(){
        euroBondTab.click();
        assertThat(euroBondTabTextCheck).hasText("Eurobond işlemleri çok yakında sizlerle!");

     }

     public void checkCashTab(){
        cashTab.click();
        assertThat(cashTabTextCheck).hasText("Para Birimi");

     }

}

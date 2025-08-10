package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonPage {

    protected Page page;

    public CommonPage(Page page) {
        this.page = page;
    }

    // -------------------------------------------------- Waits ---------------------------------------------------------------------------//

    public void waitFor(Locator locator) {
        locator.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
    }

    // -------------------------------------------------- Clicks ---------------------------------------------------------------------------//

    public void click(Locator locator) {
        waitFor(locator);
        locator.click();
    }

    // -------------------------------------------------- SendKeys ---------------------------------------------------------------------------//

    public void fill(Locator locator, String text) {
        waitFor(locator);
        locator.fill(text);
    }

    public void type(Locator locator, String text) {
        waitFor(locator);
        locator.type(text);
    }

    // -------------------------------------------------- Assertions ---------------------------------------------------------------------------//

    public void assertElementText(Locator locator, String expectedText) {
        String actualText = locator.textContent().trim();
        if (!actualText.equals(expectedText)) {
            throw new AssertionError("Text Kontrolu Basarisiz, Beklenen : '" + expectedText + "', Ancak Kontrolde Gorunen : '" + actualText + "'");
        }
    }

    // -------------------------------------------------- Logger ---------------------------------------------------------------------------//

    public void loggerInfo(String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);
        System.out.println("[" + timestamp + "] INFO: " + message);
    }

}

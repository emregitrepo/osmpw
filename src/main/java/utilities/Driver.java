package utilities;

import com.microsoft.playwright.*;

public class Driver {
    
    private static Playwright playwright;
    private static Browser browser;
    private static Page page;
    private static BrowserContext context;
    
    private Driver() {

    }
    public static Playwright getPlaywright() {
        if (playwright == null) {
            playwright = Playwright.create();
        }
        return playwright;
    }

    public static Browser getBrowser() {
        if (browser == null) {
            browser = getPlaywright().chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false)
                    .setSlowMo(1000));
        }
        return browser;
    }

    public static BrowserContext getContext() {
        if (context == null) {
            context = getBrowser().newContext(new Browser.NewContextOptions()
                    .setViewportSize(1920, 1080));
        }
        return context;
    }

    public static Page getPage() {
        if (page == null) {
            page = getContext().newPage();
        }
        return page;
    }

    public static Page newPage() {
        return getContext().newPage();
    }

    public static void closeDriver() {
        if (page != null) {
            page.close();
            page = null;
        }
        if (context != null) {
            context.close();
            context = null;
        }
        if (browser != null) {
            browser.close();
            browser = null;
        }
        if (playwright != null) {
            playwright.close();
            playwright = null;
        }
    }

    public static void closePage() {
        if (page != null) {
            page.close();
            page = null;
        }
    }

    public static void restartBrowser() {
        closeDriver();
        getPage();
    }
}

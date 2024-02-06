package TestCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class MarketingAndSalesPage {

    private By signUpForIntensive = By.xpath
            (".//div[@id='rec414195709']//div[@class = 't828__buttonwrapper t-btnwrapper']//tbody/tr");
    private By pageTitleMarketingAndSales = By.xpath
            (".//h1[@class='t891__title t-title t-title_xl t-animate t-animate_started']/div");
    private By pageNavigation = By.xpath(".//ul[@class = 't758__list']");



    private WebDriver driver;
    public MarketingAndSalesPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    public String pageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public String getMainTitle() {
        String pageTitle = $(pageTitleMarketingAndSales).getText();
        return pageTitle;
    }

    public String getTextfromPageNavigation(){
        String pageNavigationText = $(pageNavigation).getText();
        return pageNavigationText;
    }
}

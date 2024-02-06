package TestCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class VoitiVItPage {

    private By signUpForIntensive = By.xpath
            (".//div[@id='rec414195709']//div[@class = 't828__buttonwrapper t-btnwrapper']//tbody/tr");
    private By pageTitleVoitiVIt = By.xpath(".//h1[@class='t828__title t-title t-title_xl ']");


    private WebDriver driver;

    public VoitiVItPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public WebElement signUpForIntensiveButton() {
        WebElement signUpForIntensiveButton = $(signUpForIntensive);
        return signUpForIntensiveButton;
    }

    public String pageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public String getMainTitle() {
        String pageTitle = String.valueOf($(pageTitleVoitiVIt).getText());
        return pageTitle;
    }


}

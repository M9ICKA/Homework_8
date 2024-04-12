package TestCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class VoitiVItPage {

    private static By signUpForIntensive = By.xpath
            (".//div[@id='rec414195709']//div[@class = 't828__buttonwrapper t-btnwrapper']//tbody/tr");
    private static By pageTitleVoitiVIt = By.xpath(".//h1[@class='t828__title t-title t-title_xl ']");


    public static WebElement signUpForIntensiveButton() {
        WebElement signUpForIntensiveButton = $(signUpForIntensive);
        return signUpForIntensiveButton;
    }
   

    public static String getMainTitle() {
        String pageTitle = String.valueOf($(pageTitleVoitiVIt).getText());
        return pageTitle;
    }
public String getPageUrl(WebDriver driver){
        String url = driver.getCurrentUrl();
        return url;
    }

}

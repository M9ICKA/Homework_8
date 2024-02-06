package TestCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class SoftSkillsPage {
private By pageTitleSoftSkills = By.xpath(".//h1[@class='t828__title t-title t-title_xl ']/div");
private By pageSecondTitleSoftSkills = By.xpath(".//h2[@class = 't030__title t-title t-title_xxs']/div");

    private WebDriver driver;
    public SoftSkillsPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public String getMainTitle() {
        String pageTitle = $(pageTitleSoftSkills).getText();
        return pageTitle;
    }
    public String pageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }
    public String getSecondTitle() {
        String pageTitle = $(pageSecondTitleSoftSkills).getText();
        return pageTitle;
    }
}

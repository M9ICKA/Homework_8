package TestCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private By buttonSignUpForTheCourse = By.xpath("//td[@data-field = 'buttontitle']");

    private By directionButtonEnterTheIT = By.xpath
            (".//div[@class = 'tn-atom']/a[@href = 'https://belhard.academy/voitivit']");

    private By directionButtonMarketingAndSales = By.xpath
            (".//div[@class = 'tn-atom']/a[@href = 'https://belhard.academy/marketing']");

    private By directionButtonSoftSkills = By.xpath
            (".//div[@class = 'tn-atom']/a[@href = 'https://belhard.academy/soft-skills']");


    private WebDriver driver;

    public MainPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
    }


    public void clickOnTheSignUpForACourseButton() {
        $(buttonSignUpForTheCourse).click();
    }

    public void clickTheDirectionButtonEnterToIT() {
        $(directionButtonEnterTheIT).click();
    }

    public void clickTheDirectionButtonMarketingAndSales() {
        $(directionButtonMarketingAndSales).click();
    }

    public void clickTheDirectionButtonSoftSkills() {
        $(directionButtonSoftSkills).click();
    }


}

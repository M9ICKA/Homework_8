package TestCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class PopupSignUp {
    private By fieldNameInThePopupSignUp = By.xpath(".//input[@id='wdgMoyklass10945Formname']");
    private By fieldTelephoneInThePopupSignUp = By.xpath(".//input[@id='wdgMoyklass10945Formphone']");
    private By fieldSelectGroupInThePopupSignUp = By.xpath(".//option[@value = '0']");
    private By fieldEmailInThePopupSignUp = By.xpath("//div[@id='wdgMoyklass10945FormemailItem']/input[@id = 'wdgMoyklass10945Formemail']");
    private By titleInThePopupSignUp = By.xpath(".//div[@class ='wdgMoyklass-h1 text-center p-b-lg']");
    private By buttonSendRequestInPopUpSignUp = By.xpath(".//input[@id = 'FormSubmitBtnYklfQP7ET6YSIahST0fppVOxfzI4QY6yd3']");

    private WebDriver driver;
    public PopupSignUp(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void fillFieldNameInThePopupSignUp(String name) throws InterruptedException {
        $(fieldNameInThePopupSignUp).click();
        $(fieldNameInThePopupSignUp).sendKeys(name);
    }
    public void fillFieldTelephoneInThePopupSignUp(String telephone) throws InterruptedException {
       $(fieldTelephoneInThePopupSignUp).click();
       $(fieldTelephoneInThePopupSignUp).sendKeys(telephone);
    }
    public void fillFieldEmailInThePopupSignUp (String email) throws InterruptedException {
        $(fieldEmailInThePopupSignUp).click();
       $(fieldEmailInThePopupSignUp).sendKeys(email);
    }
    public void chooseDaytimeCoursesBasicsWeb(){
        $(fieldSelectGroupInThePopupSignUp).click();
        $(By.xpath(".//option[@id = 'YklfQP7ET6YSIahST0fppVOxfzI4QY6yd3Form-classItem77342']")).click();
    }
    public void clickSetButtonSendRequestInPopUpSignUp() {
        driver.findElement(buttonSendRequestInPopUpSignUp).click();
    }
    public String getTitleInThePopupSignUp(){
        String title = $(titleInThePopupSignUp).getText();
        return title;
    }
    public String getFieldNamePlaceHolder(){
        String placeholderFieldName = $(fieldNameInThePopupSignUp).getAttribute("placeholder");
        return placeholderFieldName;
    }
    public String getFieldTelephonePlaceHolder(){
        String placeholderFieldTelephone = $(fieldTelephoneInThePopupSignUp).getAttribute("placeholder");
        return placeholderFieldTelephone;
    }
    public String getFieldEmailPlaceHolder(){
        String placeholderFieldEmail = $(fieldEmailInThePopupSignUp).getAttribute("placeholder");
        return placeholderFieldEmail;
    }

}

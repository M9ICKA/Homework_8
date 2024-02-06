package TestCasePackage;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.open;

public class FiveTests {
//
//    @Test
//    public static void testButtonsRegisterForTheCourse() throws InterruptedException {   //Тест кнопки зарегистрироваться на курс
//        SoftAssert softAssert = new SoftAssert();
//        WebDriver driver = WebDriverRunner.getWebDriver();
//        MainPage mainPage = new MainPage(driver);
//        mainPage.clickOnTheSignUpForACourseButton();
//        PopupSignUp popupSignUp = new PopupSignUp(driver);
//
//        softAssert.assertEquals(popupSignUp.getTitleInThePopupSignUp(), "Записаться!");
//        softAssert.assertEquals(popupSignUp.getFieldNamePlaceHolder(), "Имя*");
//        softAssert.assertEquals(popupSignUp.getFieldTelephonePlaceHolder(), "Телефон*");
//        softAssert.assertEquals(popupSignUp.getFieldEmailPlaceHolder(), "Почта*");
//        softAssert.assertAll();
//    }
//    @Test
//    public static void fieldValidationTestnInPopUpSignUp() throws InterruptedException {  //Проверка валидации на отправку пустых полей
//        SoftAssert softAssert = new SoftAssert();
//
//        MainPage mainPage = new MainPage(driver);
//
//        mainPage.clickOnTheSignUpForACourseButton();
//        PopupSignUp popupSignUp = new PopupSignUp(driver);
//
//        popupSignUp.chooseDaytimeCoursesBasicsWeb();
//        popupSignUp.clickSetButtonSendRequestInPopUpSignUp();
//
//        String mainErorMesege = driver.findElement(By.xpath(".//div[@id = 'wdgMoyklass10945Other']")).getText();
//        softAssert.assertEquals(mainErorMesege, "Неправильно заполнены поля формы, проверьте введеные данные!");
//
//        String nameFieldErorMesege = driver.findElement(By.xpath(".//div[@id = 'wdgMoyklass10945FormnameItem']")).getText();
//        softAssert.assertEquals(nameFieldErorMesege, "Заполните поле");
//
//        String telephoneFieldErorMesege = driver.findElement(By.xpath(".//div[@id = 'wdgMoyklass10945FormphoneItem']")).getText();
//        softAssert.assertEquals(telephoneFieldErorMesege, "Заполните поле");
//
//        String mailFieldErorMesege = driver.findElement(By.xpath(".//div[@id = 'wdgMoyklass10945FormemailItem']")).getText();
//        softAssert.assertEquals(mailFieldErorMesege, "Заполните поле");
//        softAssert.assertAll();
//    }
    @Test
    public static void voitiVIt() throws InterruptedException {
        Configuration.browser = CHROME;
        Configuration.baseUrl = "https://belhard.academy/";
        Configuration.browserSize = "1920x1080";
        open(Configuration.baseUrl);


//        WebDriver driver;
//        driver = WebDriverRunner.getWebDriver();
//        MainPage mainPage = new MainPage(driver);
//        mainPage.clickTheDirectionButtonEnterToIT();
//
//        VoitiVItPage voitiVItPage = new VoitiVItPage(driver);
//
//        String joinBottom = voitiVItPage.signUpForIntensiveButton().getText();
//        $(joinBottom).equals("ЗАПИСАТЬСЯ НА ИНТЕНСИВ");
//        $(voitiVItPage.pageURL()).equals("https://belhard.academy/voitivit");
//        $(voitiVItPage.getMainTitle()).equals
//                ("Онлайн/офлайн интенсив\n" + "«Как войти в IT или\n" + "как стать IT-специалистом с нуля»");
    }
//    @Test
//    public static void marketingAndSales() throws InterruptedException {
//        SoftAssert softAssert = new SoftAssert();
//        MainPage mainPage = new MainPage(driver);
//        mainPage.clickTheDirectionButtonMarketingAndSales();
//
//        MarketingAndSalesPage marketingAndSalesPage = new MarketingAndSalesPage(driver);
//
//        softAssert.assertEquals(marketingAndSalesPage.pageURL(),"https://belhard.academy/marketing");
//        softAssert.assertEquals(marketingAndSalesPage.getMainTitle(), "Курсы - маркетинг и продажи\n" + "Занятия в аудитории и онлайн");
//        softAssert.assertEquals(marketingAndSalesPage.getTextfromPageNavigation(),"BELHARD Academy\n" + "/\n" + "Курсы маркетинга и продаж");
//        softAssert.assertAll();
//    }
//    @Test
//    public static void softSkills() throws InterruptedException {
//        SoftAssert softAssert = new SoftAssert();
//
//        MainPage mainPage = new MainPage(driver);
//        mainPage.clickTheDirectionButtonSoftSkills();
//
//        SoftSkillsPage softSkillsPage = new SoftSkillsPage(driver);
//
//        softAssert.assertEquals(softSkillsPage.pageURL(), "https://belhard.academy/soft-skills");
//        softAssert.assertEquals(softSkillsPage.getMainTitle(), "Онлайн/офлайн курс\n" + "«Soft Skills»");
//        softAssert.assertEquals(softSkillsPage.getSecondTitle(), "Этот тренинг для вас, если вы:");
//        softAssert.assertAll();
//    }

}
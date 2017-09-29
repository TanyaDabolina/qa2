package firstTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;



public class FirstTestTest {
    private String HOME_PAGE = "http://javaguru.lv";
    private static final By QA_COURSE_MENU_LINK = By.xpath(".//span[text()='Курс Тестирования(QA)']");
    private static final By QA_REGISTRATION_BTN = By.className("regCourseA");
    //private static final By ERROR_MSG = By.xpath("./div[text()='Šis ir obligāts jautājums.']");
    private static final By SEND_F = By.id("ss-submit");
    private static final By NAME_FIELD = By.id("entry_1000000");

    private static final By SURNAME =By.id("entry_1000001");
    //private static final By COMP_YN = By.id("group_738971122_1");
    //private static final By COMP_YN = By.xpath("//div[contains(label(),'QA 2']");
    private static final By COMP_YN = By.xpath("//input[contains(@class, 'ss-q-radio')]");
    private static final By MOB =By.id("entry_1000002") ;
    private static final By MAIL = By.id("entry_1000003");



    @Test
    public void FirstTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait= new WebDriverWait(driver,10);
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);
        driver.findElement(QA_COURSE_MENU_LINK).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  ??



        driver.findElement(QA_REGISTRATION_BTN).click();
        ArrayList<String> tabs = new ArrayList<String>();
        while (tabs.size() != 2) {
            tabs.clear();
            tabs.addAll(driver.getWindowHandles());
        }
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);

        WebElement element = wait. until(ExpectedConditions.presenceOfElementLocated(NAME_FIELD));
        element.clear();
        element.sendKeys();

        driver.findElement(NAME_FIELD).sendKeys("My Name");
        driver.findElement(SURNAME).sendKeys("My Surname");
        driver.findElement(MAIL).sendKeys("t4321@inbox.lv");
        driver.findElement(MOB).sendKeys("111111111");




        driver.findElement(COMP_YN).click();

        driver.findElement(SEND_F).click();
        //Assert.assertTrue("No error messages", driver.findElements(ERROR_MSG ).size()>0);
        driver.quit();
    }
}
package firstTest;

import java.util.HashMap;
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
import java.util.concurrent.TimeUnit;


public class FirstTestTest {
    private String HOME_PAGE = "http://javaguru.lv";
    private static final By QA_COURSE_MENU_LINK = By.xpath(".//span[text()='Курс Тестирования(QA)']");
    private static final By QA_REGISTRATION_BTN = By.className("regCourseA");
    //private static final By ERROR_MSG = By.xpath("./div[text()='Šis ir obligāts jautājums.']");
    private static final By NAME_FIELD = By.id("entry_1000000");
    private static final By SURNAME =By.id("entry_1000001");
    private static final By MOB =By.id("entry_1000002") ;
    private static final By MAIL = By.id("entry_1000003");
    //private static final By COMP_YN = By.id("group_738971122_1");
    //private static final By COMP_YN = By.xpath("//div[contains(label(),'QA 2']");
    private static final By LAPTOP_YN = By.xpath("//input[contains(@class, 'ss-q-radio')]");
    private static final By QA_COURSE_12 = By.xpath("//input[contains(@id, 'group_1887084786_2')]");
    private static final By SEND_F = By.id("ss-submit");



    @Test
    public void FirstTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait= new WebDriverWait(driver,10);
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);
        driver.findElement(QA_COURSE_MENU_LINK).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//       ---- obuchenie poiska po dvojnomu moasivu
        //poisk po HashMap
        HashMap<String, Integer> tmp = new HashMap<String, Integer>();
        Integer commentCount = tmp.get("Ushakov");

        //poisk po spisku
        List<String> titles = new ArrayList<String>();
        List<Integer> comentsCount = new ArrayList<Integer>();

        Integer commentCountForList;

        for (int i=0; i<titles.size(); i++) {
            if (titles.get(i).equals("Ushakov")) {
                commentCountForList = comentsCount.get(i);
                break;
            }
        }
//      ------


        driver.findElement(QA_REGISTRATION_BTN).click();
        ArrayList<String> tabs = new ArrayList<String>();
        while (tabs.size() != 2) {
            tabs.clear();
            tabs.addAll(driver.getWindowHandles());
        }
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);

//        WebElement element = wait. until(ExpectedConditions.presenceOfElementLocated(NAME_FIELD));
//        element.clear();
//        element.sendKeys();

//        mandatory fields check
        driver.findElement(SEND_F).click();


        driver.findElement(By.className("ss-form-title")).click(); // mouse out of mandatory fields
    if (driver.findElement(By.id("1953673096_errorMessage")).isDisplayed());
        {
            System.out.println("Šis ir obligāts jautājums.Name");
        }


//        fill form
        driver.findElement(NAME_FIELD).sendKeys("My Name");
        driver.findElement(SURNAME).sendKeys("My Surname");
        driver.findElement(MAIL).sendKeys("t4321@inbox.lv");
        driver.findElement(MOB).sendKeys("111111111");
        driver.findElement(QA_COURSE_12).click();
        driver.findElement(LAPTOP_YN).click();



        driver.findElement(SEND_F).click();
//        Assert.assertEquals("* Nepieciešams", source.getText());
//        Assert.assertTrue(driver.findElement(By.id("profile-page")).isDisplayed());
//        Assert.assertTrue("No error messages", driver.findElements(ERROR_MSG ).size()>0);

        if (driver.findElement(By.className("ss-confirmation")).isDisplayed());
        {
            // Print a Log In message to the screen
            System.out.println("Your response has been recorded.");
        }

        driver.quit();
    }
}
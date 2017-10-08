import firstTest.FirstTestTest;
import jdk.nashorn.internal.runtime.options.LoggingOption;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class DelfiTest {
    private String HOME_PAGE = "http://www.delfi.lv";
    private String HOME_PAGE2 = "http://www.mobiledelfi.lv";
    private static final By ARTICLE_FULL = By.xpath ("(//a[@class='top2012-title'])[1]");
    //    private static final By ARTICLE = By.xpath("")");
//    private static final By ARTICLE_TITLE = By.xpath("")");
//    private static final By INSIDE_TITLE = driver.findElement(By.xpath("./("");
    String TITLE;
    String TITLE_COUNT;
    private static final Logger LOGGER = LogManager.getLogger(FirstTestTest.class);

//    import java.unit.ArticeList;
//    import java.unit.List;
/*
Delfi.lv testing

1. go to defi.lv
a. go to mobile mobile delfi.lv
2. find 5 first titles (by xPath)
3. record in List titles, comments count
. create 2 Lists:
. ArrayListe<String> titles,
ArrayList<Integer> count
for(i=0;i<5;i++)
substring
intager value off

4. go to first title
5. verify title , verify comments count
6. go to comments tab
7. verify title
8. count total comments:
record zareg. Comments
record anonim Comments
9. verify comments
10. repeat step 3 -9 for all 5 titles

dobavlenie
sozdat peremennuju kotoroj mozhno budet prisvoit nazvanie statji i sravnit comment count v obichnoj versii i v mobilnoj
*/

    @Test
    public void DelfiMainPage() throws InterruptedException {
        System.setProperty ("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver ();
        //WebDriver mdriver = new FirefoxDriver();
//        List<String> ARTICLE_COMMENT_COUNT=List<String>
        WebDriverWait wait = new WebDriverWait (driver, 10);
        driver.get (HOME_PAGE);
        driver.manage ().window ().maximize ();
        // mdriver.get(HOME_PAGE2);


//        List<WebElement>articeList = driver.findElements(ARTICLE);

        List<String> TITLES = new ArrayList<String> ();
        List<Integer> COUNT = new ArrayList<Integer> ();
        List<Long> IDS_TO_CHECK = new ArrayList<Long> ();

//        ACTUAL_NAME_ERROR= driver.findElement(By.xpath("(//div[@class='required-message'])[1]")).getText();
        TITLE = driver.findElement(By.xpath ("(//a[@class='top2012-title'])[1]")).getText();

        TITLE_COUNT = driver.findElement(By.xpath ("(//a[@class='comment-count'])")).getText();//schitivaetsa kolichstvo kommentariev v pervoj statje
        System.out.println ("TITLE is: "+ TITLE +" comments:"+ TITLE_COUNT);//vivioditsa nazvanie statji i kollichestvo komentov k nej

        List<WebElement>art_icle_count = driver.findElements(By.xpath ("(//a[@class='top2012-title'])"));// sozdajom spisok i zapisivaem tuda nazvanie statji

        ArrayList<String> article_title = new ArrayList<String>(5); // sozdajom massiv s kollichestvom stork =5
//        (elements.size();


        System.out.println("Title count:"+ art_icle_count.size()); // size -schitaet kollichestvo statej na stranice vsego

        for(int i=0;i<5;i++){        //narashivaet masiv do 5 (t.k kolichstvo statej nas ne interesuet)

            TITLE = driver.findElements (By.xpath ("(//a[@class='top2012-title'])")).get (i).getText ();
            article_title.add(TITLE);                  //zapihivaem v masiv nazvanie statji
            System.out.println("Nomer article : "+i+" article Title : "+ article_title);
//            System.out.println(art_icle_count.get(i).getText());
        }
        //Logger.info ("Vivodim konechnij massiv ");   //logger ne rabotaet ???
        System.out.println("Vivodim konechnij massiv ");
        System.out.println("article Titles : "+ article_title);

/*
        for(int i=0;i<5; i++) {
            WebElement element = TITLES.get(i);
            TITLES.add(element.findElement(ARTICLE_TITLE).getText());
            IDS_TO_CHECK.add(element.findElement(ARTICLE_TITLE).getAttribute(s:"href").substring())); //berem nazvanie statji v vide id
            // proveraem est li voobshe comenti
            if (element.findElement(ARTICLE_COMMENT_COUNT).size() != 0) { //obrezaem skobki v komntarijah
                String countToParse = element.findElement(ARTICLE_COMMENT_COUNT).getText(); //naprimer u nas (106) komentov
                countToParse=countToParse.substring(countToParse.indexOf('('))+1, countToParse.indexOf(')')); // poluchem 106 (bez skobok)
                count.add(Integer.valueOf(countToParse)); //peredelivaem sting value v integer
            }
            // esli comnetarive voobshe net to prisvaevaem zanchenie = 0
        }else{
            count.add(0);
        }
                    }

}
                    //kak perejti na addres iz lista
//    driver.get("http://delfi.lv/delfi.lv/blablabla?id=" +idsToCheck.get(2));
//// bezhim po spisku title
//            for (int i=0; i<titles.size(); i++){
//            Assert.assertEquals("Title is not equal for an article:", +title.get(i), mobileTitle.get(), titles.get(i),mobileTatles.)
//Assert.assertEquals();
*/
/*

        ActualTitle = driver.findElements(ARTICLE_TITLE).getText();
        driver.findElement(ARTICLE_TITLE).click();
        InsideTitle = driver.findElements(INSIDE_TITLE).getText();
        Assert.assertEqual(ARTICLE_TITLE)
*/
//    }}

//    @Test
//public void secondTest()
//        {
//
    }
}
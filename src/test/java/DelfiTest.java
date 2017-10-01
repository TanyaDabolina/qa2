//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class DelfiTest {
//    private String HOME_PAGE = "http://www.delfi.lv";
//    private String HOME_PAGE2 = "http://www.mobiledelfi.lv";
////    private static final By ARTICLE = By.xpath("")");
////    private static final By ARTICLE_TITLE = By.xpath("")");
////    private static final By INSIDE_TITLE = driver.findElement(By.xpath("./("");
//
////    import java.unit.ArticeList;
////    import java.unit.List;
///*
//Delfi.lv testing
//
//1. go to defi.lv
//a. go to mobile mobile delfi.lv
//2. find 5 first titles (by xPath)
//3. record in List titles, comments count
//. create 2 Lists:
//. ArrayListe<String> titles,
//ArrayList<Integer> count
//for(i=0;i<5;i++)
//substring
//intager value off
//
//4. go to first title
//5. verify title , verify comments count
//6. go to comments tab
//7. verify title
//8. count total comments:
//record zareg. Comments
//record anonim Comments
//9. verify comments
//10. repeat step 3 -9 for all 5 titles
//
//dobavlenie
//sozdat peremennuju kotoroj mozhno budet prisvoit nazvanie statji i sravnit comment count v obichnoj versii i v mobilnoj
//*/
//
//    @Test
//    public void DelfiMainPage() throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        WebDriver mdriver = new FirefoxDriver();
////        List<String> ARTICLE_COMMENT_COUNT=List<String>
//        //WebDriverWait wait= new WebDriverWait(driver,10);
//        driver.get(HOME_PAGE);
//        mdriver.get(HOME_PAGE2);
//
////        List<WebElement>articeList = driver.findElements(ARTICLE);
//
//        List<String> titles = new ArrayList<String>();
//        List<Integer> count = new ArrayList<Integer>();
//        List<Long>idsToCheck = new ArrayList<Long>();
//
//        //sozajom listi dlja mobilok
//        List<String> mobileTitle = new ArrayList<String>();
//        List<Integer> mobileCount = new ArrayList<Integer>();
//        List<Long> midsToCheck = new ArrayList<Long>(); // id dolzhi bit odinakovie kak na obichnoj versii tak i na mobilnoj
//
//        for(int i=0;i<5; i++) {
////            WebElement element = articleList.get(i);
////            titles.add(element.findElement(ARTICLE_TITLE).getText());
////            idsToCheck.add(element.findElement(ARTICLE_TITLE).getAttribute(s:"href").substring())); //berem nazvanie statji v vide id
////            // proveraem est li voobshe comenti
////            if (element.findElement(ARTICLE_COMMENT_COUNT).size() != 0) { //obrezaem skobki v komntarijah
////                String countToParse = element.findElement(ARTICLE_COMMENT_COUNT).getText(); //naprimer u nas (106) komentov
////                countToParse=countToParse.substring(countToParse.indexOf('('))+1, countToParse.indexOf(')')); // poluchem 106 (bez skobok)
////                count.add(Integer.valueOf(countToParse)); //peredelivaem sting value v integer
////            }
//            // esli comnetarive voobshe net to prisvaevaem zanchenie = 0
////        }else{
////            count.add(0);
////        }
//                    }
//
//}
//                    //kak perejti na addres iz lista
////    driver.get("http://delfi.lv/delfi.lv/blablabla?id=" +idsToCheck.get(2));
////// bezhim po spisku title
////            for (int i=0; i<titles.size(); i++){
////            Assert.assertEquals("Title is not equal for an article:", +title.get(i), mobileTitle.get(), titles.get(i),mobileTatles.)
////Assert.assertEquals();
//
///*
//
//        ActualTitle = driver.findElements(ARTICLE_TITLE).getText();
//        driver.findElement(ARTICLE_TITLE).click();
//        InsideTitle = driver.findElements(INSIDE_TITLE).getText();
//        Assert.assertEqual(ARTICLE_TITLE)
//*/
////    }}
//
////    @Test
////public void secondTest()
////        {
////
////        }
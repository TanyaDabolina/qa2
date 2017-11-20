package PageObjectTest.Pages;

import PageObjectTest.PageObjectTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    BaseFunctions baseFunctions;
    private static final By ARTICLE = By.xpath("(//a[@class='top2012-title'])");
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);
    private static final By TITLE = By.xpath("//a[@href='http://rus.delfi.lv/news/daily/latvia/delfi-tv-s-yanisom-dombursom-na-voprosy-otvechaet-solvita-aboltinya-pryamaya-translyaciya.d?id=49433009']");
    private static final By COMMENT_COUNT = By.xpath("//h3/a[@class='comment-count']");

    public HomePage(BaseFunctions bs) {
        this.baseFunctions = bs;
    }

    public WebElement getFirstArticle() {
        LOGGER.info("Getting first article on homepage");
        return baseFunctions.getElement(ARTICLE);
    }

    public String getTitle(WebElement article) {
        LOGGER.info("Getting Title");
        By TITLE2 = By.xpath("//a[@href='http://rus.delfi.lv/news/daily/latvia/delfi-tv-s-yanisom-dombursom-na-voprosy-otvechaet-solvita-aboltinya-pryamaya-translyaciya.d?id=49433009']");
        String temp = article.findElement(TITLE2).getText();
        return temp;
    }

    public int getCommentCount(WebElement article) {
        LOGGER.info("Getting comment count");
        String countText = article.findElement(COMMENT_COUNT).getText();
        // dobavit logiku otbrasivnanija skobok
        return Integer.valueOf(countText);
    }

    public ArticlePage openArticle() {
        LOGGER.info("Click title");
        baseFunctions.clickElement(TITLE);
        return new ArticlePage(baseFunctions);
    }

}

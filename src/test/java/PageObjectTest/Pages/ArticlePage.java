package PageObjectTest.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArticlePage {

    BaseFunctions baseFunctions;
    CommentHelper ch = new CommentHelper();
    private static final By TITLE = By.xpath("Locator from the Article Page");
    private static final By COMMENT_COUNT = By.xpath("Locator from the Article Page");
    private static final Logger LOGGER = LogManager.getLogger(ArticlePage.class);

    public ArticlePage(BaseFunctions bs) {
        this.baseFunctions = bs;
    }

    public String getTitle() {
        LOGGER.info("Getting title from the article page");
        WebElement element = baseFunctions.getElement(TITLE);
        return element.getText();
    }

    public Integer getCommentCount() {
        LOGGER.info("Getting comment count from the article page");
        WebElement element = baseFunctions.getElement(COMMENT_COUNT);
        return ch.stringToInt(element.getText());
    }

    public CommentPage openCommentPage() {
        LOGGER.info("Click");
        baseFunctions.clickElement(COMMENT_COUNT);
        return new CommentPage(baseFunctions);
    }
}

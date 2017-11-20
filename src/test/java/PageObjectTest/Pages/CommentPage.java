package PageObjectTest.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommentPage {

    BaseFunctions baseFunctions;
    CommentHelper ch = new CommentHelper();

    private static final By TITLE = By.xpath("Locator from the Comment Page");
    private static final By COMMENT_REGISTERED = By.xpath("Locator from the Comment Page");
    private static final By COMMENT_ANONYMOUS = By.xpath("Locator from the Comment Page");
    private static final Logger LOGGER = LogManager.getLogger(CommentPage.class);

    public CommentPage (BaseFunctions bs) {
        this.baseFunctions = bs;
    }

    public String getTitle() {
        LOGGER.info("Getting title from the comment count page");
        WebElement element = baseFunctions.getElement(TITLE);
        return element.getText();
    }

    public Integer getRegisteredComments() {
        LOGGER.info("Getting registered comment count from the comment page");
        WebElement element = baseFunctions.getElement(COMMENT_REGISTERED);
        return ch.stringToInt(element.getText());
    }

    public Integer getAnonymousComments() {
        LOGGER.info("Getting anonymous comment count from the coment page");
        WebElement element = baseFunctions.getElement(COMMENT_ANONYMOUS);
        return ch.stringToInt(element.getText());
    }
}

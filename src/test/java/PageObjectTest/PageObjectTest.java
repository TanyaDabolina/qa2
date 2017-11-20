package PageObjectTest;

import PageObjectTest.Pages.ArticlePage;
import PageObjectTest.Pages.BaseFunctions;
import PageObjectTest.Pages.CommentPage;
import PageObjectTest.Pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class PageObjectTest {

    BaseFunctions baseFunctions = new BaseFunctions();
    private static final Logger LOGGER = LogManager.getLogger(PageObjectTest.class);
    private static final String HOME_PAGE_URL = "http://rus.delfi.lv";

    @Test
  public void delfiTest() {
        LOGGER.info("Open homepage");
        baseFunctions.goToURL(HOME_PAGE_URL);
        LOGGER.info("Getting first article title");
        HomePage homePage = new HomePage(baseFunctions);
        WebElement article = homePage.getFirstArticle();
        String title = homePage.getTitle(article);

        LOGGER.info("Getting first article comment count");
        Integer commentCount = homePage.getCommentCount(article);

        LOGGER.info("Open first article");
        ArticlePage articlePage = homePage.openArticle();

        LOGGER.info("Getting article title from the article page");
        String articleTitle = articlePage.getTitle();

        LOGGER.info("Getting article comment count from the article page");
        Integer articleCommentCount = articlePage.getCommentCount();

        LOGGER.info("Checking title with title from the article page");
        Assert.assertEquals("Articles are not equals", articleTitle, title);

        LOGGER.info("Checking comment");
        Assert.assertEquals("Comment counts are not equals", commentCount, articleCommentCount);

        LOGGER.info("Open comment page");
        CommentPage cp = articlePage.openCommentPage();

        LOGGER.info("Getting title on the comment page");
        String titleComment = cp.getTitle();

        LOGGER.info("Getting registered comment count");
        Integer regComm = cp.getRegisteredComments();

        LOGGER.info("Getting anonymous comment count");
        Integer anonymComm = cp.getAnonymousComments();

        LOGGER.info("Checking title from the home page and comment count page");
        Assert.assertEquals("Articles are not equals", articleTitle, titleComment);

        LOGGER.info("Checking comments from the home page and comment count page");
        Assert.assertTrue("Comment counts are not equals", commentCount ==  anonymComm + regComm);

        LOGGER.info("Test is successful");


    }

}

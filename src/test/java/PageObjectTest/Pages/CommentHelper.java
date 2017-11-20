package PageObjectTest.Pages;

import com.google.common.base.CharMatcher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommentHelper {

    private static final Logger LOGGER = LogManager.getLogger(CommentHelper.class);

    public Integer stringToInt(String textInput){
        String digits = CharMatcher.digit().retainFrom(textInput);
        return Integer.valueOf(digits);
    }

}

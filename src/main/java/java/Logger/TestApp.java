package java.Logger;

import org.apache.log4j.*;

public class TestApp {
    public static Logger logger  = Logger.getLogger(TestApp.class);
   /* public static void main(String[] args) {
        //Layout layout = new SimpleLayout();
        //Layout layout = new HTMLLayout();
        Layout layout = new PatternLayout();
        Appender app = new FileAppender(layout);
        logger.Appender(app);
        logger.debug("This");
        logger.info("I am just printing the message");
        logger.warning("There is a huge exception in your code please check and beware!");
    }*/
}

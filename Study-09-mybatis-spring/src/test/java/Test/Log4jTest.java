package Test;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {
    private static Logger logger = Logger.getLogger(Log4jTest.class);

    @Test
    public void test(){
        logger.info("[info]<");
        logger.debug("[debug]<");
    }
}

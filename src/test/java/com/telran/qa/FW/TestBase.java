package com.telran.qa.FW;

import com.telran.qa.FW.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeSuite
    public void setUp()
    {
        app.init();
    }

    @BeforeMethod
    public void startTest(Method m){
        logger.info("Start test" + m.getName());
    }

    @AfterSuite(enabled = false)
    public void tearDown()
    {
        app.stop();
    }

    @AfterMethod
    public void stopTest(Method m){
        logger.info("Stop test" + m.getName());}


}

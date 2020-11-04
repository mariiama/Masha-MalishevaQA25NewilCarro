package com.telran.qa.tests;

import com.telran.qa.FW.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeSuite
    public void setUp()
    {
        app.init();
    }

    @BeforeMethod
    public void startTest(Method m, Object[] p){
        logger.info("Start test" + m.getName() + "with data: " + Arrays.asList(p));
    }

    @AfterSuite(enabled = false)
    public void tearDown()
    {
        app.stop();
    }

    @AfterMethod (alwaysRun = true)
    public void stopTest(ITestResult result)
    {
        if (result.isSuccess()){
            logger.info ("PASSED: Test method" + result.getMethod().getMethodName());
        } else {
            logger.error ("FAILED: Test method " + result.getMethod().getMethodName());
            logger.info ("Screenshot:" + app.getCar().takeScreenshot());
        }

        logger.info("Stop test");
        logger.info("=====");
    }

}

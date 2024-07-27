package com.org.gpay.basetest;

import com.org.gpay.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest extends BasePage {
    BasePage basePage;
    @BeforeMethod
    public void setup() {
        System.out.println("Base Test Setup");
        basePage = new BasePage();
        basePage.initialization();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Base Test Teardown");
        basePage.tearDown();
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite Setup");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite Teardown");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test Setup");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test Teardown");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class Setup");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After Class Teardown");
    }
}

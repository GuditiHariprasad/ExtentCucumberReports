package com.org.gpay.tests;

import com.org.gpay.basetest.BaseTest;
import com.org.gpay.pages.LoginPage;
import com.org.gpay.utilities.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 extends BaseTest {

    LoginPage loginPage;
    @Test(timeOut=2000)
    public void test2() throws InterruptedException {
        System.out.println("Test 2");
        Thread.sleep(3000);
    }
    @Test(dataProvider="test")
    public void test3(String x1,String x2)
    {
        loginPage=new LoginPage(driver);
        loginPage.login(x1,x2);
        System.out.println("Logged through data provider :\n"+"username : "+x1+"\nPassword : "+x2);
    }

    @DataProvider(name="test")
    public Object[][] data1()
    {
        ExcelReader reader=new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/testdata/CN.xlsx");
        return reader.readExcel();
    }
}

package com.org.gpay.tests;

import com.org.gpay.basetest.BaseTest;
import com.org.gpay.pages.LoginPage;
import com.org.gpay.utilities.LoginDataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    LoginPage loginPage;
    @Test(description = "Login",priority =2)
    public void loginTest1() {
        loginPage=new LoginPage(driver);
        loginPage.login("admin","admin123");
        System.out.println("Logged in");
    }
    @Test(dataProvider = "dp",description = "login1",priority=1)
    public void loginTest2(String x1,String x2)
    {
        loginPage=new LoginPage(driver);
        loginPage.login(x1,x2);
        System.out.println("Logged through data provider :\n"+"username : "+x1+"\nPassword : "+x2);
    }
    @Test(dataProvider = "dp",dataProviderClass = LoginDataProvider.class,description = "login2",priority=0)
    public void loginTest3(String x1,String x2){
        loginPage=new LoginPage(driver);
        loginPage.login(x1,x2);
        System.out.println("Logged through data provider :\n"+"username : "+x1+"\nPassword : "+x2);
    }
    @DataProvider(name="dp")
    public Object[][] data1()
    {
        return new Object[][]{
                {"admin","admin123"},
                {"user","user123"},
                {"guest","guest123"}
        };
    }
}

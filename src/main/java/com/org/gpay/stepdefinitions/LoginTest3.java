package com.org.gpay.stepdefinitions;

import com.org.gpay.base.BasePage;
import com.org.gpay.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class LoginTest3 extends BasePage {
    BasePage basePage;
    LoginPage loginPage;
    @Given("user present on the orange hrm application")
    public void user_present_on_the_orange_hrm_application() throws InterruptedException {
        basePage = new BasePage();
        basePage.initialization();
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage=new LoginPage(driver);
        loginPage.setUsernameTextbox("admin");
        loginPage.setPasswordTextbox("admin123");
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage=new LoginPage(driver);
        loginPage.setUsernameTextbox(username);
        loginPage.setPasswordTextbox(password);
        System.out.println("Logged through data provider :\n"+"username : "+username+"\nPassword : "+password);
    }
    @When("user enters username and password from datatable")
    public void user_enters_username_and_password_from_datatable(DataTable data) {
        List<String> list=data.values();
        loginPage=new LoginPage(driver);
        loginPage.setUsernameTextbox(list.get(0));
        loginPage.setPasswordTextbox(list.get(1));
        System.out.println("Logged through data provider :\n"+"username : "+list.get(0)+"\nPassword : "+list.get(1));

    }
    @When("user enters username and password from datatable1")
    public void user_enters_username_and_password_from_datatable1(DataTable data) {
        loginPage=new LoginPage(driver);
        for(List<String> list:data.asLists(String.class))
        {
            loginPage.setUsernameTextbox(list.get(0));
            loginPage.setPasswordTextbox(list.get(1));
            if(list.get(1).equalsIgnoreCase("admin231"))
            {
                loginPage.getUsernameTextbox().clear();
                loginPage.getPasswordTextbox().clear();
            }
        }
    }
    @When("user enters a username1 and password1 from datatable2")
    public void user_enters_a_username1_and_password1_from_datatable2(DataTable data) {
        loginPage=new LoginPage(driver);
        for(Map<String,String> map:data.asMaps(String.class,String.class))
        {
            loginPage.setUsernameTextbox(map.get("username1"));
            loginPage.setPasswordTextbox(map.get("password1"));
            if(map.get("password1").equalsIgnoreCase("admin321"))
            {
                loginPage.getUsernameTextbox().clear();
                loginPage.getPasswordTextbox().clear();
            }
        }
    }

    @When("user1 enters a {string} and {string} from datatable2")
    public void user1_enters_a_and_from_datatable2(String username1, String password1) {
        loginPage=new LoginPage(driver);
        loginPage.setUsernameTextbox(username1);
        loginPage.setPasswordTextbox(password1);
        System.out.println("Logged through data provider :\n"+"username : "+username1+"\nPassword : "+password1);
    }


    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() throws InterruptedException {
        if(loginPage.getLoginButton().isEnabled())
        {
            loginPage.clickLoginButton();
            Thread.sleep(5000);
        }
    }

    @Then("user navigates to the home page")
    public void user_navigates_to_the_home_page() {
        String s1=driver.getTitle();
        Assert.assertEquals("OrangeHRM", s1);
        driver.close();
    }
}

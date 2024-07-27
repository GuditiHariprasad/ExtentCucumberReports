package com.org.gpay.pages;

import com.org.gpay.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(xpath="//input[@placeholder='Username']")
    private WebElement usernameTextbox;

    @FindBy(xpath="//input[@placeholder='Password']")
    private WebElement passwordTextbox;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement getUsernameTextbox()
    {
        return usernameTextbox;
    }
    public WebElement getPasswordTextbox()
    {
        return passwordTextbox;
    }
    public WebElement getLoginButton()
    {
        return loginButton;
    }
    // getters and setters for the web elements

    public void login(String username, String password) {
        usernameTextbox.sendKeys(username);
        reportText.log("username entered as "+username);
        passwordTextbox.sendKeys(password);
        reportText.log("password entered as "+password);
        reportText.attach(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/jpeg","");
        loginButton.click();
    }

    public void setUsernameTextbox(String username) {
        usernameTextbox.sendKeys(username);
        reportText.log("username entered as "+username);
        reportText.attach(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/jpeg","");
    }

    public void setPasswordTextbox(String password) {
        passwordTextbox.sendKeys(password);
        reportText.log("password entered as "+password);
        reportText.attach(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/jpeg","");
    }
    public void clickLoginButton() {
        loginButton.click();
    }
}

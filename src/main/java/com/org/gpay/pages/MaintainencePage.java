package com.org.gpay.pages;

import com.org.gpay.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaintainencePage extends BasePage {

    @FindBy(xpath="//input[@name='password']")
    private WebElement passwordTextbox;

    @FindBy(xpath="//button[@type='button']")
    private WebElement cancelButton;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement submitButton;

    public MaintainencePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterPassword(String password)
    {
        passwordTextbox.sendKeys(password);
    }

    public void clickCancelButton()
    {
        cancelButton.click();
    }

    public void clickSubmitButton()
    {
        submitButton.click();
    }
}

package com.org.gpay.pages;

import com.org.gpay.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage extends BasePage {

    @FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    private WebElement myInfoTitle;

    public MyInfoPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  String getMyInfoTitle()
    {
        return myInfoTitle.getText();
    }
}

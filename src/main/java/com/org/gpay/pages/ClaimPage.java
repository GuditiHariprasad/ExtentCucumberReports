package com.org.gpay.pages;

import com.org.gpay.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimPage extends BasePage {
    @FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    private WebElement claimTitle;

    public ClaimPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getClaimTitle()
    {
        return claimTitle.getText();
    }
}

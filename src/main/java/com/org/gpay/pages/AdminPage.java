package com.org.gpay.pages;

import com.org.gpay.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BasePage {
    @FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']")
    private WebElement adminTitle;

    @FindBy(xpath="//span[normalize-space()='User Management']")
    private WebElement userManagementLink;

    @FindBy(xpath="//span[normalize-space()='Job']")
    private WebElement jobLink;

    @FindBy(xpath="//span[contains(text(),'Organization')]")
    private WebElement organizationLink;

    @FindBy(xpath="//header[@class='oxd-topbar']//li[5]")
    private WebElement nationalitiesLink;

    @FindBy(xpath="//a[normalize-space()='Corporate Branding']")
    private WebElement corporateBrandingLink;

    @FindBy(xpath="//span[normalize-space()='Configuration']")
    private WebElement configurationLink;

    @FindBy(xpath="//input[@class='oxd-input oxd-input--focus']")
    private WebElement userNameInput;

    @FindBy(xpath="//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']")
    private WebElement dropdownUserRole;

    @FindBy(xpath="(//div[contains(text(),'Admin'])[1]")
    private WebElement adminRoleOption;
    public AdminPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getAdminTitle()
    {
        return adminTitle.getText();
    }
    // getters and setters
    public WebElement getUserManagementLink() {
        return userManagementLink;
    }
    public WebElement getJobLink() {
        return jobLink;
    }
    public WebElement getOrganizationLink() {
        return organizationLink;
    }
    public WebElement getNationalitiesLink() {
        return nationalitiesLink;
    }
    public WebElement getCorporateBrandingLink() {
        return corporateBrandingLink;
    }
    public WebElement getConfigurationLink() {
        return configurationLink;
    }
    // methods
    public void clickOnUserManagementLink()
    {
        userManagementLink.click();
    }
    public void clickOnJobLink()
    {
        jobLink.click();
    }
    public void clickOnOrganizationLink()
    {
        organizationLink.click();
    }
    public void clickOnNationalitiesLink()
    {
        nationalitiesLink.click();
    }
    public void clickOnCorporateBrandingLink()
    {
        corporateBrandingLink.click();
    }
    public void clickOnConfigurationLink()
    {
        configurationLink.click();
    }
    public void enterUserName(String userName)
    {
        userNameInput.sendKeys(userName);
    }
    public void clickOnDropdownUserRole(){
        dropdownUserRole.click();
    }
    public void selectAdminRole(){
        adminRoleOption.click();
    }

}

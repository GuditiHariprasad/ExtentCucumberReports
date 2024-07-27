package com.org.gpay.base;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BasePage {
    public static WebDriver driver;
    public static Properties prop;
    public static Scenario reportText;

    public BasePage(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/properties/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public  void initialization() {
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("FF")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get(prop.getProperty("url"));
        reportText.log("Application is launched sucessfully. URL: "+prop.getProperty("url"));
        reportText.attach(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/jpeg","");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.parseLong(prop.getProperty("pageload_wait"))));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(prop.getProperty("implicit_wait"))));

    }
    public void tearDown() {
        driver.quit();
    }
}

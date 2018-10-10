package utils;


import java.util.concurrent.TimeUnit;

import cucumber.api.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SeleniumDriver {

    public static WebDriver driver;

    public static void waitDriver() {
        driver = new ChromeDriver();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void openPage(String url) {
/*        System.out.println(url);
        System.out.println(driver);*/
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

/*    public static void selectDriver(String browser) {
        // If the browser is Firefox, then do this
        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            // If browser is IE, then do this
        } else if (browser.equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
    }*/
}
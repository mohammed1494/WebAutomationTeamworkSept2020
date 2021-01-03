package BaseTeamwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setup(String url) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammed Ali\\IdeaProjects\\TeamworkWebAutomation\\Generic\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().fullscreen();

    }

        //@AfterMethod
        //public void cleanUp(){ driver.close();
        //}
//    public void typeOnCss(String locator, String value)
//    {driver.findElement(By.cssSelector(locator)).sendKeys(value);}
//
//    public void typeOnID(String locator, String value)
//    {driver.findElement(By.id(locator)).sendKeys(value);}

    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex1) {
            try {
               driver.findElement(By.name(locator)).sendKeys(value);
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    driver.findElement(By.id(locator)).sendKeys(value);
                }
            }
        }
    }

    public void typeOnElementEntry(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }

    public void clickOnWebElement(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex1) {
            try {
                driver.findElement(By.name(locator)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.xpath(locator)).click();
                } catch (Exception ex3) {
                    driver.findElement(By.id(locator)).click();
                }
            }
        }
    }

    public void clearField(String locator) {
        driver.findElement(By.id(locator)).clear();}


    public void navigateBack() {
        driver.navigate().back();
    }
}



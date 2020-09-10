package test.java.pages;

import cucumber.api.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountDownPage {

    public static String before = null;
    public static String after = null;
    public static WebDriver driver;
    public static String pageTitleExpected = "E.gg Timer - a simple countdown timer";

    public void openWebpage() {
        //Set the chrome driver path
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\browser" + "\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("useAutomationExtension", false);

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://e.ggtimer.com/");
        driver.manage().window().maximize();

    }

    public void verifyPageTitle() {

        //Verify page title
        String pageTitleActual = driver.getTitle();
        Assert.assertEquals(pageTitleExpected, pageTitleActual);

    }

    public void verifyPageLoad() {

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"start_a_timer\"]")).isDisplayed());
    }

    public void startCountdownTimer() {
        //Clear the input field
        driver.findElement(By.xpath("//*[@id=\"start_a_timer\"]")).clear();
        //Enter 25 seconds
        driver.findElement(By.xpath("//*[@id=\"start_a_timer\"]")).sendKeys("25 seconds");
        //Click on Go button
        driver.findElement(By.xpath("//*[@id=\"timergo\"]")).click();

        try {
            while (true) {
                after = driver.findElement(By.xpath("//*[@id=\"progressText\"]")).getText();

                if (!after.equals(before)) {
                    System.out.println(after);
                    before = after;
                }//End of if


            } //End of while
        }//End of try

        catch (Exception e) {

        }
    }

    public void closeBrowser() {
        driver.quit();
    }
}

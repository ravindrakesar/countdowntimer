package test.java.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import test.java.pages.CountDownPage;

import java.util.concurrent.TimeUnit;

public class CountDownSteps {

    CountDownPage countDownPage = new CountDownPage();

    @Given("I have navigated to countdown page")
    public void openWebpage() {
        countDownPage.openWebpage();
    }

    @When("I verify page title")
    public void verifyPageTitle() {
        countDownPage.verifyPageTitle();
    }

    @Then("I verify page load")
    public void verifyPageLoad() {
        countDownPage.verifyPageLoad();
    }

    @When("I start the countdown timer and verify 1 sec decrements")
    public void startCountdownTimer() {
        countDownPage.startCountdownTimer();
    }

    @Then("I close the browser")
    public void closeBrowser() {
        countDownPage.closeBrowser();
    }
}

package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Constant;
import utils.SeleniumDriver;

public class LoginStep{


    @Given("^User opens YesBank Genie url on Chrome Firefox and IE$")
    public void userOpensYesBankGenieUrlOnChromeFirefoxAndIE() throws Throwable {
        SeleniumDriver.waitDriver();
        SeleniumDriver.openPage(Constant.url);
        System.out.println("User has opened on YesBank Genie url");
    }
    @When("^User is on Login Page$")
    public void userIsOnLoginPage() throws Throwable {
        String currentUrl = SeleniumDriver.getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, Constant.url);
        System.out.println("\nUser is on Login page");
    }

    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String Username, String Password) throws Throwable {
        SeleniumDriver.getDriver().findElement(By.name("email")).sendKeys(Username);
        SeleniumDriver.getDriver().findElement(By.name("passwd")).sendKeys(Password);
    }

    @And("^Click on submit$")
    public void clickOnSubmit() throws Throwable {
        SeleniumDriver.getDriver().findElement(By.id("SubmitLogin")).click();
        System.out.println("\nUser has clicked on submit button");
    }

    @Then("^User should land into Landing Page of Genie$")
    public void userShouldLandIntoLandingPageOfGenie() throws Throwable {
        String currentLandingUrl = SeleniumDriver.getDriver().getCurrentUrl();
        Assert.assertEquals(currentLandingUrl,Constant.landingUrl);
        System.out.println("\nUser has landed into landing or search page of Genie");
    }

    @And("^User logout from Genie$")
    public void userLogoutFromGenie() throws Throwable {
        SeleniumDriver.getDriver().findElement(By.className("logout")).click();
        System.out.println("\nUser has successfully logged out");
    }

    @Then("^Message displayed Invalid Credentials$")
    public void messageDisplayedInvalidUsernameAndPassword() throws Throwable {
        String currenUrl = SeleniumDriver.getDriver().getCurrentUrl();
        Assert.assertNotEquals(currenUrl,Constant.landingUrl);
        System.out.println("\nMessage displayed Invalid Username and password");
    }

    @And("^User close the browser$")
    public void userCloseTheBrowser() throws Throwable {
        SeleniumDriver.getDriver().quit();
        System.out.println("\nBrowser is closed");
    }
}

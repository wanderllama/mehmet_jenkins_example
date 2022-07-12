package cydeo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Test {
    @Then("User is redirected to the results")
    public void userIsRedirectedToTheResults() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Google"));
    }

    @Given("User is on google home page")
    public void userIsOnGoogleHomePage() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("User google enters apple into search bar")
    public void userGoogleEntersAppleIntoSearchBar() {
        Driver.getDriver().findElement(By.name("q")).sendKeys("apple");

    }

    @And("User clicks enter")
    public void userClicksEnter() {
        Driver.getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}

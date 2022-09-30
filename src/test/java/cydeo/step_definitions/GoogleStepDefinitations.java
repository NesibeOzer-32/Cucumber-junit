package cydeo.step_definitions;

import cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class GoogleStepDefinitations {
    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();

    }
    @Then("user see title is Google")
    public void user_see_title_is_google() {

        String expectedTitle = "Google";
        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();


    }
}

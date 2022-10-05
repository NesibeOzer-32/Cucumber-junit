package cydeo.step_definitions;

import cydeo.pages.GoogleSearchPage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitations {

    GoogleSearchPage googleSearchPage=new GoogleSearchPage();

    @When("user types apple and clicks enter")
    public void user_Types_Apple_And_Clicks_Enter() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

    }

    @Then("user sees apple in the google title")
    public void user_Sees_Apple_In_The_Google_Title() {

        String expectedTitle="apple - Google'da Ara";
        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }





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

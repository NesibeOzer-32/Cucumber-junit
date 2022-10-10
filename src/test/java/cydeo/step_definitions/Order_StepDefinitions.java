package cydeo.step_definitions;

import cydeo.pages.BasePage;
import cydeo.pages.OrderPage;
import cydeo.pages.WebTableLoginPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_StepDefinitions {

    BasePage basePage= new BasePage();
    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    OrderPage orderPage=new OrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        //Getting the page using the URL from configuration.properties
        Driver.getDriver().get(ConfigurationReader.getProperty("web.Table.Url"));

        //Calling our login method to web table app
        webTableLoginPage.login();

        //clicking to "order" link to go order page
        orderPage.order.click();


    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);
    }

    /*
    @When("user enters quantity {string}")
    public void user_enters_quantity(String string) {

    }*/
    @And("user enters quantity {int}")
    public void user_enters_quantity(Integer arg0) {
        //Accepting int argument and sending it using sendKeys() method
        //since sendKeys() method only accepts String, we need to either concat with ""
        //or send String.valueOf(int)
        //orderPage.inputQuantity.sendKeys(arg0+"");

        //clear() method will delete whatever is in the input box
        orderPage.inputQuantity.clear();
        //If clear method didnt work
        //orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);

        orderPage.inputQuantity.sendKeys(String.valueOf(arg0));

    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {

        orderPage.inputName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.inputStreet.sendKeys(string);

    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.inputCity.sendKeys(string);

    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {

        orderPage.inputState.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {

        orderPage.inputZip.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {
        //This line will loop through the list and decide which radio button to click
        BrowserUtils.clickRadioButton(orderPage.cardType,expectedCardType);


    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        orderPage.cardNoInput.sendKeys(string);

    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        orderPage.cardExpInput.sendKeys(string);

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPage.processOrderBtn.click();

    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {

    }


}

package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    //Create constructor
    //initialize the driver instance and this class' instance using PageFactory.initElements
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //We cant start locating web elements using @FindBy annotation
    @FindBy(xpath = "(//div[@class='QS5gu sy4vM'])[2]")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement searchBox;


}

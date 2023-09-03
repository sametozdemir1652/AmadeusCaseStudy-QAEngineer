package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class FlightsPage {


    public FlightsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "headlessui-combobox-button-:R1a9lla:")
    public WebElement fromMenu;

    @FindBy(id = "headlessui-combobox-button-:R1ahlla:")
    public WebElement toMenu;

    @FindBy(xpath = "//span[text()='Istanbul']")
    public WebElement iST;

    @FindBy(xpath = "//span[text()='Los Angeles']")
    public WebElement lAX;

    @FindBy(xpath = "//li[@data-headlessui-state='active selected']")
    public WebElement selectedCity;

    @FindBy(xpath = "//*[@class='mb-10']")
    public WebElement numOfFlights;

    @FindBy(xpath = "//ul[@role='list']/li")
    public List<WebElement> listOfFlights;







}





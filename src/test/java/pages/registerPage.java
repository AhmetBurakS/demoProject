package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class registerPage {

    public registerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Name Surname']")
    public WebElement fullNameTextBox;

    @FindBy(xpath = "//input[@placeholder='Company Name']")
    public WebElement companyNameTextBox;

    @FindBy(xpath = "//input[@placeholder='Work email']")
    public WebElement emailadressTextBox;

    @FindBy(xpath = "//input[@placeholder='Strong password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[text()='Sign up']")
    public WebElement signUpButton;

    @FindBy(xpath = "//span[text()='Project Management']")
    public WebElement projectManagementText;
}

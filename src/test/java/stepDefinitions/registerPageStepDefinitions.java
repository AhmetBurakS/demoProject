package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.registerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class registerPageStepDefinitions {

    registerPage registerPage = new registerPage();
    Faker faker = new Faker();
    String newName = "Super Admins " + faker.name().firstName();

    String newEmail = faker.internet().emailAddress();


    @Given("kullanici {string} e gider")
    public void kullanici_e_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }
    @Then("full name text box'a adini soyadini girer")
    public void full_name_text_box_a_adini_soyadini_girer() {
        ReusableMethods.wait(1);
        registerPage.fullNameTextBox.sendKeys(newName);
    }
    @Then("company name text box'a sirket ismini girer")
    public void company_name_text_box_a_sirket_ismini_girer() {
        ReusableMethods.wait(1);
        registerPage.companyNameTextBox.sendKeys(newName);
    }
    @Then("email address text box'a mail adresini girer")
    public void email_address_text_box_a_mail_adresini_girer() {
        ReusableMethods.wait(1);
        registerPage.emailadressTextBox.sendKeys(newEmail);
    }
    @When("password text box'a sifresini girer")
    public void password_text_box_a_sifresini_girer() {
        ReusableMethods.wait(1);
        registerPage.passwordTextBox.sendKeys("wawa121");
    }
    @When("sign up butona tiklar")
    public void sign_up_butona_tiklar() {
        ReusableMethods.wait(1);
        registerPage.signUpButton.click();
    }
    @Then("dashboard sayfasinda oldugunu dogrular")
    public void dashboard_sayfasinda_oldugunu_dogrular() {
        ReusableMethods.wait(3);
        Assert.assertTrue(registerPage.projectManagementText.isDisplayed());
    }


}

package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class loginPageStepDefinitions {

    loginPage maestro = new loginPage();

    @Given("kayitli kullanici {string} e gider")
    public void kayitli_kullanici_e_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }
    @Then("email text box'a gecerli emailini girer")
    public void email_text_box_a_gecerli_emailini_girer() {
        ReusableMethods.wait(1);
        maestro.emailTextBox.sendKeys(ConfigReader.getProperty("validE-posta"));
    }
    @Then("password text box'a gecerli password'unu girer")
    public void password_text_box_a_gecerli_password_unu_girer() {
        ReusableMethods.wait(1);
        maestro.passwordTextBox.sendKeys(ConfigReader.getProperty("validPassword"));
    }
    @Then("login ol butonuna tiklar")
    public void login_ol_butonuna_tiklar() {
        ReusableMethods.wait(1);
        maestro.signInButton.click();

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}

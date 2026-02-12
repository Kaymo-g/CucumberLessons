package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class registerSteps {
WebDriver driver;

    @Given("the user in on home login page")
    public void the_user_in_on_home_login_page() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#practice");
    }
    @When("the user clicks the register button")
    public void the_user_clicks_the_register_button() {
        driver.findElement(By.id("signup-toggle")).click();
    }
    @And("the user enters valid firstname {}")
    public void the_user_enters_valid_firstname(String firstname) {
        driver.findElement(By.id("register-firstName")).sendKeys(firstname);
    }
    @And("the user enters valid lastname {}")
    public void the_user_enters_valid_lastname(String lastname) {
        driver.findElement(By.id("register-lastName")).sendKeys(lastname);
    }
    @And("the user enters valid emailaddress {}")
    public void the_user_enters_valid_emailaddress(String emailaddress) {
        driver.findElement(By.id("register-email")).sendKeys(emailaddress);
    }
    @And("the user enters valid newpassword {}")
    public void the_user_enters_valid_newpassword(String newpassword) {
        driver.findElement(By.id("register-password")).sendKeys(newpassword);
    }
    @And("the user enters valid confirmation Password {}")
    public void the_user_enters_valid_confirmation_password(String confirmPassword) {
        driver.findElement(By.id("register-confirmPassword")).sendKeys(confirmPassword);
    }
    @And("the user select the group")
    public void the_user_select_the_group(){
        driver.findElement(By.id("register-group")).sendKeys("Nkosi tests (2026)");
    }
    @And("the user clicks the create account button")
    public void the_user_clicks_the_create_account_button() {
        driver.findElement(By.id("register-submit")).click();
    }
    @Then("the user has successfully registered")
    public void the_user_has_successfully_registered() {

    }

}

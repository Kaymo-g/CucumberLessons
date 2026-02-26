package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class adminLoginSteps {

    WebDriver driver;

    @Given("the admin user is on login page")
    public void the_admin_user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#practice");
    }
    @And("the admin user enters valid email {}")
    public void the_admin_user_enters_valid_email(String email) {
        driver.findElement(By.id("login-email")).sendKeys(email);
    }
    @And("the admin user enters valid password {}")
    public void the_admin_user_enters_valid_password(String password) {
        driver.findElement(By.id("login-password")).sendKeys(password);
    }
    @And("the admin user clicks the login button")
    public void the_admin_user_clicks_the_login_button() {

        driver.findElement(By.id("login-submit")).click();
    }
    @And("the admin user clicks tool menu")
    public void the_admin_user_clicks_tool_menu(){
        driver.findElement(By.xpath("//button[contains(@class,'user-pill')]")).click();
    }
    @Then("the admin user has logged in successfully")
    public void the_admin_user_has_logged_in_successfully() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

}

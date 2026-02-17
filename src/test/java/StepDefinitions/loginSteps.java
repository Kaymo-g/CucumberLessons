package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSteps {

    WebDriver driver;

    @Given("the user in on login page")
    public void the_user_in_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#practice");

    }
    @When("the user enters valid email {}")
    public void the_user_enters_valid_email(String email) {
        driver.findElement(By.id("login-email")).sendKeys(email);
    }
    @And("the user enters valid password {}")
    public void the_user_enters_valid_password(String password) {
        driver.findElement(By.id("login-password")).sendKeys(password);
    }
    @And("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        driver.findElement(By.id("login-submit")).click();
    }
    @And("the user clicks the learn icon")
    public void the_user_clicks_the_learn_icon(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[3]")).click();

    }
   /* @And("the user clicks on Learning Material")
    public void the_user_clicks_on_Learning_Material(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")).click();

    } */
    @Then("the user has logged in successfully")
    public void the_user_has_logged_in_successfully() throws InterruptedException {
        //driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[3]/div[1]/div[1]/h3")).isDisplayed();
        Thread.sleep(4000);
        driver.quit();

    }

}

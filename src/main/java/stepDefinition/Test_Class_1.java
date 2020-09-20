package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class_1 extends BasePage  {
    WebDriver driver;

    @Given("^User launch Browser$")
    public void user_launch_Browser() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();
        System.out.println("Driver Launch Sucessfull");

    }

    @When("^user launch application$")
    public void user_launch_application() throws Throwable {
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://github.com/login");

        System.out.println("Website Luanched Sucessfull");
    }

    @When("^User Click on Login Button$")
    public void user_Click_on_Login_Button() throws Throwable {
        driver.findElement(By.xpath("//*[@id='login_field']")).click();
    }

    @When("^User enter User email as \"([^\"]*)\"$")
    public void user_enter_User_email_as(String email) throws Throwable {
        driver.findElement(By.xpath("//*[@id='login_field']")).sendKeys(email);
    }

    @When("^User enter password as \"([^\"]*)\"$")
    public void user_enter_password_as(String password) throws Throwable {
        byte[] decodedBytes = Base64.decodeBase64("UGFzc3dkQDEyMzQ1Ng==");
        String passwd = new String(decodedBytes);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(passwd);
    }

    @Then("^Validate Application login successfull$")
    public void validate_Application_login_successfull() throws Throwable {
        driver.findElement(By.xpath("//*[@id='login']/form/div[4]/input[9]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary/img")).click();

        driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/form/button")).click();
        System.out.println("Logout Sucessfull");
        driver.close();
    }


}

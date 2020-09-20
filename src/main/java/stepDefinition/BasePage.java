package stepDefinition;

import org.apache.commons.codec.binary.Base64;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static void Enocoder() {
     WebDriver driver;
     byte[] decodedBytes = Base64.decodeBase64("UGFzc3dkQDEyMzQ1Ng==");
     String passwd = new String(decodedBytes);
}


}

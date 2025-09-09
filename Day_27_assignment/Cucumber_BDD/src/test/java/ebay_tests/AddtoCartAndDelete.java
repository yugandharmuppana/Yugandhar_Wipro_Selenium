package ebay_tests;

import ebay_tests.Cucumberpageclass;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AddtoCartAndDelete {
	 WebDriver driver;
	    Cucumberpageclass ebay;

	    @Given("the user is on the eBay homepage to add and remove item")
	    public void user_on_homepage_to_add_remove() {
	        driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://www.ebay.com/");
	    }

	    @When("the user adds and removes an item from the cart")
	    public void user_adds_and_removes_item() throws InterruptedException {
	        ebay = new Cucumberpageclass(driver);
	        ebay.addToCartandDelete();
	    }

	    @Then("the cart should not contain the item")
	    public void cart_should_be_empty() {
	        System.out.println("Cart item removed.");
	        driver.quit();
	    }
 }
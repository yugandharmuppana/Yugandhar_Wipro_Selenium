package ebay_tests;

import java.time.Duration;

import ebay_tests.Cucumberpageclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DailyDeals {
	WebDriver driver;
	@Given("open the eBay website in uur browserrr")
	public void open_the_e_bay_website_in_uur_browserrr() {
		driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	}

	@When("click on daily deals")
	public void click_on_daily_deals() throws InterruptedException {
		driver.findElement(By.cssSelector("a[_sp=\"m570.l3188\"]")).click();
		Thread.sleep(2000);
		driver.close();
	    
	}

	@Then("daily deals page is opened")
	public void daily_deals_page_is_opened() {
		System.out.print("opening deals page");
	    
	}




}

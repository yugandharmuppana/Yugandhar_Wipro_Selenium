package Sele_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//sample alert(accept)
		//confirmation alert(accept or cancel)
		// prompt alerts (add input and then accept, or cancel)
		
		WebElement samplealert=driver.findElement(By.id("alertButton"));
		samplealert.click();
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement timealert=driver.findElement(By.id("timerAlertButton"));
		timealert.click();
		Thread.sleep(7000);
		Alert alert12=driver.switchTo().alert();
		alert12.accept();	
		
		Thread.sleep(3000);
		WebElement confirmalert=driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Thread.sleep(4000);
		Alert alert1=driver.switchTo().alert();
		
		alert1.dismiss();
		Thread.sleep(3000);
		WebElement promptalert=driver.findElement(By.id("promtButton"));
		promptalert.click();
		Thread.sleep(4000);
		Alert alert11=driver.switchTo().alert();
		alert11.sendKeys("Harry");
		alert11.accept();
		
		driver.close();
		
		}

	}
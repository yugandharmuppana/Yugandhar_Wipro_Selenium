package Sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemoQA {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement fname=driver.findElement(By.cssSelector("div>input[placeholder=\"First Name\"]"));
		fname.sendKeys("Yugandhar");
		WebElement lname=driver.findElement(By.cssSelector("div>input[placeholder=\"Last Name\"]"));
		lname.sendKeys("Muppana");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.cssSelector("select>option[value=\"2025\"]")).click();
		driver.findElement(By.cssSelector("select>option[value=\"3\"]")).click();
		driver.findElement(By.cssSelector("div[aria-label=\"Choose Tuesday, April 1st, 2025\"]")).click();
	}

}



/*
 * Css Selector 1.by id Syntax- node[id=”Value”]
 * 
 * 2. classname Systax- node [classname=”value”]
 * 
 * 3.multiple attribute Syntax- node#otherattributevalue[attribute=”Attribute
 * vale”]
 * 
 * 4 . by attribute Syntax- node[anyattribute=”attribute value”]
 * 
 * 5. parent child Syntax- parentnode>childnode[childattribute=”Attributevalue”]
 */
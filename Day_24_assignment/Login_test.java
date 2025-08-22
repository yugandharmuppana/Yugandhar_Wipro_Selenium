package Testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login_test {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @Parameters({"username", "password"})
    public void testLogin(@Optional("username") String username, 
                         @Optional("password") String password) throws InterruptedException {
        
        System.out.println("Username: " + username + "Password: " + password);
        
        
        driver.get("http://zero.webappsecurity.com/login.html");
        
        
        WebElement usr = driver.findElement(By.id("user_login"));
        usr.clear();
        usr.sendKeys(username);
        
        WebElement psw = driver.findElement(By.id("user_password"));
        psw.clear();
        psw.sendKeys(password);
        
        
        driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
        
        
        
    }

    @AfterTest
    public void tearDown() {
        
            driver.quit();
        
    }
}
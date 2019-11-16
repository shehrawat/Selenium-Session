package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\All Jar Files\\Chromedriver\\New exev77.10\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://psydro.com");
        
//		/html/body/header/div[2]/div/div/div[2]/nav/ul/li[2]/a - This is absolute xpath        
        
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("www.hestabit.com");
        
        //if there is a dynamic id then we use 
//      contains function
        //id=test_123
        //id=test_456
        //id=test_643
        //id=test_732
        
//       starts-with function test
        //id=test_123
        //id=test_456
        //id=test_643
        //id=test_732
        
//       ends-with function test
        //id=123_test
        //id=456_test
        //id=643_test
        //id=732_test
        
        //if there is a dynamic id then we use starts-with and ends-with
        
       // driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("www.hestabit.com");
     // driver.findElement(By.xpath("//input[starts-with(@id,'search')]")).sendKeys("www.hestabit.com");
//        driver.findElement(By.xpath("//input[ends-with(@id,'test')]")).sendKeys("");
        
        //for links custom xpath
        //all the links are represented by <a> html tag:
        
        driver.findElement(By.xpath("//a[contains(text(),'Competitions')]")).click();
        
        driver.quit();
        
        
        
        
        
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
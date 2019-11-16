package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\All Jar Files\\Chromedriver\\New exev77.10\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://psydro.com");
        
        //1. get the total count of links on the page
        //2. get the text of each links
        
      //all the links are represented by <a> html tag:
        
        List <WebElement> linklist = driver.findElements(By.tagName("a"));
        //size of links
        System.out.println(linklist.size());
        
        for(int i=0;i<linklist.size();i++) {
        	String linktext = linklist.get(i).getText();
        	System.out.println(linktext);
        }
        
        driver.quit();
	}

}

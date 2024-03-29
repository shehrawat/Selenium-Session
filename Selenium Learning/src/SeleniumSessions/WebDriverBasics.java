package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//1. FF browser:
		//geckodriver - It is  a class in selenium
		//FirefoxDriver is a class
		//WebDriver is an Interface
		//all methods are predefined in WebDriver Interface like: get,sendkeys etc
		
//		System.setProperty("webdriver.gecko.driver","D:\\All Jar Files\\Firefox\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();	//launch FF
//        driver.get("https://www.gmail.com");	//enter url
//        String title = driver.getTitle();
//        System.out.println(title);
        
		//1. Chrome browser: Version:77.10
        System.setProperty("webdriver.chrome.driver", "D:\\All Jar Files\\Chromedriver\\New exev77.10\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.psydro.com");

        driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content");
        String meta = driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content");
        
        System.out.println("Meta description is : "+meta);
        
        //validatition point:
        if(meta.equals("Psydro is a unique reviews platform for both consumers and businesses, offering rewards for your honesty and feedback.")) {
        	System.out.println("Meta is correct");
        }
        else {
        	System.out.println("Meta is incorrect");
        }

        String title = driver.getTitle();
        
        System.out.println("Title is: "+title);
        
        //validatition point:
        if(title.equals("Customer Reviews Platform for Consumers & Business | Psydro")) {
        	System.out.println("Title is correct");
        }
        else {
        	System.out.println("Title is incorrect");
        }
        
        System.out.println(driver.getCurrentUrl());
//      System.out.println(driver.getPageSource());
        driver.quit();
        
        
        
        
	}

}












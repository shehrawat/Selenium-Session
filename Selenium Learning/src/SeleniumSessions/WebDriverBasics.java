package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//1. FF browser:
		//geckodriver - It is  a class in selenium
		//FirefoxDriver is a class
		//WebDriver is an Interface
		
		System.setProperty("webdriver.gecko.driver","D:\\All Jar Files\\Firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();	//launch FF
        driver.get("https://www.gmail.com");	//enter url
	}

}
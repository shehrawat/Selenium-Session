package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\All Jar Files\\Chromedriver\\New exev77.10\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://html.com/input-type-file/");
        
        driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Ajay Shehrawat\\Desktop\\Selenium Archtecture.png");
	}

}

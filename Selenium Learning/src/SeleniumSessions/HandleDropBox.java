package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\All Jar Files\\Chromedriver\\New exev77.10\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        
        //handle drop down
        Select select  = new Select(driver.findElement(By.id("day")));
        Select select1  = new Select(driver.findElement(By.id("month")));
        Select select2  = new Select(driver.findElement(By.id("year")));
        select.selectByVisibleText("26");
        select1.selectByVisibleText("Sept");
        select2.selectByVisibleText("1992");
        driver.findElement(By.id("u_0_7")).click();
        

        
	}

}

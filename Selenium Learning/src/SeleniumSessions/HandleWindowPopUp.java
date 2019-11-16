package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\All Jar Files\\Chromedriver\\New exev77.10\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("http://popuptest.com/goodpopups.html");
        
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
        
        Set <String> handle = driver.getWindowHandles();
        
        Iterator <String> it = handle.iterator();
        
        String parentwindowid = it.next();
        System.out.println("parent window id is: "+parentwindowid);
        
        String childwindowid = it.next();
        System.out.println("child window id: "+childwindowid);
        
        driver.switchTo().window(childwindowid);
        String title = driver.getTitle();
        System.out.println("Title of child window is: "+title);
        
        driver.close();
        
        driver.switchTo().window(parentwindowid);
        String title1 = driver.getTitle();
        System.out.println("Title of child window is: "+title1);
        driver.close();
        
        
	}

}

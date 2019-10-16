package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "D:\\All Jar Files\\Chromedriver\\New exev77.10\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.facebook.com/signup");

		// In selenium there are 8 locators

		// 1.xpath - 2nd priority
		// absolute xpath should not be used -
		// //*[@id="lastest-review-list"]/a[1]/div/div/p
		// only relative xpath should be used - //*[@id="search"]

//        driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("Ajay");
//        driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys("Singh");
//        driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).sendKeys("9205725232");
//        driver.findElement(By.xpath("//*[@id=\"u_0_z\"]")).sendKeys("qwerty@@");

		// 2.id - 1st priority

//        driver.findElement(By.id("u_0_n")).sendKeys("Ajay");
//        driver.findElement(By.id("u_0_p")).sendKeys("Singh");

		// 3.name - 3rd priority

//        driver.findElement(By.name("firstname")).sendKeys("Ajay");
//        driver.findElement(By.name("lastname")).sendKeys("Singh");

		// 4.link text: this is only for links - 1st priority if links available.If id
		// also available then 1st priority is id

//        driver.findElement(By.linkText("Cookie Policy")).click();

		// 5.partiallinkText: not useful

//        driver.findElement(By.partialLinkText("Log In to Existing Account")).click();

		// 6.CSSSelector - 2nd priority
		// if id is there then cssSelector is #id
		// if class is there then cssSelector is .id

//          driver.findElement(By.cssSelector("#u_0_n")).sendKeys("Ajay");
//          driver.findElement(By.cssSelector("#u_0_p")).sendKeys("Singh");

		// 7.class: not useful - 4th priority

//        driver.findElement(By.className("_sv4")).click();

		// 8.tag name

		// driver.quit();

	}

}

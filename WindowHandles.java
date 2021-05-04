import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone",Keys.ENTER);
	driver.findElement(By.xpath("//a[@title='APPLE iPhone 11 (Black, 64 GB)']")).click();
	String pwid = driver.getWindowHandle();
	System.out.println(pwid);
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	for (String cw : windowHandles) {
		if (!pwid.equals(cw)) {
			driver.switchTo().window(pwid);
		}
		
	}
	
}
}

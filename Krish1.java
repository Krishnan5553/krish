
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Krish1 {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		WebElement user=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		user.sendKeys("sivfgffgfga");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("1234tnj");
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		login.click();
}
}

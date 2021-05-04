import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hdfcbank.com/");
	WebElement element = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	element.click();
	
}
}

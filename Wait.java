import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");

		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='table_id']//tr//td[2]"));

		ArrayList<Integer> al = new ArrayList<>();
		for (WebElement x : findElements) {
			String text = x.getText();

			al.add(Integer.parseInt(text.replace("%", "")));

		}

		System.out.println(al);

		Integer min = Collections.max(al);

		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();

			if (text.contains(String.valueOf(min))) {
				int j = i + 1;
				driver.findElement(By.xpath("(//table[@id='table_id']//tr//td[3]/input)[" + j + "]")).click();
			}
		}

	}
}

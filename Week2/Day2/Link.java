package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.findElement(By.linkText("Go to Home Page")).getAttribute("href"));
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		System.out.println(driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href"));
		System.out.println(driver.findElement(By.linkText("Go to Home Page")).getAttribute("link"));
		System.out.println(driver.findElement(By.linkText("How many links are available in this page?")).getAttribute("href"));
		

	}

}

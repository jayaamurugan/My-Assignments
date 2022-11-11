package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.findElement(By.id("home")).getTagName());
		System.out.println("button position :" +driver.findElement(By.id("position")).getLocation());
		System.out.println("button color :" +driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("height and width:" +driver.findElement(By.id("size")).getSize());
		
	}

}

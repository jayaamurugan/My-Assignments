package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

//import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Sample {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement WhichisyourfavoriteUIAutomationtool =driver.findElement(By.className("ui-selectonemenu"));
		Select sc=new Select(WhichisyourfavoriteUIAutomationtool);
		sc.selectByVisibleText("Puppeteer");
	}

}

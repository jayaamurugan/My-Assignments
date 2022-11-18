package Week3.Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='searchVal']")).click();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		//driver.findElement(By.xpath("//span[text()='category']")).click();
		Thread.sleep(2000);
       // driver.findElement(By.xpath("//span[text()='category']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String item = driver.findElement(By.xpath("//div[text()=' Items Found']")).getText();
		System.out.println(item);
		 driver.findElement(By.xpath("//span[text()='brands']")).click();
		 driver.findElement(By.xpath("(//div[text()='MORE'])[2]")).click();
		 List<WebElement> list = driver.findElements(By.xpath("//span[@class='facet-list-title-name']"));
		 for(int i=0;i<list.size();i++) {
			 String text = list.get(i).getText();
			 System.out.println(text);
		 }
		 List<WebElement> list1 = driver.findElements(By.className("name"));
		 for(WebElement w:list1) {
			 String text = w.getText();
			 System.out.println(text);
		 }
		
	}
	

}

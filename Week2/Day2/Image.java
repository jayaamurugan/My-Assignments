package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver=new EdgeDriver();
	driver.get("http://testleaf.herokuapp.com/pages/Image.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).isDisplayed());
	driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
	
	

}
}

package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Merge_Contact {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(driver.getTitle());
		List<String>lstwindowHandles=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwindowHandles.get(1));
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(lstwindowHandles.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>lstwindowHandles1=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(lstwindowHandles1.get(1));
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.switchTo().window(lstwindowHandles.get(0));
		WebElement cl = driver.findElement(By.xpath("//a[@class='buttonDangerous']"));
		cl.click();
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.accept();
		System.out.println(driver.getTitle());
		
		
		
		
	}

}

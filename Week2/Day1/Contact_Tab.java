package Week2.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact_Tab {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();;
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().minimize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	//to check whether the title is open
	String title=driver.getTitle();//ctrl+2+l
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Jayaa");
	driver.findElement(By.id("lastNameField")).sendKeys("Murugan");
	driver.findElement(By.name("submitButton")).click();
	System.out.println("First name : Jayaa");
	System.out.println("Last name : Murugan");
	System.out.println(driver.getTitle());
	driver.close();

	
	

	
	
	
	
	
	
}
}

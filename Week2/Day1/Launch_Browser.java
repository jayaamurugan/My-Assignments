package Week2.Day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {
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
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaa");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugan");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSC");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Good");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jayamurugan@gmail.com");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
	
	
	//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("")
	
	
	
	}
}

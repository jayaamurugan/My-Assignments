package Marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_2 {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions ch=new ChromeOptions();
	ch.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(ch);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(" https://login.salesforce.com");
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Testleaf$321");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
    WebElement opportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
    driver.executeScript("arguments[0].click();",opportunity );
    driver.findElement(By.xpath("//div[@title='New']")).click();
    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Testing-Softwares");
    driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).click();
    driver.findElement(By.xpath("//span[@title='Jayaamurugan']")).click();
    driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("10/12/2023");
    driver.findElement(By.xpath("//label[text()='Stage']")).click();
    driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
    driver.findElement(By.xpath("//button[text()='Save']")).click();
    String attribute = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']/a")).getAttribute("title");
    String title = driver.getTitle();
    System.out.println(title);
    System.out.println(attribute);
    
    if(attribute.contains("Testing-Softwares"))
    {
    	System.out.println("Opportunity was created");
    }
    else
    {
    	System.out.println("Not created");
    }
    
    
    
}
}

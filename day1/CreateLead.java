package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		//launch the browser(chrome)
		 ChromeDriver driver=new ChromeDriver(); 
		 // maximize window
		 driver.manage().window().maximize();
		 //Load the URL
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 //wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		 // Enter username
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 //Click login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //Click CRM/SFA
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
			System.out.println(driver.getTitle());
			//Click lead
			driver.findElement(By.linkText("Leads")).click();
			//click create lead
			driver.findElement(By.linkText("Create Lead")).click();
			//Enter company name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			//Enter first name
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavitha");
			//Enter lastname
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
			//Enter firstname (local)
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kavitha");
			//Enter Department Field
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("MCA");
            //Enter Description
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Nil");
			//Enter Email
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kavi@gmail.com");
			//click create lead
			driver.findElement(By.name("submitButton")).click();
			System.out.println(driver.getTitle());

		
	}

}

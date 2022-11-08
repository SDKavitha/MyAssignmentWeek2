package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
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
			
				//Click Contact Tab
				driver.findElement(By.linkText("Contacts")).click();
				
				//Click Create Contact
				driver.findElement(By.linkText("Create Contact")).click();
				
				//Enter FirstName
				driver.findElement(By.id("firstNameField")).sendKeys("Kavitha");
				
				//Enter LastName
				driver.findElement(By.id("lastNameField")).sendKeys("D");
				
				//Click Create contact
				driver.findElement(By.name("submitButton")).click();
				System.out.println(driver.getTitle());
				
				String text = driver.findElement(By.id("firstNameField")).getText();
                System.out.println(text);
                
                //closing browser
                driver.close();
		
		
	}

}

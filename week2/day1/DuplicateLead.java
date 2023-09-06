package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("44");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String firstName=driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-firstName')]/a")).getText();
		String lastName=driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-lastName')]/a")).getText();
		System.out.println("Name of the orginal lead"+firstName +lastName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[contains(@class,'x-grid3-cell-first')]/div/a)[1]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String firstNameDup=driver.findElement(By.xpath("//span[text()='First name']/following::input")).getAttribute("value");
		String lastNameDup=driver.findElement(By.xpath("//span[text()='Last name']/following::input")).getAttribute("value");
        System.out.println("Name as on Duplicate Lead: "+firstNameDup + lastNameDup);
        Assert.assertEquals(firstName, firstNameDup, "First name is not correct");
        Assert.assertEquals(lastNameDup,lastName,"Second name is not correct" );
        driver.close();
        
	}

}

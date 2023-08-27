package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeba");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Joseline");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jeb");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Marketing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Text field for testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test3r43@yopmail.com");
		WebElement StateDD =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel= new Select(StateDD);
		sel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test text important note");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
	}

}

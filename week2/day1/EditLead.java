package week2.day2;

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
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		driver.getTitle().compareTo("View Lead | opentaps CRM");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test teXT Leaf Company");
		driver.findElement(By.name("submitButton")).click();
		String newValue=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		boolean bal =newValue.contains("Test teXT Leaf Company");
		System.out.println(bal);
		System.out.println(driver.getTitle());
	}

}

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		String leadId=driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).getText();
		System.out.println(leadId);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[contains(@class,'x-grid3-cell-first')]/div/a)[1]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String noValue=driver.findElement(By.xpath("//div[@class=\"x-paging-info\"]")).getText();
		System.out.println(noValue);
		driver.close();
	}

}

package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Login test");
		driver.findElement(By.name("reg_email__")).sendKeys("test@yopmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Test");
		WebElement dayDD= driver.findElement(By.name("birthday_day"));
		Select selDay= new Select(dayDD);
		selDay.selectByValue("18");
		WebElement monthDD= driver.findElement(By.name("birthday_month"));
		Select selMonth= new Select(monthDD);
		selMonth.selectByVisibleText("Sep");
		WebElement yearDD= driver.findElement(By.name("birthday_year"));
		Select selYear= new Select(yearDD);
		selYear.selectByIndex(23);
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}

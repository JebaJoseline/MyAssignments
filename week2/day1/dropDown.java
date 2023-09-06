package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/select.xhtml");
		WebElement automationTool=driver.findElement(By.xpath("//div[@class='card']/div/div/select"));
		Select autoTool=new Select(automationTool);
		autoTool.selectByVisibleText("Selenium");
		
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[@data-label='Germany']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		Thread.sleep(3000);
		String cityName=driver.findElement(By.xpath("(//ul[@role='listbox'])[2]/li[2]")).getText();
		if(cityName.equals("Berlin"))
			System.out.println("Berlin is a city in Germany");
		driver.findElement(By.xpath("(//ul[@role='listbox'])[2]/li[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Show Options']/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@data-label='Two']")).click();
	}

}

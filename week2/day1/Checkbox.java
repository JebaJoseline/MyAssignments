package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@aria-label='Basic']/following::div")).click();
		
		driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
		boolean checker=driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		if(checker == true)
			System.out.println("Checkbox alert is displayed");
		
		driver.findElement(By.xpath("//label[text()='C-Sharp']/preceding-sibling::div/div[2]")).click();
		
		for(int i=1 ;i<=3;i++) 
		{
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[5]")).click();
		Thread.sleep(2000);
		String alertTristate=driver.findElement(By.xpath("//span[text()='State has been changed.']/following::p")).getText();
		
		if(i==1) {
			Assert.assertEquals(alertTristate, "State = 1");
			System.out.println("State 1 alert caught");
			}
		else if (i==2)	{
			Assert.assertEquals(alertTristate, "State = 2");
			System.out.println("State 2 alert caught");
		}
		else {
			Assert.assertEquals(alertTristate, "State = 0");
			System.out.println("State 0 alert caught");
		}
		
		}
 
		driver.findElement(By.xpath("(//h5[text()='Toggle Switch']/following::div)[1]")).click();
		
		boolean disCheckbox=driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox')])[3]")).isEnabled();
        Assert.assertEquals(disCheckbox,false);//not sure why I am getting True here
        
        driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//label[text()='Paris'])[2]/preceding-sibling::div")).click();
        driver.findElement(By.xpath("(//label[text()='Berlin'])[2]/preceding-sibling::div")).click();
        
	}

}

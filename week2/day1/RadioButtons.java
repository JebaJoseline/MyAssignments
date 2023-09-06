package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//label[text()='Chrome']/preceding-sibling::div/div[2]")).click();
		
		driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding-sibling::div/div[2]/span")).click();
		
		for(int i =1 ; i<=4; i++) {
			WebElement checkbox1= driver.findElement(By.xpath("(//input[contains(@id,'j_idt87:console2')])["+i+"]"));
			Thread.sleep(3000);
			boolean checkingBox= checkbox1.isSelected();
			if(checkingBox == true)
			{
				String browserName=driver.findElement(By.xpath("//input[contains(@id,'j_idt87:console2')]/following::label["+i+"]")).getText();
				System.out.println("The default value is :"+browserName);
				break;
			}
		}
		
        int adding=0;
		for(int i =1 ; i<=3; i++) {
			WebElement checkBox2=driver.findElement(By.xpath("(//input[contains(@id,'j_idt87:age:')])["+i+"]"));
			Thread.sleep(3000);
			boolean checkingBox1=checkBox2.isSelected();
			if(checkingBox1 == true)
			{
				String normVal=driver.findElement(By.xpath("(//input[contains(@id,'j_idt87:age:')])["+i+"]")).getAttribute("value");
				System.out.println(normVal+":is the value already selected");
				break;
			}
			else
				adding++;
				
		}
		if(adding ==3)
			driver.findElement(By.xpath("//input[contains(@id,'j_idt87:age:')][2]"));
		
	}

}

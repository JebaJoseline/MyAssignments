package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.leafground.com/input.xhtml");
      driver.manage().window().maximize();
      
      driver.findElement(By.xpath("//h5[text()='Type your name']/following::div/input")).sendKeys("Jeba Joseline");
      
      String cityAdd=driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::div/input")).getAttribute("value");
      String countryAdd= "India"+cityAdd;
      driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::div/input")).clear();
      driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::div/input")).sendKeys(countryAdd);
      
      boolean textBox=driver.findElement(By.xpath("//h5[text()='Verify if text box is disabled']/following::div/input")).isEnabled();
      if(textBox==false)
    	  System.out.println("Textbox is disabled");
      
      driver.findElement(By.xpath("//h5[text()='Clear the typed text.']/following::div/input")).clear();
      
      String typedText=driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::div/input")).getAttribute("value");
      driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::div/input")).clear();
      driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::div/input")).sendKeys(typedText);
      
      driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("test563@yopmail.com \t");
      driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("I am interested to learn Java and Selenium");
      driver.findElement(By.xpath("//button[@class='ql-italic']")).click();
      
      driver.findElement(By.xpath("//h5[contains(text(),'Just Press Enter')]/following::div/div/input")).sendKeys(Keys.ENTER);
      String errorMessage=driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
      if(errorMessage.equals("Age is mandatory"))
    	  System.out.println("Error message was displayed: "+errorMessage);
      
      Point actualLocation=driver.findElement(By.xpath("//h5[contains(text(),'Confirm Label')]/following::input")).getLocation();
      int x=actualLocation.getX();
      int y=actualLocation.getY();
      driver.findElement(By.xpath("//h5[contains(text(),'Confirm Label')]/following::input")).click();
      Point expectedLocation=driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
      int ax=expectedLocation.getX();
      int ay=expectedLocation.getY();
      driver.findElement(By.xpath("//h5[contains(text(),'Click and Confirm Keyboard appears')]/following-sibling::input")).click();
      if(x==ax && y==ay)
    	  System.out.println("Username has not moved");
      else
    	  System.out.println("Username has moved");
      
      driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Jeba");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.findElement(By.xpath("(//li[@role='option'])[3]")).click();
      
      driver.findElement(By.xpath("//h5[contains(text(),'Confirm Keyboard appears')]/following::input")).click();
      boolean keypadPopup = driver.findElement(By.xpath("//div[contains(@class,'keypad-popup')]")).isDisplayed();
      if(keypadPopup==true)
    	  System.out.println("Keypad is displayed");
      else
    	  System.out.println("Keypad is not displayed");
      
      driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("This is the end of toolbar");
      driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
      
      //Buttons
      driver.get("https://www.leafground.com/button.xhtml");
      
      driver.findElement(By.xpath("//span[text()='Click']")).click();
      String title1=driver.getTitle();
      if(title1 == "Dashboard")
    	  System.out.println("Dashboard page is displayed ");
      driver.navigate().back();
     
      boolean button1=driver.findElement(By.xpath("//h5[contains(text(),'Confirm if the button')]/parent::div")).isEnabled();
      if(button1 == false)
    	  System.out.println("Button is disabled");
      
      Point locButton=driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
      int locX=locButton.getX();
      int locY=locButton.getY();
      System.out.println("[Printing the location of the Submit button: x="+locX+ " Y="+locY);
      
	}

}

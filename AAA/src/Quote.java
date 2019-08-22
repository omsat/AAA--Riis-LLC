import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Quote {

	public static void main(String[] arg )
	{
	WebDriver driver;
		
	System.setProperty("webdriver.gecko.driver", "C:\\Web Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.aaalife.com/term-life-insurance-quote-input");
		 driver.manage().window().maximize();
		 String title=driver.getTitle();
		 if(title.equalsIgnoreCase("AAA"));
			System.out.println("matches");
			
			WebElement Login = driver.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div/a[2]"));
			Login.click();
			String myWindowHandle = driver.getWindowHandle();
			driver.switchTo().window(myWindowHandle);
			
			WebElement  SignUp = driver.findElement(By.xpath("/html/body/form/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div[4]/p[2]/a"));
			SignUp.click();
			
			WebElement Home = driver.findElement(By.xpath("/html/body/form/div/div/div/div[2]/div[1]/a"));
			 Home.click();
		  
			 WebElement Zipcode = driver.findElement(By.xpath("//*[@id=\"zip\"]"));
			Zipcode.click();
			
		    Zipcode.sendKeys("48084");
		
		 driver.findElement(By.id("gender")).sendKeys("Male");
		
		 driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		  driver.findElement(By.id("Month")).sendKeys("April");
	      driver.findElement(By.xpath("//*[@id=\"month\"]")).click();

	
	      driver.findElement(By.id("day")).sendKeys("1");
	 
	      driver.findElement(By.xpath("//*[@id=\"day\"]")).click();
	
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 
	      driver.findElement(By.id("Year")).sendKeys("1999");
	 
	      driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
	 
	      driver.findElement(By.id("IsMemberNo")).sendKeys("Yes");
	 
	      driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/div/div/div[2]/div/div/div/section[1]/div/div[1]/form/div/div[1]/div[3]/fieldset/div/label[1]/span")).click();
	
	 
	      driver.findElement(By.id("Contact_email")).sendKeys("mnj@test.com");
	      
	      driver.get("mnj@test.com");
	      
	      driver.close();
	  
	   
	  


	  
	}
	
	
	
	
	
	}



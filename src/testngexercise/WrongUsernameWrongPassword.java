package testngexercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class WrongUsernameWrongPassword {
	public String baseUrl = "https://www.joindota.com/en/start";
    String driverPath = "E:\\test drivers\\chrome\\chromedriver.exe";
    public WebDriver driver ;
	
	
	
	@BeforeTest
    public void openUrl() {
    
    	System.setProperty("webdriver.chrome.driver", driverPath);
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("ucp-name")).click();
        
        
        
	}
  
	
	
	
	@Test
  public void correctUsername() {
		
		driver.findElement(By.id("gsnet-popin-login-user")).sendKeys("qqweqwe");
		driver.findElement(By.id("gsnet-popin-login-pass")).sendKeys("qqweqwe");
		driver.findElement(By.id("gsnet-popin-login-login")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebElement wronguserandpass = driver.findElement(By.className("type-err"));
	      String text = wronguserandpass.getText();
	      System.out.println("Actual text: "+text);
	      if(text.equals("Wrong username or password! Forgot your password?")) {
	      
	    	  System.out.println("Text present");
	      
	      }else
	      {
	      throw new SkipException("Text not present");
	      }
	}
	      
	      @AfterTest public void closeDriver() {
				
				driver.close();
	
  }
}

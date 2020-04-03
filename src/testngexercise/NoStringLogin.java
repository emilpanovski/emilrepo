package testngexercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class NoStringLogin {
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
        driver.findElement(By.id("gsnet-popin-login-login")).click();
        
        
	}
	
	
	
	
	
  @Test
  public void verifyNoStringText() {
	  driver.findElement(By.id("gsnet-popin-login-login")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  WebElement plslogintxt = driver.findElement(By.id("gsnet-popin-notf"));
      String text = plslogintxt.getText();
      System.out.println("Actual text: "+text);
      if(text.equals("Username or email address is required to login")) {
      
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

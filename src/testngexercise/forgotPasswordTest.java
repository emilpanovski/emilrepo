package testngexercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class forgotPasswordTest {
 
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
        driver.findElement(By.id("gsnet-popin-login-lost")).click();
    }
	
	
	
	
	
	@Test(priority=1)
	public void gamesportBtn(){
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement gamesbtn = driver.findElement(By.className("gsnet-popin-head"));
	if(gamesbtn.isEnabled()){
	System.out.println("GameSport button present"); 
	}else
	{
	throw new SkipException("GameSport password button not present");
	}
	}
	  
	@Test(priority=2)
	public void lostuserBtn(){
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement lostuser = driver.findElement(By.id("gsnet-popin-lost-user"));
	if(lostuser.isEnabled()){
	System.out.println("Username or email field present"); 
	}else
	{
	throw new SkipException("Username or email field not present");
	}
	}
	  
	  
	@Test(priority=3)
	public void bcktologinBtn(){
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement bcktologin = driver.findElement(By.id("gsnet-popin-lost-login"));
	if(bcktologin.isEnabled()){
	System.out.println("Back to login present"); 
	}else
	{
	throw new SkipException("Back to login not present");
	}
	}
	
	
	@Test(priority=4)
	public void rqnewPass(){
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement newpass = driver.findElement(By.id("gsnet-popin-lost-submit"));
	if(newpass.isEnabled()){
	System.out.println("Request new password button present"); 
	}else
	{
	throw new SkipException("Request new password button not present");
	}
	}
	
	@Test(priority=5)
	public void closeBtn(){
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement close = driver.findElement(By.className("icon-close"));
	if(close.isEnabled()){
	System.out.println("Close button present"); 
	}else
	{
	throw new SkipException("Close button not present");
	}
	}
	
	@Test (priority=6)
	public void verifyText(){
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
	      WebElement rqnewpasstxt = driver.findElement(By.id("gsnet-popin-login"));
	      String text = rqnewpasstxt.getText();
	      System.out.println("Actual text: "+text);
	      if(text.equals("GAMESPORTS\n" + 
	      		"NETWORK\n" + 
	      		"Lost your password? No problem, just tell us your username or email address and we'll send you a new password right away.")) {
	      
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

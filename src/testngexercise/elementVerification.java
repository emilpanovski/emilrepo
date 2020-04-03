package testngexercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class elementVerification {
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
        
    
    }
  @Test(priority=1)
  public void verifyHomepageTitle() {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       
      
      String expectedTitle = "Start « joinDOTA.com";
      String actualTitle = driver.getTitle();
      
      if(actualTitle.equals(expectedTitle)) {
      
    	  System.out.println("login page exists");
      
      }else
      {
      throw new SkipException("login page does not exist");
      }
      
      
      
      
  
      
      
  }
  
  
  
  @Test (priority=2)
  public void findElementlogin(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  WebElement loginForm = driver.findElement(By.id("ucp-name"));
  if(loginForm.isEnabled()){
  System.out.println("Login form present"); 
  }else
  {
  throw new SkipException("Login form not present");
  }
  }
  
  @Test (priority=3)
  public void clickLogin() {
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  WebElement a = driver.findElement(By.id("ucp-name"));
	  a.click();
  	  
      
  
  
  
  
  
  
  
  
  
 
  }
  
  @Test (priority=4)
  public void findElementEmail(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  WebElement emailField = driver.findElement(By.id("gsnet-popin-login-user"));
  if(emailField.isEnabled()){
  System.out.println("Email Field present"); 
  }else
  {
  throw new SkipException("Email Field not present");
  }
 
  }

  @Test (priority=5)
  public void findElementPass(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  WebElement passField = driver.findElement(By.id("gsnet-popin-login-pass"));
  if(passField.isEnabled()){
  System.out.println("Password Field present"); 
  }else
  {
  throw new SkipException("Password Field not present");
  }
 
  
  
  
  
  }
  @Test (priority=6)
  public void findElementfb(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  WebElement fbField = driver.findElement(By.id("gsnet-popin-signup-oauth-fb"));
  if(fbField.isEnabled()){
  System.out.println("Facebook button present"); 
  }else
  {
  throw new SkipException("Facebook button not present");
  }
  
  
  
  }

@Test (priority=7)
public void findElementtw(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement twField = driver.findElement(By.id("gsnet-popin-signup-oauth-tw"));
if(twField.isEnabled()){
System.out.println("Tweeter button present"); 
}else
{
throw new SkipException("Tweeter button not present");
}



}
  

@Test (priority=8)
public void findElementtwch(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement twchField = driver.findElement(By.id("gsnet-popin-signup-oauth-twitch"));
if(twchField.isEnabled()){
System.out.println("Twitch button present"); 
}else
{
throw new SkipException("Twitch button not present");
}



}
  
  

@Test (priority=9)
public void findElementggl(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement gglField = driver.findElement(By.id("gsnet-popin-signup-oauth-google"));
if(gglField.isEnabled()){
System.out.println("Google button present"); 
}else
{
throw new SkipException("Google button not present");
}



} 







@Test (priority=10)
public void frgPassFormBtn(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement frgpassbtn = driver.findElement(By.id("gsnet-popin-login-lost"));
if(frgpassbtn.isEnabled()){
System.out.println("Forgot password button present"); 
}else
{
throw new SkipException("Forgot password button not present");
}

}





@Test (priority=11)
public void loginBtn(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement loginbtn = driver.findElement(By.id("gsnet-popin-login-login"));
if(loginbtn.isEnabled()){
System.out.println("Login button present"); 
}else
{
throw new SkipException("Login password button not present");
}

}




@Test (priority=12)
public void signupBtn(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement signupbtn = driver.findElement(By.id("gsnet-popin-login-signup"));
if(signupbtn.isEnabled()){
System.out.println("Signup button present"); 
}else
{
throw new SkipException("Signup password button not present");
}

}


@Test (priority=13)
public void closeBtn(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement closebtn = driver.findElement(By.id("gsnet-popin-close"));
if(closebtn.isEnabled()){
System.out.println("Close button present"); 
}else
{
throw new SkipException("Close password button not present");
}

}








@Test (priority=14)
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

@Test (priority=14)
public void verifyText(){
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
      WebElement plslogintxt = driver.findElement(By.id("gsnet-popin-login"));
      String text = plslogintxt.getText();
      System.out.println("Actual text: "+text);
      if(text.equals("GAMESPORTS\n" + 
      		"NETWORK\n" + 
      		"Please login with your GameSports Network account or with a social platform.\n" + 
      		"Don't have an account yet? Sign up")) {
      
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

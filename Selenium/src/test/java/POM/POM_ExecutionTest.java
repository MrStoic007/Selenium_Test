package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class POM_ExecutionTest {
	
	WebDriver driver;
	
  @BeforeClass
  public void envset() {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize() ;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
  }
  
  @Test
  public void test() throws InterruptedException {
	  
	  POMClass pom = new POMClass(driver);
	  pom.setcredential("Admin", "admin123");
	  Thread.sleep(3000);
	  
	  Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	  
	  
  }
 @AfterClass 
public void end() {
	 driver.quit();
	  
  }
}

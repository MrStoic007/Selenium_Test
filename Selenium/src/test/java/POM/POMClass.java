package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMClass // should contain a constructor, locators and action methods.

{

	WebDriver driver;
	
	
    //constructor
	POMClass(WebDriver driver) {
		this.driver = driver;
	}
	
	//locators
	By username = By.xpath("//input[@placeholder='Username']");
	By pwd = By.xpath("//input[@placeholder='Password']");
	By button = By.xpath("//button[@type='submit']");
	
	
	//Action methods
	public void setcredential(String user, String pass) {
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(pwd).sendKeys(pass);
		driver.findElement(button).click();
		
	}
	
}

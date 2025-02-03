package seleniumwebdriver_sdet_qa;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetText_GetAttribute {

	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		String text =driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']")).getText();
		System.out.println(text);
		String text2 =driver.findElement(By.xpath("//input[@placeholder='Username']")).getAttribute("placeholder");
		System.out.println(text2);

	}

}

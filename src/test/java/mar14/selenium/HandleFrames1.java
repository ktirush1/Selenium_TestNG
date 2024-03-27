package mar14.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * driver.switchTo().frame(name/id);
 * driver.switchTo().frame(WebElement);
 * driver.switchTo().frame(index);
 * driver.switchTo().defaultContent();
 */
public class HandleFrames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://www.naukri.com/");
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tirusha");
		//driver.switchTo().defaultContent();
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();//switch back to page
		driver.switchTo().frame("frame2");
		WebElement web = driver.findElement(By.xpath("//select[@id='animals']"));
		Select se = new Select(web);
		se.selectByVisibleText("Baby Cat");
	}

}

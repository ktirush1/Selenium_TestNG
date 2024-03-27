package mar14.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * conditional commands - access these commands through WebElement
 * return true/false
 * isDispalyed()
 * isEnabled()
 * isSelected()
 */
public class ConditionalCommandsmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.naukri.com/");
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.manage().window().maximize();
		
		/*WebElement element = driver.findElement(By.xpath("//a[@class='nI-gNb-header__logo nI-gNb-company-logo']//img[@alt='Naukri Logo']"));
		Boolean bool = element.isDisplayed();
		System.out.println(bool);
		WebElement element1 = driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']"));
		Boolean bool1 = element1.isEnabled();
		System.out.println(bool1);*/
		WebElement element1 = driver.findElement(By.xpath("//i[contains(@class,'ico resman-icon')]"));
		Boolean bool1 = element1.isSelected();
		System.out.println(bool1);
		
		if(bool1.equals(false)){
			
			element1.click();
			Thread.sleep(5000);
			Boolean bool2 = element1.isEnabled();
			System.out.println(bool2);
			element1.click();
			
		}
		}

}

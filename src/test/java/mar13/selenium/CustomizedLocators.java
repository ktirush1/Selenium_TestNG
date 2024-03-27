package mar13.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Css Selector,XPath
/*Css Selector->Cascading style sheet
 * CSSSelector-Tag & Attribute
 * 
 */


public class CustomizedLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		//Css Selector tag & class-sometimes tag is optional - .
		/*WebElement ele = driver.findElement(By.cssSelector("span.nI-gNb-sb__placeholder"));
		ele.click();
		WebElement ele1 = driver.findElement(By.cssSelector(".suggestor-input "));
		ele1.sendKeys("Selenium with java");
		//Css Selector tag & id-#
		WebElement ele2 = driver.findElement(By.cssSelector("input#usernameField"));
		
		ele2.sendKeys("1");
		ele2.clear();
		//tag & attribute []
		//driver.findElement(By.cssSelector("input[placeholder='Enter Email ID / Username']")).sendKeys("tirusha");
		*/
		//tag,class & attribute- .[] ->tag is optional
		driver.findElement(By.cssSelector(".nI-gNb-lg-rg__register[id='register_Layer']")).click();
		
	}

}

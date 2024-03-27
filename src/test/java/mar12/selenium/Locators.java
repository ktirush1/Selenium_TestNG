package mar12.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//ID,Name,LinkText,Partial Link Text,Tag Name,Class Name,
//Customized locators-Css Selector,XPATH,
//findElement - return single WebElement
//findElements - return multiple webelements with return type of list of webelements
public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty(null, null);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/home");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		//id
		WebElement txtUsername = driver.findElement(By.id("session_key"));
		txtUsername.clear();
		//Linktext
		//driver.findElement(By.linkText("New to LinkedIn? Join now")).click();
		//Partial LinkText
		//driver.findElement(By.partialLinkText("New to LinkedIn?")).click();
		//findElements
		List<WebElement> listofImages = driver.findElements(By.tagName("img"));
		System.out.println(listofImages.size());
		//find no.of links
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
	}

}

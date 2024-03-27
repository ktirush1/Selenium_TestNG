package mar14.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * get methods - we can use these methods through webdriver instance
 * ->
 * conditional methods 
 * navigational methods
 * browser methods
 * wait methods
 * 
 * 
 */

public class WebDrivermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get methods
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String str = driver.getTitle();
		System.out.println(str);
		String str1 = driver.getCurrentUrl();
		System.out.println(str1);
		//String str2 = driver.getPageSource();
		//System.out.println(str2);
		String str3 = driver.getWindowHandle(); //it will generate dynamic id - returns string
		System.out.println(str3);
		driver.findElement(By.xpath("//span[@title='Remote']")).click();
		Set<String> str4 = driver.getWindowHandles(); //it will generate multiple dynamic ids - returns set of array
		for(String str5:str4) {
			System.out.println("id:"+str5);
		}
	}

}

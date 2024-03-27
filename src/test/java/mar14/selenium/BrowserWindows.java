package mar14.selenium;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//driver.switchTo().window(window id)

public class BrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/places/");
		driver.manage().window().maximize();
		//String str = driver.getTitle();
		driver.findElement(By.xpath("//span[contains(text(),'Create New Account')]")).click();
		Set<String> windowids = driver.getWindowHandles(); //it will generate multiple dynamic ids - returns set of array
		System.out.println(windowids);
		/*List<String>windowslist = new ArrayList(windowids); //converted set to list collection
		String parentid = windowslist.get(0);
		String childid = windowslist.get(1);
		//switch to child window
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//div[normalize-space()='Jobs']")).click();
		driver.quit();*/
		//closing specific browser windows
		for(String windowid:windowids) {
			driver.switchTo().window(windowid);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equalsIgnoreCase("Sign up for Facebook | Facebook")) {
				//| title.equalsIgnoreCase("Discover great places in every city | Facebook")
				driver.close();
			
			}
			
			
		}
		
		//driver.switchTo.alert()
		//driver.switchTo.frame()
		//driver.switchTo.window()
		
		
		}
		
	}



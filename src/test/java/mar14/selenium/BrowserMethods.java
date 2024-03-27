package mar14.selenium;

import org.openqa.selenium.By;
//close(),quit()
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@title='Remote']")).click();
		Thread.sleep(3000);
		//driver.close(); //single browser window
		driver.quit();//all browser windows
		}

}

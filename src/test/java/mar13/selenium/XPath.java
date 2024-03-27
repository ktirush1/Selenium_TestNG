package mar13.selenium;
//Absolute Xpath(full xpath) - /html/body/div[1]/div[7]/div/div/div[1]/div/div/div/div[1]/div/input-it will start from root node
//Dynamic Xpath(partial xpath) - //*[@id="root"]/div[7]/div/input - it will directly start from node itself
//writing xpath syntax- //tagname[@attribute='value'] or //*[@attribute='value']

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='qsbSubmit']")).click();
	}

}

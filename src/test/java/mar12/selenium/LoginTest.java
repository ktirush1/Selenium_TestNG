package mar12.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty(null, null);
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/home");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("session_key"));
		txtUsername.clear();
		txtUsername.sendKeys("tirushachw@gmail.com");
		driver.findElement(By.id("session_password")).clear();
		driver.findElement(By.id("session_password")).sendKeys("MST@4464");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
		String snews1 = null;
		try {
			WebElement snews = driver.findElement(By.xpath("//*[@id=\"news-module__title\"]/span"));
			 snews1 = snews.getText();
		}
		catch(Exception e) {
			snews1 = "";
		}
		
		System.out.println(snews1);
		//String sTitle = driver.getTitle();
		//System.out.println(sTitle);
		String sTitlePage = "LinkedIn News";
		if (sTitlePage.equals(snews1)) {
			System.out.println("News vefied");
			
		} else {
			System.out.println("News not vefied");
		}
		
		
	}

}

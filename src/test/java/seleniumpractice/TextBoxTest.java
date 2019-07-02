package seleniumpractice;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest {
	WebDriver driver = new ChromeDriver();
	

	@BeforeMethod
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Practice\\practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.3.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		 TextBoxPage tbp = new TextBoxPage(driver);
	}
	
	@Test
	public void locationcheckofUNtxtbox(HashMap<String, Integer> locationoftxt) {
		while(locationoftxt.entrySet().iterator().hasNext()) {
		System.out.println(locationoftxt.get("x"));
		System.out.println(locationoftxt.get("y"));
		
		}
		
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}

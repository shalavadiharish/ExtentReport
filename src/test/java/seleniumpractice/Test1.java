package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Practice\\practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.3.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		 TextBoxPage tbp = new TextBoxPage(driver);
	}

}

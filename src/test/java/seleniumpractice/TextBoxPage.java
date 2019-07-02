package seleniumpractice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
	
	Map<String,Integer> locationoftxt = new HashMap<String,Integer>();
	
	@FindBy(id="txtUsername")
	private WebElement UNtextbox;
	
	@FindBy(id="txtPassword")
	private WebElement pwdtextbox;
	
	@FindBy(id="btnLogin")
	private WebElement loginbtn;
	
	public Map<String,Integer> getlocationofusertextbox(){
		int x=UNtextbox.getLocation().getX();
		int y=UNtextbox.getLocation().getY();
		locationoftxt.put("x", x);
		locationoftxt.put("y", y);
		return locationoftxt;
			}
	public TextBoxPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

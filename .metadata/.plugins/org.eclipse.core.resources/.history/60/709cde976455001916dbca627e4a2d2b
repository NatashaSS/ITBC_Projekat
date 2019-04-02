package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationForm {

	private static final String REGISTER="//input[@id='blue_btn']";
//	private static final String  = "";
	private static final String FIRSTNAME = "//input[@name='firstname']";
	private static final String LASTNAME= "//input[@name='lastname']";
	private static final String USERNAME = "//form[@action='processregister.php']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String PASSWORD = "//form[@action='processregister.php']//input[@name='password']";

	
	
	
	
	public static WebElement getRegisterLink(WebDriver dr) {
		WebElement wb=dr.findElement(By.xpath(REGISTER));
		return wb;
	}
	
	public static void clickRegisterLink(WebDriver dr) {
		getRegisterLink(dr).click();
	}
}

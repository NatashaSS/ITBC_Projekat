package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm {

	private static final String LOGIN="//input[@value='Log in']";



	
//	metoda koja preuzima i cuva login link xpath
	public static WebElement getLoginLink(WebDriver dr) {
		WebElement wb=dr.findElement(By.xpath(LOGIN));
		return wb;
	}
	
//	metoda koja izvrsava klik na login element, uz pomoc prethodno pronadjenog xpath-a
	public static void clickLoginLink(WebDriver dr) {
		getLoginLink(dr).click();
	}
	
}

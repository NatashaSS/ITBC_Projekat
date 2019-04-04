package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm {


	private static final String USERNAME = "//input[@placeholder='username']";
	private static final String PASSWORD = "//input[@placeholder='password']";
	private static final String LOGIN = "//input[@value='Log in']";
	

// 	Username
	public static WebElement getUsername(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(USERNAME));
		return wb;
	}

	public static void clickUsername(WebDriver dr) {
		getUsername(dr).click();
	}

	public static void sendKeysUsername(WebDriver dr, String str) {
		getUsername(dr).sendKeys(str);
	}

// 	Password
	public static WebElement getPassword(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(PASSWORD));
		return wb;
	}

	public static void clickPassword(WebDriver dr) {
		getPassword(dr).click();
	}

	public static void sendKeysPassword(WebDriver dr, String str) {
		getPassword(dr).sendKeys(str);
	}

//	metoda koja preuzima i cuva login link xpath
	public static WebElement getLoginLink(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOGIN));
		return wb;
	}

//	metoda koja izvrsava klik na login element, uz pomoc prethodno pronadjenog xpath-a
	public static void clickLoginLink(WebDriver dr) {
		getLoginLink(dr).click();
	}
}

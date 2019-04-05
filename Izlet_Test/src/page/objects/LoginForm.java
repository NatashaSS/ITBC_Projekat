package page.objects;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class LoginForm {


	private static final String USERNAME = "//input[@placeholder='username']";
	private static final String PASSWORD = "//input[@placeholder='password']";
	private static final String LOGIN = "//input[@value='Log in']";
	public static final String NEWPOST = "//*[@id=\"newPostBtn\"]/a";
	public static final String NAZIV = "//input[@placeholder='Naziv']";
	public static final String LOKACIJA = "//input[@placeholder='Lokacija']";
	public static final String TRANSPORT = "//select[@name='transport']";
	public static final String OPIS = "//textarea[@placeholder='Opis']";
	public static final String POSTDASH = "//input[@value='Post']";
	public static final String POSTEDIT="//div[@class='popupEdit']//input[@value='Post']";
	public static final String LOGOUT = "//a[contains(text(),'Logout')]";
	public static final String OPTIONS="//i[@class='fas fa-ellipsis-v']";
	public static final String DELETE="//i[@class='fas fa-trash-alt']";
	public static final String EDIT="//i[@class='fas fa-edit']"; 


	
// Setting up Login Form
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
	
//	Setting up Dashboard interaction
//	Post option
	public static WebElement getPost(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(NEWPOST));
		return wb;
	}

	public static void clickPost(WebDriver dr) {
		getPost(dr).click();
	}
// Excursion site name
	public static WebElement getNaziv(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(NAZIV));
		return wb;
	}

	public static void clickNaziv(WebDriver dr) {
		getNaziv(dr).click();
	}

	public static void sendKeysNaziv(WebDriver dr, String str) {
		getNaziv(dr).sendKeys(str);
	}
	 
// Excursion site location
	public static WebElement getLokacija(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOKACIJA));
		return wb;
	}

	public static void clickLokacija(WebDriver dr) {
		getLokacija(dr).click();
	}

	public static void sendKeysLokacija(WebDriver dr, String str) {
		getLokacija(dr).sendKeys(str);
	}
	
//	Transportation options
	public static WebElement getTransport(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(TRANSPORT));
	 return wb; }
	
	 public static void selectTransport(WebDriver dr, String transport) {
	 		Select sel= new Select(getTransport(dr));
			sel.selectByVisibleText(transport);
	}
//	Description text area
	
	public static WebElement getOpis(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(OPIS));
		return wb;
	}

	public static void clickOpis(WebDriver dr) {
		getOpis(dr).click();
	}

	public static void sendKeysOpis(WebDriver dr, String str) {
		getOpis(dr).sendKeys(str);
		
	}
//	Clicking on a post button
	public static WebElement getPostDash(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(POSTDASH));
		return wb;
	}

	public static void clickPostDash(WebDriver dr) {
		getPostDash(dr).click();
	}

//	Clicking on a options button
	public static WebElement getOptions(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(OPTIONS));
		return wb;
	}

	public static void clickOption(WebDriver dr) {
		getOptions(dr).click();
	}
	
//	Clicking on a Delete button
	public static WebElement getDelete(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(DELETE));
		return wb;
	}

	public static void clickDelete(WebDriver dr) {
		getDelete(dr).click();
	}
	
//	Clicking on a Edit button
	public static WebElement getEdit(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(EDIT));
		return wb;
	}

	public static void clickEdit(WebDriver dr) {
		getEdit(dr).click();
	}
//	Clicking on a PostEdit button
	public static WebElement getPostEdit(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(POSTEDIT));
		return wb;
	}

	public static void clickPostEdit(WebDriver dr) {
		getPostEdit(dr).click();
	}
	
//	Log out 
	public static WebElement getLogoutLink(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(LOGOUT));
		return wb;
	}

	public static void clickLogoutLink(WebDriver dr) {
		getLogoutLink(dr).click();
	}
	


}

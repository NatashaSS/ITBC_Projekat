package page.objects;

import org.openqa.selenium.*;

public class Homepage {
	public static final String PAGE_URL = "http://localhost/izlet/index.php";
	public static final String GALLERY = "//nav[@class='main-nav']//a[@class='a_bold'][contains(text(),'Galerija')]";

// Homepage 
	public static void openPage(WebDriver dr) {
		dr.get(PAGE_URL);
	}

	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(PAGE_URL);
	}

//		 Gallery link methods
	public static WebElement getGalleryLink(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(GALLERY));
		return wb;
	}

	public static void clickGalleryLink(WebDriver dr) {
		getGalleryLink(dr).click();
	}

}

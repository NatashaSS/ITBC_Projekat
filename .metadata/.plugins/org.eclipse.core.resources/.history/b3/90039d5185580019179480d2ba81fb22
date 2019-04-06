package page.objects;
import org.openqa.selenium.*;

public class Homepage {
			public static final String PAGE_URL="http://localhost/izlet/index.php";
		public static final String GALLERY="//nav[@class='main-nav']//a[@class='a_bold'][contains(text(),'Galerija')]";
		
//		metoda koja preuzima i cuva Gallery link xpath
		public static WebElement getGalleryLink(WebDriver dr) {
			WebElement wb=dr.findElement(By.xpath(GALLERY));
			return wb;
		}
		
//		metoda koja izvrsava klik na Gallery button element, uz pomoc prethodno pronadjenog xpath-a
		public static void clickGalleryLink(WebDriver dr) {
			getGalleryLink(dr).click();
		}
		
	
	
		
// otvara homepage
		public static void openPage(WebDriver dr) {
			dr.get(PAGE_URL);
		}
		
//		reloaduje stranicu?
		public static void navigateTo(WebDriver dr) {
			dr.navigate().to(PAGE_URL);
		}
	}


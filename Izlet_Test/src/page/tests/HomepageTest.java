package page.tests;

import org.openqa.selenium.WebDriver;

import page.objects.Homepage;
import page.objects.RegistrationForm;

public class HomepageTest {

	public static void goToHomepage(WebDriver dr) {
		Homepage.navigateTo(dr);
		if (dr.getCurrentUrl().contains(Homepage.PAGE_URL)) {
			System.out.println("Homepage url je u redu");
		}

	}
}

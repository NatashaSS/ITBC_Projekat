package start;
import org.openqa.selenium.chrome.ChromeDriver;
import page.objects.Homepage;
import page.tests.HomepageTest;
import page.objects.RegistrationForm;
import page.tests.RegistrationFormTest;
import page.objects.LoginForm;
import page.tests.LoginFormTest;

import java.util.Scanner;

import org.openqa.selenium.*;

public class MainAutomation {
	
	public static void main(String[] args) {



	WebDriver driver = new ChromeDriver();
//	testing Registration functionality
//	testing with manual input of data
try{ Homepage.openPage(driver);

	
	RegistrationFormTest.manfillRegForm(driver);
	}catch(Exception ex) {
		ex.printStackTrace();
	}
// testing with automated input of data
	try{ Homepage.openPage(driver);

	
	RegistrationFormTest.testWithAllUsers(driver);
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	
	
//	Testing of login functionality
//	testing with manual input of data
try{ Homepage.openPage(driver);

	
	LoginFormTest.manfillLogForm(driver);
	}catch(Exception ex) {
		ex.printStackTrace();
	}
// testing with automated input of data
	try{
		Homepage.openPage(driver);

	
	LoginFormTest.testWithAllUsers(driver);
	}catch(Exception ex1) {
		ex1.printStackTrace();
	}
// zatvori web driver
	
	
}
}


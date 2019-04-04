package page.tests;

import java.util.Scanner;

import org.openqa.selenium.*;

import page.objects.Homepage;
import page.objects.LoginForm;
import page.objects.RegistrationForm;
import utility.Config;
import utility.ExcelUtils;

public class LoginFormTest {

//	Manual testing of login functionality
	public static void manfillLogForm(WebDriver dr) {
		Scanner sc = new Scanner(System.in);
		String data;
		// Username input by user

		LoginForm.clickUsername(dr);
		System.out.println("Enter Username");
		data = sc.nextLine();
		LoginForm.sendKeysUsername(dr, data);
		// Password input by user

		LoginForm.clickPassword(dr);
		System.out.println("Enter Password");
		data = sc.nextLine();
		LoginForm.sendKeysPassword(dr, data);
//		Clicking the login button
		LoginForm.clickLoginLink(dr);
	}

//		Dashboard testing with manual input data
//	clicking on a post button (for making a new post)
	public static void manfillDashForm(WebDriver dr) {

		Scanner sc = new Scanner(System.in);
		String data;
		LoginForm.clickPost(dr);

//		Setting up Excursion site name	
		LoginForm.clickNaziv(dr);
		System.out.println("Enter Excursuion site name");
		data = sc.nextLine();
		LoginForm.sendKeysNaziv(dr, data);
//			Setting up Excursion location	
		LoginForm.clickLokacija(dr);
		System.out.println("Enter Excursuion location");
		data = sc.nextLine();
		LoginForm.sendKeysLokacija(dr, data);
//				Choosing transportation option
		// Select Transport

//				Entering Description
		LoginForm.clickOpis(dr);
		System.out.println("Enter Excursuion desription");
		data = sc.nextLine();
		LoginForm.sendKeysOpis(dr, data);

//				Clicking on post button
		LoginForm.getPostDash(dr).click();
	}

//	deleting post?		^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^	

	public static void fillDashboardForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Config.PATH + Config.FILE, Config.sheetName2);

//	clicking on a post button (for making a new post)
		LoginForm.clickPost(dr);

//					Excursion site name from Excel table
		LoginForm.clickNaziv(dr);
		data = ExcelUtils.getCellData(i, 1);
		LoginForm.sendKeysNaziv(dr, data);

//					Excursion site location from Excel table

		LoginForm.clickLokacija(dr);
		data = ExcelUtils.getCellData(i, 2);
		LoginForm.sendKeysNaziv(dr, data);

//		Choosing transportation option
//		 Select Transport

		LoginForm.selectTransport(dr, data);
		data = ExcelUtils.getCellData(i, 2);

//		Clicking on a post button

		LoginForm.getPostDash(dr).click();
	}

//				Automated Testing with all available posts from Excel table

	public static void testWithMusltiplePosts(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(Config.PATH + Config.FILE, Config.sheetName2);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillDashboardForm(dr, i);
			Homepage.navigateTo(dr);
		}
	}
//	Testing login with automated input of data from Excel table of users

	public static void fillLoginForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Config.PATH + Config.FILE, Config.sheetName);

// 		Username from Excel table of users

		LoginForm.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		LoginForm.sendKeysUsername(dr, data);

//		Password from Excel table of users
		LoginForm.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		LoginForm.sendKeysPassword(dr, data);

//		Clicking the login button
		LoginForm.clickLoginLink(dr);

//		Clicking the logout button
		LoginForm.clickLogoutLink(dr);

	}
//	Automated Login Testing with all available users from Excel table

	public static void testWithAllUsers(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(Config.PATH + Config.FILE, Config.sheetName);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillLoginForm(dr, i);
			Homepage.navigateTo(dr);

		}
	}

}

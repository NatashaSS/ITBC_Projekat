package page.tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
		String username;
		String password;
		System.out.println("Enter Username");
		username = sc.nextLine();
		System.out.println("Enter password");
		password = sc.nextLine();

		LoginForm.clickUsername(dr);
		LoginForm.sendKeysUsername(dr, username);
		LoginForm.clickPassword(dr);
		LoginForm.sendKeysPassword(dr, password);
//		Clicking the login button
		LoginForm.clickLoginLink(dr);
	}

//		Dashboard testing with manual input data
//	clicking on a post button (for making a new post)
	public static void manfillDashForm(WebDriver dr) throws Exception {
		Scanner sc = new Scanner(System.in);
		String sitename;
		String location;
		String transport;
		String description;

		System.out.println("Enter Excursuion site name");
		sitename = sc.nextLine();
		System.out.println("Enter Excursuion location");
		location = sc.nextLine();
		System.out.println("Enter Excursuion transport (Walk, Car, Motorbike, Bicycle or Bus)");
		transport = sc.nextLine();
		System.out.println("Enter Excursuion desription");
		description = sc.nextLine();
		
		LoginForm.clickPost(dr);
		LoginForm.clickNaziv(dr);
		LoginForm.sendKeysNaziv(dr, sitename);
		LoginForm.clickLokacija(dr);
		LoginForm.sendKeysLokacija(dr,location);
		LoginForm.selectTransport(dr, transport);
		LoginForm.clickOpis(dr);	
		LoginForm.sendKeysOpis(dr, description);
		LoginForm.clickPostDash(dr);
		
	}
	
//	Testing dashboard functionality - Deleting posts
	public static void deletePosts(WebDriver dr) throws Exception {
		for (int i=0; i<2; i++) {
			LoginForm.clickOption(dr);
			LoginForm.clickDelete(dr);
	
		}
	}
//	//	Testing dashboard functionality - Editing Posts
		public static void editPosts(WebDriver dr) throws Exception{

			Scanner sc = new Scanner (System.in);
			System.out.println("Enter description edit text");
			String edit = sc.nextLine();
			
			LoginForm.clickOption(dr);
			LoginForm.clickEdit(dr);
			LoginForm.clickOpis(dr);
			LoginForm.sendKeysOpis(dr, edit);
			LoginForm.clickPostEdit(dr);
		}
	
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
		data = ExcelUtils.getCellData(i, 3);
		
// Writing description text 
		 LoginForm.getOpis(dr);
		 data= ExcelUtils.getCellData(i, 0);
			LoginForm.sendKeysOpis(dr, data);
		 
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

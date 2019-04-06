package page.tests;

import java.util.Scanner;

import org.openqa.selenium.*;

import page.objects.Homepage;
import page.objects.RegistrationForm;
import utility.Config;
import utility.ExcelUtils;

public class RegistrationFormTest {

	public static void fillRegistrationForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Config.PATH + Config.FILE, Config.sheetName);
// First name from Excel table of users

		RegistrationForm.clickFirstName(dr);
		data = ExcelUtils.getCellData(i, 0);
		RegistrationForm.sendKeysFirstName(dr, data);
// Last name from Excel table of users
		RegistrationForm.clickLastName(dr);
		data = ExcelUtils.getCellData(i, 1);
		RegistrationForm.sendKeysLastName(dr, data);
// Username from Excel table of users

		RegistrationForm.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		RegistrationForm.sendKeysUsername(dr, data);

//		Email from Excel table of users
		RegistrationForm.clickEmail(dr);
		data = ExcelUtils.getCellData(i, 3);
		RegistrationForm.sendKeysEmail(dr, data);

//		Password from Excel table of users
		RegistrationForm.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		RegistrationForm.sendKeysPassword(dr, data);

//		Clicking the registration button
		RegistrationForm.clickRegisterLink(dr);

//     Test with all users
	}

	public static void testWithAllUsers(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(Config.PATH + Config.FILE, Config.sheetName);

		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillRegistrationForm(dr, i);
			Homepage.navigateTo(dr);
		}
	}

	public static void manfillRegForm(WebDriver dr) {
		Scanner sc = new Scanner(System.in);
		String username;
		String password;
		String firstname;
		String lastname;
		String email;
		// Datainput by user

		System.out.println("Enter First Name");
		firstname = sc.nextLine();
		System.out.println("Enter Last Name");
		lastname = sc.nextLine();
		System.out.println("Enter Username");
		username = sc.nextLine();
		System.out.println("Enter email");
		email = sc.nextLine();
		System.out.println("Enter password");
		password = sc.nextLine();

		RegistrationForm.clickFirstName(dr);
		RegistrationForm.sendKeysFirstName(dr, firstname);
		RegistrationForm.clickLastName(dr);
		RegistrationForm.sendKeysLastName(dr, lastname);
		RegistrationForm.clickUsername(dr);
		RegistrationForm.sendKeysUsername(dr, username);
		RegistrationForm.clickEmail(dr);
		RegistrationForm.sendKeysEmail(dr, email);
		RegistrationForm.clickPassword(dr);
		RegistrationForm.sendKeysPassword(dr, password);

//				Clicking the registration button
		RegistrationForm.clickRegisterLink(dr);

	}
}

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
		ExcelUtils.
		setExcelFile
		(Config.PATH+Config.FILE,
				Config.sheetName);
		
		for(int i=1;i<ExcelUtils.getWorkSheet().getLastRowNum()+1;i++) {
			fillRegistrationForm(dr,i);
			Homepage.navigateTo(dr);}
		}
		
		public static void manfillRegForm(WebDriver dr) {
			Scanner sc=new Scanner (System.in);
			String data;
		// First name input by user

				RegistrationForm.clickFirstName(dr);
				System.out.println("Enter First Name");
				data = sc.nextLine();
				RegistrationForm.sendKeysFirstName(dr, data);
		// Last name input by user

				RegistrationForm.clickLastName(dr);
				System.out.println("Enter Last Name");
				data = sc.nextLine();
				RegistrationForm.sendKeysLastName(dr, data);
		
			// Username input by user

				RegistrationForm.clickUsername(dr);
				System.out.println("Enter Username");
				data = sc.nextLine();
				RegistrationForm.sendKeysUsername(dr, data);
				
				//Email input by user

				RegistrationForm.clickEmail(dr);
				System.out.println("Enter Email");
				data = sc.nextLine();
				RegistrationForm.sendKeysEmail(dr, data);
				
				// Password input by user

				RegistrationForm.clickPassword(dr);
				System.out.println("Enter Password");
				data = sc.nextLine();
				RegistrationForm.sendKeysPassword(dr, data);
				
//				Clicking the registration button
				RegistrationForm.clickRegisterLink(dr);

}
}

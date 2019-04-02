package page.tests;

import org.openqa.selenium.*;

import page.objects.Homepage;
import page.objects.RegistrationForm;
import utility.Config;
import utility.ExcelUtils;

public class RegistrationFormTest {

	public static void fillRegistrationForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Config.PATH + Config.FILE, Config.sheetName);
// First name from Excell table of users

		RegistrationForm.clickFirstName(dr);
		data = ExcelUtils.getCellData(i, 0);
		RegistrationForm.sendKeysFirstName(dr, data);
// Last name from Excell table of users
		RegistrationForm.clickLastName(dr);
		data = ExcelUtils.getCellData(i, 1);
		RegistrationForm.sendKeysLastName(dr, data);
// Username from Excell table of users

		RegistrationForm.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		RegistrationForm.sendKeysUsername(dr, data);

//	Email from Excell table of users
		RegistrationForm.clickEmail(dr);
		data = ExcelUtils.getCellData(i, 3);
		RegistrationForm.sendKeysEmail(dr, data);

//		Password from Excell table of users
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
		for(int i=0;i<ExcelUtils.getWorkSheet().getLastRowNum()+1;i++) {
			fillRegistrationForm(dr,i);
			Homepage.navigateTo(dr);;
		}

}
}

package page.tests;

import org.openqa.selenium.*;

import page.objects.Homepage;
import page.objects.LoginForm;
import utility.Config;
import utility.ExcelUtils;

public class LoginFormTest {

	public static void fillLoginForm(WebDriver dr, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Config.PATH + Config.FILE, Config.sheetName);

// 		Username from Excell table of users

		LoginForm.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		LoginForm.sendKeysUsername(dr, data);

//		Password from Excell table of users
		LoginForm.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		LoginForm.sendKeysPassword(dr, data);

//		Clicking the login button
		LoginForm.clickLoginLink(dr);
		

		

	}
//	Testing with all available users
	
	public static void testWithAllUsers(WebDriver dr) throws Exception {
		ExcelUtils.
		setExcelFile
		(Config.PATH+Config.FILE,
				Config.sheetName);
		for(int i=0;i<ExcelUtils.getWorkSheet().getLastRowNum()+1;i++) {
			fillLoginForm(dr,i);
			Homepage.navigateTo(dr);;
		}

}
}

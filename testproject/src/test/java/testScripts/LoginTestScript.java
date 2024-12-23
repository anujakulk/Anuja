package testScripts;
import java.io.IOException;

import basePack.BaseClass;
import pompages.LoginPage;


public class LoginTestScript extends BaseClass
{
	public void performLogin() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.login();
	}
	
	public void performLogout()
	{
		LoginPage lp = new LoginPage(driver);
		lp.logout();
	}
	

}
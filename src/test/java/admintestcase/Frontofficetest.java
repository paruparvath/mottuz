package admintestcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.base.Testbase;
import hms.pages.Frontofficepage;
import hms.pages.Loginpage;

public class Frontofficetest extends Testbase {
	
	Loginpage objlog;
	Frontofficepage objff;
	
	public Frontofficetest()
	{
		super();
	}
@BeforeMethod
public void setup()
{
	initialization();
	objlog=new Loginpage();
	objlog.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	objff=new Frontofficepage();
}
	
	@Test
	public void frontofficetest()
	{
		objff.clickonfrontoffice();
		String expectedtitle="Appointment Details";
		String actualtitle=objff.gettabletitle();
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		objff.clickonvistorbook();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}

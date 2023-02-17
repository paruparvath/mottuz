package admintestcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.base.Testbase;
import hms.pages.Loginpage;

public class Logintest extends Testbase{
	
	Loginpage objlog;
	
	public Logintest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		objlog=new Loginpage();
	}
	
 @Test
 public void adminloginlogout()
 {
	 String expectedtitle="Smart Hospital : Hospital Management System";
	 String actualtitle=objlog.getpagetitle();
	 Assert.assertEquals(actualtitle, expectedtitle);
	 
	 Assert.assertTrue(objlog.logoisdisplayed());
	 
	 String expectedscreentitle="Admin Login";
	 String Actualscreentitle=objlog.getlogintext();
	 
	 Assert.assertEquals( Actualscreentitle,expectedscreentitle);
	 
	 objlog.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	 
	 objlog.adminlogout();
	 	 
 }
 @AfterMethod
 public void teardown()
 {
	 driver.close();
 }
}

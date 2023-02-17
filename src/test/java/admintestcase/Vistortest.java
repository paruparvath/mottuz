package admintestcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import hms.base.Testbase;
import hms.pages.Frontofficepage;
import hms.pages.Loginpage;
import hms.pages.Vistorpage;
import hms.utility.ReadExcel;

public class Vistortest extends Testbase {
	Loginpage objlog;
	Frontofficepage objff;
	Vistorpage objvis;
	
	public Vistortest()
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
	objff.clickonfrontoffice();
	objff.clickonvistorbook();
	objvis=new Vistorpage();
}

 @DataProvider
 public Object[][] getvistordata()
 {
	 Object[][]data=ReadExcel.getTestData("testdata");
	return data;
	 
 }
@Test(dataProvider="getvistordata")
public void testvistor(String vis[])
{
	String Actualtabletittle=objvis.gettabletitle();
	String Expectedtabaletittle="Visitor List";
	Assert.assertEquals(Actualtabletittle, Expectedtabaletittle);
	
	objvis.clickonaddvistor();
	
	String Actualscreentittle=objvis.getscreentitle();
	String Expectedscreentittle="Add Visitor";
	Assert.assertEquals(Actualscreentittle, Expectedscreentittle);
	
	objvis.addvistordetails(vis);
	
  }

  @AfterMethod
  public void teardown()
  {
	  driver.close();
  }




}

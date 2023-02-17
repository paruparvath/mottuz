package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.Testbase;

public class Loginpage extends Testbase {
	
   @FindBy(css = "img[src='http://triotend.com/tts/backend/images/s_logo.png']")
   WebElement logo;
   
   @FindBy(css = "h3.font-white")WebElement logintext;
   
   @FindBy(css="input#email")WebElement usertxt;
   
   @FindBy(css="input#password")WebElement passtxt;
   
   @FindBy(css="button.btn")WebElement singin;
   
   @FindBy(css="img.topuser-image")WebElement profile;
   
   @FindBy(css="div.sspass>a:nth-child(3)")WebElement logout;
   
   public Loginpage()
   {
	 
	   PageFactory.initElements(driver, this);
   
} 
   public String getpagetitle()
   {
	return driver.getTitle();
	   
   }
   
  public boolean logoisdisplayed()
  {
	return logo.isDisplayed();
	  
  }
  public String getlogintext()
  {
	return logintext.getText();
	  
  }
  
  public void adminlogin(String user,String pass)
  {
	  usertxt.sendKeys(user);
	  passtxt.sendKeys(pass);
	  singin.click();
  }
  
  public void adminlogout()
  {
	  profile.click();
	  logout.click();
  }
  
   
	
	
	
	

}

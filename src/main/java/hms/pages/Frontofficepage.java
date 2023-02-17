package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.Testbase;

public class Frontofficepage extends Testbase {
	
	@FindBy(css="ul.sidebar-menu>li")WebElement frontoffice;
	@FindBy(css="h3.box-title")WebElement tabletittle;
	@FindBy(css="div.box-tools>a:nth-child(2)")WebElement visitorbook;
	
	public Frontofficepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonfrontoffice()
	{
		frontoffice.click();
	}
	public String gettabletitle()
	{
		return tabletittle.getText();
		
	}
	public void clickonvistorbook()
	{
		visitorbook.click();
	}

}

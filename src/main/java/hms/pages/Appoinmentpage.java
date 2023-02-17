package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import hms.base.Testbase;

public class Appoinmentpage extends Testbase {
	
	@FindBy(css="h3.box-title")WebElement tabletittle;
	@FindBy(css="div.box-tools>a:nth-child(0)")WebElement addappoinment;
	@FindBy(css="div.modal-header>h4")WebElement screentitle;
	
	
	

}

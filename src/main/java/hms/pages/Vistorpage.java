package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hms.base.Testbase;
import hms.utility.Commonutility;
import hms.utility.Datepicker;

public class Vistorpage extends Testbase {
	
	@FindBy(css="h3.box-title")WebElement Tabletitle;
	@FindBy(css="div.box-tools>a")WebElement addvistor;
	@FindBy(xpath="//h4[text()=' Add Visitor']")WebElement screentitle;
	
	@FindBy(css="form#formadd select[name='purpose']")WebElement purpose;
	@FindBy(css="form#formadd input[name='name']")WebElement name;
	@FindBy(css="form#formadd input[name='contact']")WebElement phone;
	@FindBy(css="form#formadd input[name='id_proof']")WebElement idcard;
	@FindBy(css="form#formadd input[name='pepples']")WebElement numberofperson;
	@FindBy(css="form#formadd input[name='date']")WebElement date;
	@FindBy(css="form#formadd input[name='time']")WebElement time;
	@FindBy(css="form#formadd input[name='out_time']")WebElement outtime;
	@FindBy(css="form#formadd textarea[name='note']")WebElement note;
	@FindBy(css="form#formadd input[name='file']")WebElement file;
	
	public Vistorpage()
	{
		PageFactory.initElements(driver, this);
	}
	public String gettabletitle()
	{
		return Tabletitle.getText();
		
	}
	public void clickonaddvistor()
	{
		addvistor.click();
	}
	
	public String getscreentitle()
	{
		waitforelement(screentitle);
		return screentitle.getText();
		
	}
	public void addvistordetails(String data[])
	{
		Select drp=new Select(purpose);
		drp.selectByVisibleText(data[0]);
		name.sendKeys(data[1]);
		phone.sendKeys(data[2]);
		idcard.sendKeys(data[3]);
		numberofperson.sendKeys(data[5]);
		note.sendKeys(data[6]);
		Commonutility.mouseclick(file);
		Commonutility.fileupload(data[7]);
		date.click();
		Datepicker dt=new Datepicker();
		dt.datpicker(data[4]);

		
		
	}
	
	
	
	
	
	

}

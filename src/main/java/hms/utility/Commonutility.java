package hms.utility;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import hms.base.Testbase;

public class Commonutility extends Testbase {
	
	//mouse action
	
	public static void mouseclick(WebElement el)
	{
	Actions act=new Actions(driver);
	act.click(el).build().perform();
	}
	
	//file upload
	
	public static void fileupload(String loc)
	{
		StringSelection sel=new StringSelection(loc);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		Robot rb;
		try {
			rb = new Robot();
			Thread.sleep(2000);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
		
		
		
		
	

	}
	private void sysout() {
		// TODO Auto-generated method stub

	}
}

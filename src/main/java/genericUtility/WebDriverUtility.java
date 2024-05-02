package genericUtility;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	public void maximizeBrowserwindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void minimizeBrowserWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	public void waitforpageload(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		}
	public void handleDropdown(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void handleDropdown(WebElement element,String value) {
		Select s=new Select(element);
s.selectByValue(value);
	}
	public void handleDropdown(String visibleText,WebElement element) {
		Select s=new Select(element);
s.selectByVisibleText(visibleText);
	}
	//Actionclass
	public void mouseOverActions(WebDriver driver,WebElement element ) {
		Actions a=new Actions (driver);
		a.moveToElement(element).perform();
	}
	public void rightClick(WebDriver driver,WebElement element ) {
		Actions a=new Actions (driver);
a.contextClick().perform();	
}

	public void doubleclick(WebDriver driver,WebElement element ) {
		Actions a=new Actions (driver);
		a.doubleClick(element).perform();
	}
	public void dragAnddrop(WebDriver driver,WebElement srcele,WebElement deste) {
		Actions a=new Actions (driver);
		a.dragAndDrop(srcele, deste).perform();
	}
	public void getScreenshot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("");
		
			try {
				Files.copy(src,dest);
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
}



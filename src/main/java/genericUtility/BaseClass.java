package genericUtility;

//import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.swaglabs.pomclasess.LoginPage;

//import VtigerPractice.Loginpage;
//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
//import swaglabs.pomclasses.LoginPage;

public class BaseClass {

public PropertyFileUtility pu=new PropertyFileUtility();
public ExcelFileUtility eu=new ExcelFileUtility();
public JavaUtility ju=new JavaUtility();
public WebDriverUtility wu=new WebDriverUtility();
public WebDriver driver=null;
//for runtime polymorphisam
@BeforeSuite
public void bsconfing() {
	System.out.println("====DB CONNECTION=====");
	}
@AfterSuite
public void asconfing() {
	System.out.println("====DB DISCONNECTION=====");
}
@BeforeClass
public void bcconfing() throws Throwable  {
String BROWSER=pu.readdatafrompf("browser");
String URL = pu.readdatafrompf("url");
if(BROWSER.equalsIgnoreCase("edge")) {
	driver=new EdgeDriver();
	
}
else if(BROWSER.equalsIgnoreCase("chrome")) {
	driver=new ChromeDriver();
}
else {
	System.out.println("INVALID BROWSER NAME");
}
driver.get(URL);
wu.maximizeBrowserwindow(driver);
wu.waitforpageload(driver);
}
@AfterClass
public void acconfig() {
	driver.quit();
	
}
@BeforeMethod
public void bmconfig() throws Throwable {
	String UN = pu.readdatafrompf("un");
	String PWD = pu.readdatafrompf("pwd");
	LoginPage lp=new LoginPage(driver);
	lp.loginToApp(UN, PWD);
	wu.getScreenshot(driver);	
}

@AfterMethod
public void amconfig() {
	System.out.println("Logout From App");
}






}

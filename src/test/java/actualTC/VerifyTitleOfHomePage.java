package actualTC;



import org.testng.Assert;
import org.testng.annotations.Test;


import genericUtility.BaseClass;

public class VerifyTitleOfHomePage extends BaseClass {

	
	@Test
	public void TC() {
		String et="Swag Labs";
		 String ht=driver.getTitle();
		Assert.assertEquals(et,ht,"Both Are Not Matching");
		System.out.println("TC is pass");
		System.out.println("I am Soumya ");
		system.out.println("I am sowjanyasree")
	
	}
}
	
	


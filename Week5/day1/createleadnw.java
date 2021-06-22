package Week5.day1;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5teestng.ReadExcel;

public class createleadnw extends NewTest1{
		@BeforeTest
	public void setfile()
	{ 
		callexcelfile="createLead";
	}
	@Test(dataProvider="sendData")
	public void runlead(String cname, String fname, String lname) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
}
}

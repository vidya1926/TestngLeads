package week5teestng;

	import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Week5.day1.NewTest1;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class createLead extends NewTest1{

@Test(dataProvider="input", invocationCount=3)
		public void runlead(String cname, String fname, String lname) {
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			driver.findElement(By.name("submitButton")).click();
	}
@DataProvider(name="input")
public String[][] sendData(){
	String[][] data=new String[3][3];
	data[0][0] ="TL";
	data[0][1]="Ramesh";
	data[0][2]="k";
	
	data[1][0] ="TL";
	data[1][1]="Renu";
	data[1][2]="R";
	
	data[2][0] ="TL";
	data[2][1]="Sanjay";
	data[2][2]="A";
	
			
	return data;
	
}



}

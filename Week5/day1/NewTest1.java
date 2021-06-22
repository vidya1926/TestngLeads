package Week5.day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5teestng.ReadExcel;

public class NewTest1 {
	public ChromeDriver driver;
	public String callexcelfile;
	@Parameters({"url","username","password"})
    @BeforeMethod
    public void preCondition(String url, String uName,String pwd) {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	  
       }  
 @AfterMethod
    public void postCondition() {

	  driver.close();
 }
 @DataProvider
 public String[][] sendData() throws IOException{

 return ReadExcel.exceldata(callexcelfile);
 } 
 
 
 
}
  


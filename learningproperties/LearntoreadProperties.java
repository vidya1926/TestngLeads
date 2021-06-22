package learningproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.property.GetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearntoreadProperties {

	public static void main(String [] args) throws IOException {
		
		FileInputStream filein= new FileInputStream("./src/main/resources/configuration.properties");
		
	Properties file=new Properties();
	file.load(filein);
		  WebDriverManager.chromedriver().setup();
		ChromeDriver	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(file.getProperty("url"));
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 driver.findElement(By.id("username")).sendKeys(file.getProperty("uName"));
			driver.findElement(By.id("password")).sendKeys(file.getProperty("pwd"));
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			String Title=driver.getTitle();
			System.out.println(Title);
			System.out.println("Logged in");
		   

	}

}

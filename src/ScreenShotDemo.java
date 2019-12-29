import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {
	static
	{
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver_win32/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void takescreenshots(WebDriver mdriver, String mdate) throws IOException
	{
		TakesScreenshot t=(TakesScreenshot) mdriver;
		File srcfile=t.getScreenshotAs(OutputType.FILE);
		File desfile=new File("d:\\login"+mdate+".png");
		System.out.println(srcfile.getAbsolutePath());
		FileUtils.copyFile(srcfile, desfile);	
	
	}

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		Date d=new Date();
		String date=d.toString();
		date=date.replaceAll(":", "_");
		//System.out.println(s);
		date=date.substring(8, 19);
		//System.out.println(s);
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		for(int i=1; i<=5; i++)
		{
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("beauty.singh@worldpay.com");
		WebElement pswrd=driver.findElement(By.id("Password"));
		pswrd.sendKeys("Kolkata@12");
		WebElement login=driver.findElement(By.xpath("//input[@value='Log in']"));
	
		login.click();
		takescreenshots(driver, date);
		Thread.sleep(5000);
		}
		
	}
	
	
}
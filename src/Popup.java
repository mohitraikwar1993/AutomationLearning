import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.naming.LinkLoopException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popup {

	static
	 {
		String keyChrome="webdriver.chrome.driver";
		String keyFF="webdriver.gecko.driver";
		String valChrome="./driver/chromedriver_win32/chromedriver.exe";
		String valFF="./driver/geckodriver-v0.24.0-win64/geckodriver.exe";
		System.setProperty(keyChrome, valChrome);
		System.setProperty(keyFF, valFF);
	 }
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		WebDriverWait wait=new WebDriverWait(driver,18);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("webklipper-publisher-widget-container-notification-frame"));
		Thread.sleep(5000);
		//driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		WebElement close=driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));
		close.click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Thread.sleep(5000);
		String depxpth="//div[@class='dF whiteBg col-sm-5 alignItemsCenter  col-md-2 ']";
		WebElement depature=driver.findElement(By.xpath(depxpth));
		depature.click();
		Thread.sleep(8000);
		WebElement next=driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
		next.click();
		WebElement date19=driver.findElement(By.xpath("//div[text()='19']"));
		date19.click();
		
		WebElement img=driver.findElement(By.xpath("//img[@src='https://gos3.ibcdn.com/img-1542001352.jpg']"));
		img.click();
		
		System.out.println(driver.getWindowHandle());
		
		Set<String>  handles=driver.getWindowHandles();
		for(String hndl : handles)
		{
			driver.switchTo().window(hndl);	
			String act=driver.getTitle();
			String ext="PAYPAL User Offer";
			if(act.equals(ext))
			{
				System.out.println(driver.getWindowHandle());
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[.='Book Now']")).click();
	
		Thread.sleep(15000);
		driver.close();
		
	}
}

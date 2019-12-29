import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadPopup {
	static
	{
		String keyChrome="webdriver.chrome.driver";
		String keyFF="webdriver.gecko.driver";
		String valChrome="./driver/chromedriver_win32/chromedriver.exe";
		String valFF="./driver/geckodriver-v0.24.0-win64/geckodriver.exe";
		System.setProperty(keyChrome, valChrome);
		System.setProperty(keyFF, valFF);
	}
	public static void main(String[] args) throws InterruptedException {
	
		String userxpth="//input[@id='identifierId']";
		String Nextxpth="//span[contains(text(),'Next')]";
		String pswrdxpth="(//input[@jsname='YPqjbf'])[1]";
		String Nxtxpth="//span[text()='Next']";
		String inbxpth="//a[@title='Inbox']";
		String starxpth="(//span[text()='Mar 1'])[2]/../../..//span[@id=':5n']";
		
		ChromeDriver driverC = new ChromeDriver();
		driverC.manage().window().maximize();
		driverC.get("https://www.google.com/intl/en-GB/gmail/about/#");
		WebElement signin=driverC.findElement(By.partialLinkText("Sign in"));
		signin.click();//click on sign in hyperlink
		Thread.sleep(10000);
		Set <String> winHandles=driverC.getWindowHandles();
		for(String handle : winHandles)
		{
			System.out.println(handle);
			driverC.switchTo().window(handle);
		}
		WebElement username= driverC.findElement(By.xpath(userxpth));
		username.sendKeys("bscoolangel@gmail.com");
		WebElement next= driverC.findElement(By.xpath(Nextxpth));
		next.click();
		
		Thread.sleep(5000);
		WebElement pss=driverC.findElement(By.xpath(pswrdxpth));
		pss.sendKeys("Kolkata@12");
		WebElement nxt= driverC.findElement(By.xpath(Nxtxpth));
		Thread.sleep(3000);
		nxt.click();
		Thread.sleep(5000);
	
	}
}

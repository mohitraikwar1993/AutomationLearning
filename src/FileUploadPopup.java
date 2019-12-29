import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPopup {
	static
	 {
		String keyChrome="webdriver.chrome.driver";
		String keyFF="webdriver.gecko.driver";
		String valChrome="./driver/chromedriver_win32/chromedriver.exe";
		String valFF="./driver/geckodriver-v0.24.0-win64/geckodriver.exe";
		System.setProperty(keyChrome, valChrome);
		System.setProperty(keyFF, valFF);
	 }
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains("Convert"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(10000);
		//driver.switchTo().frame("easyXDM_default5344_provider");
		Thread.sleep(5000);
		WebElement uploader=driver.findElement(By.id("uploadfile_0"));
		//uploader.click();
		File file=new File("D:\\Alisha.pdf");
		String abpath=file.getAbsolutePath();
		System.out.println(abpath);
		//driver.switchTo().activeElement().sendKeys(abpath);
		Robot r=new Robot();
		uploader.sendKeys(abpath);
		//r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		//uploader.sendKeys(abpath);	
		//driver.close();
		
	}
}

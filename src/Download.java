import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download {

	static
	{
		String keyChrome="webdriver.chrome.driver";
		String keyFF="webdriver.gecko.driver";
		String valChrome="./driver/chromedriver_win32/chromedriver.exe";
		String valFF="./driver/geckodriver-v0.24.0-win64/geckodriver.exe";
		System.setProperty(keyChrome, valChrome);
		System.setProperty(keyFF, valFF);
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[.='3.141.59']")).click();
		Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_TAB);
		//r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement operaLink=driver.findElement(By.xpath("//a[.='Opera']"));
		
		int x=operaLink.getLocation().getX();
		int y=operaLink.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		System.out.println(x+","+y);
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		//js.executeAsyncScript("window.scrollBy(588,2500)");
		
		
		
		
		
	}
	
	
	
}

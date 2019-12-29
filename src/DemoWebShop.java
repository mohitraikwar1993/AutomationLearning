import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShop {
	static
	{
	String key="webdriver.chrome.driver";
	String value="./driver/chromedriver_win32/chromedriver.exe";
	System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver= new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
		
    Thread.sleep(8000);
	WebElement comp=driver.findElement(By.partialLinkText("Computers"));
	Actions ac=new Actions(driver);
	ac.moveToElement(comp).perform();
		
		
	
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;

public class AmazonDemo 
{
	static
	{
	String key="webdriver.chrome.driver";
	String value="./driver/chromedriver_win32/chromedriver.exe";
	System.setProperty(key, value);
	}

 public static void main(String []args)
	{
	 ChromeDriver driver= new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']")).click();
	 	
	}

}

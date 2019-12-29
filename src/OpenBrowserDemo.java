import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenBrowserDemo {
	
	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver_win32/chromedriver.exe";
		
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		//ChromeDriver driver2=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/men-tshirts?src=sNav");
		String xp="(//img[@title='Huetrap Men Yellow & Green Printed Round Neck T-shirt']/../../../../../../div)[2]/div/span/span";
		WebElement tshirt=driver.findElement(By.xpath(xp));
		String price=tshirt.getText();
		System.out.println(price);
		
		
		

	}

}

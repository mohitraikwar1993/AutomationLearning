import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChkSizeUnPw {
	static
	{
	String key="webdriver.chrome.driver";
	String value="./driver/chromedriver_win32/chromedriver.exe";
	System.setProperty(key, value);
	}
	

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String url="https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		String signXpth="//a[contains(.,'Hello')]/span[2]";
		driver.findElement(By.xpath(signXpth)).click();
		String mobXpth="//input[@id='ap_email']";
		driver.findElement(By.xpath(mobXpth)).sendKeys("8982828050");
		String continueXpth="//input[@id='continue']";
		Thread.sleep(1000);
		driver.findElement(By.xpath(continueXpth)).click();
		String pwdXpth="//input[@id='ap_password']";
		driver.findElement(By.xpath(pwdXpth)).sendKeys("Mohit@777");
		String loginXpth="//input[@id='signInSubmit']";
		driver.findElement(By.xpath(loginXpth)).click();
		
		String categoryXpth="//a[@id='nav-link-shopall']";
		driver.findElement(By.xpath(categoryXpth)).click();
		Thread.sleep(2000);
		String cothXpth="(//a[(text()='Clothing')])[1]";
		driver.findElement(By.xpath(cothXpth)).click();
		Thread.sleep(8000);
		//String deptXpth="//select[@id='bin_1_ns_9WY44NH72SGDZ5NTSJFA_1077_']";
		WebElement department=	driver.findElement(By.name("bin_1"));
		//WebElement department=driver.findElement(By.xpath(deptXpth));
		Select select=new Select(department);
		if(select.isMultiple())
		{
			System.out.println("Listbox is type multiselect");
			java.util.List<WebElement> allopt =select.getOptions();
			System.out.println("List of options :");
			for(int i=0 ; i<allopt.size() ; i++)
			{
				System.out.println(allopt.get(i));
			}
		}
		else
		{
			System.out.println("Listbox is type singlr select");
		}
		
		java.util.List<WebElement> allopt =select.getOptions();
		System.out.println("List of options :");
		for(int i=0 ; i<allopt.size() ; i++)
		{
			WebElement opt=allopt.get(i);
			System.out.println(opt.getText());
		}
		
		//selecting Winterwear
		select.selectByVisibleText("Winterwear");
		Thread.sleep(2000);
		String findnowXpth="//label[text()='Find Now']";
		driver.findElement(By.xpath(findnowXpth)).click();
		
		String titleXpth="//h1[contains(text(), 'Winterwear')]";
		try
		{
		driver.findElement(By.xpath(titleXpth)).isDisplayed();
		System.out.println("Pass");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("fail : Wrong Page");
		}
		
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,600)");
		
		//String priceXpth="(//a[@class='a-link-normal'])[20]/../../div[3]/span[2]";
		//System.out.println(driver.findElement(By.xpath(priceXpth)).getText());
		
	
		
		
	
	}

}

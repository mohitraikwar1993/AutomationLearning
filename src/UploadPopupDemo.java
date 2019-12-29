import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UploadPopupDemo {

	static
	 {
		String keyChrome="webdriver.chrome.driver";
		String keyFF="webdriver.gecko.driver";
		String valChrome="./driver/chromedriver_win32/chromedriver.exe";
		String valFF="./driver/geckodriver-v0.24.0-win64/geckodriver.exe";
		System.setProperty(keyChrome, valChrome);
		System.setProperty(keyFF, valFF);
	 }
	
	public static void clickLogin(WebDriver driv)
	{
		driv.findElement(By.id("login_Layer")).click();
		
	}
	public static void enterUserNm(WebDriver driv)
	{
		driv.findElement(By.id("eLoginNew")).sendKeys("bscoolangle@gmail.com");
	}
	public static void enterPwd(WebDriver driv)
	{
		driv.findElement(By.id("pLogin")).sendKeys("Mohit@9806");
	}
	public static void clickLogin2(WebDriver driv)
	{
		driv.findElement(By.xpath("//button[.='Login']")).click();
	}
	
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	WebDriverWait wait= new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleContains("Employment "));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[@id='block']")).click();
	Thread.sleep(4000);
	clickLogin(driver);
	enterUserNm(driver);
	enterPwd(driver);
	clickLogin2(driver);
	Thread.sleep(5000);
	driver.findElement(By.id("usernameField")).sendKeys("bscoolangle@gmail.com");
	driver.findElement(By.id("passwordField")).sendKeys("Mohit@9806");
	driver.findElement(By.id("passwordField")).sendKeys(Keys.ENTER);
	//driver.findElement(By.xpath("//button[.='Login']")).click();
	
	/*
	WebElement naukri=driver.findElement(By.xpath("//div[text()='My Naukri']"));
	Actions act=new Actions(driver);
	act.moveToElement(naukri);
	WebElement edit=driver.findElement(By.xpath("//a[@title='Edit Profile']"));
	edit.click();
	driver.close();
	*/

	}

}

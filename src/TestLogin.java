import java.sql.Driver;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class HomePage
{
	@FindBy(xpath="//a[.='Log in']")
	private WebElement loginLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}	
	
	public void clickLogin()
	{
		loginLink.click();
	}
	
}

class LoginPage
{
	@FindBy(id="Email")
	private WebElement unTB;
	
	@FindBy(id="Password")
	private WebElement pwTB;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}	
	
	public void setUN(String un) 
	{
	unTB.sendKeys(un);	
	}
	
	public void setPW(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
}


public class TestLogin
{
	static
	{
	//String key="webdriver.chrome.driver"	;
	//String value="./driver/chromedriver_win32/chromedriver.exe";
	//System.setProperty(key, value);
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
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		AddProductPage ap=new AddProductPage(driver);
		RndmBoksPage bkp=new RndmBoksPage(driver);
		ClickUserPage cp= new ClickUserPage(driver);
		
		hp.clickLogin();
		Thread.sleep(4000);
		lp.setUN("mohit.raikwar@worldpay.com");
		lp.setPW("Vantiv07");
		lp.clickLoginButton();	
		ap.bookclick();
		Random ran=new Random();
		for(int i=0; i<=3; i++)
		{
		int indx=ran.nextInt(3)+1;
		bkp.clickAddToCart(indx);
		Thread.sleep(2000);
		}
		Thread.sleep(5000);
	    //driver.close();
	    
		//Thread.sleep(5000);
		//cp.useclick();
	}
	


}















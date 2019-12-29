import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChrome {
	
public static void main(String [] args)
	{
	String key="webdriver.chrome.driver";
	String value="./driver/chromedriver_win32/chromedriver.exe";
	
	System.setProperty(key, value);
	ChromeDriver d = new ChromeDriver();
	d.get("https://www.google.co.in");
	d.manage().window().maximize();
	}
}

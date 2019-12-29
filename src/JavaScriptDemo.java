import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {
	static
	{
		String keyChrome="webdriver.chrome.driver";
		String keyFF="webdriver.gecko.driver";
		String valChrome="./driver/chromedriver_win32/chromedriver.exe";
		String valFF="./driver/geckodriver-v0.24.0-win64/geckodriver.exe";
		System.setProperty(keyChrome, valChrome);
		System.setProperty(keyFF, valFF);
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById(\"small-searchterms\").value='mobile'");
		js.executeScript("");
	}
}

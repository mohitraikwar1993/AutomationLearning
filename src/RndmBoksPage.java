import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RndmBoksPage {

	@FindBy(xpath="//input[@value='Add to cart']")
	private List<WebElement> addcart;
	
	public RndmBoksPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	public  void clickAddToCart(int index)
	{
		System.out.println(addcart.getClass().getName().toString());
		System.out.println(index);
		addcart.get(index).click();
	}
}

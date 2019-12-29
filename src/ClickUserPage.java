import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickUserPage 
{
@FindBy(xpath="//a[.='mohit.raikwar@worldpay.com']")
private WebElement usrname;

public ClickUserPage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void useclick()

{
usrname.click();	
}

}

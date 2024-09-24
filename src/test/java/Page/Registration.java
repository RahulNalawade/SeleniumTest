package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.Base;
import locator.RegistrationLocator;

public class Registration extends Base{
	
	
	public Registration() throws InterruptedException {
		
	}
	@FindBy(xpath= RegistrationLocator.SIGN_UP_BUTTON)
	public WebElement signUpButton;
	
	@FindBy(xpath= RegistrationLocator.HOME_SCREEN_VISIBLE)
	public WebElement homescreen;
	
	
	public boolean clickOnSignUp()
	{
		boolean flag =false;
		try
		{
			signUpButton.click();
			return true;
		}
		catch(Exception e)
		{
			return flag;
		}
	}
	
	
}

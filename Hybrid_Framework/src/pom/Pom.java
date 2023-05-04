package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {

	@FindBy(id = "email")
	private WebElement un;
	@FindBy(id = "pass")
	private WebElement pwd;
	@FindBy(name = "login")
	private WebElement log;
	
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userName(String un_value)
	{
		un.sendKeys(un_value);
	}
	public void password(String pwd_value)
	{
		pwd.sendKeys(pwd_value);
	}
	public void login()
	{
		log.click();
	}
}

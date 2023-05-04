package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaPom {

	@FindBy(name = "username")
	private WebElement un;
	@FindBy(name = "password")
	private WebElement pwd;
	@FindBy(xpath = "//input[@name='password']/../../../../..//div[3]")
	private WebElement log;
	
	public InstaPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String un_value)
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

package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Pom_Facebook extends Base_Page {
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	public Pom_Facebook(WebDriver driver){
		super(driver);
	}
	
	public void setEmail(String mail){
		email.sendKeys(mail);
	}
	
	public void setPwd(String password){
		pwd.sendKeys(password);
	}
	
	public void loginBtn(){
		login.click();
	}
}

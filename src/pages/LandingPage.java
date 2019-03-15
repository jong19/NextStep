package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.PropertyConfig;
import utility.WebDriverWaitInitializer;

public class LandingPage {
	
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="REGISTER")
	WebElement register_link;
	
	@FindBy(how=How.LINK_TEXT, using="LOGIN")
	WebElement login_link;
	
	
	public LandingPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	public void locate_register_link() throws InterruptedException{
		new WebDriverWaitInitializer(driver);
		PropertyConfig.wdw.until(ExpectedConditions.elementToBeClickable(register_link));
		Thread.sleep(3000);
			
	}
	
	public void click_register_link(){
		register_link.click();
		
	}
	
	public void locate_login_link() throws InterruptedException{
		new WebDriverWaitInitializer(driver);
		PropertyConfig.wdw.until(ExpectedConditions.elementToBeClickable(login_link));
		Thread.sleep(3000);
			
	}
	
	public void click_login_link(){
		login_link.click();
		
	}
	
	

	
	
	
	
	
	
	
	
	
	

}

package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 WebDriver driver;

	@FindBy(xpath = "//*[@id='txtUsername']")
	private WebElement username;

	// WebElement username=driver.findElement(By.xpath("//*[@id='txtUsername']"));

	@FindBy(xpath = "//*[@id='txtPassword']")
	private WebElement password;

	@FindBy(xpath = "//*[@id='btnLogin']")
	private WebElement btn;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void logIn() throws Exception   {
		
		username.sendKeys("Admin");
		Thread.sleep(3000);
		password.sendKeys("admin123");
		Thread.sleep(3000);
		btn.click();
		
	}

}

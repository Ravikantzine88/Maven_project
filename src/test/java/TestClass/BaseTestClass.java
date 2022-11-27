package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import PageClass.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {

	static WebDriver driver;
	LoginPage lip;

	@BeforeTest
	public void setproparty() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		Thread.sleep(3000);

		// ChromeOptions options=new ChromeOptions();
//		options.addArguments("--start-maximized");
//		options.addArguments("--disable-notifications");
		// driver = new ChromeDriver(options);

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

	@BeforeClass
	public void objectcreation() {

		lip = new LoginPage(driver);

	}

}

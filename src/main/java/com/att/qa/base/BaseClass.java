package com.att.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.att.qa.common.Commons;
import com.att.qa.objects.HomePage;
import com.att.qa.utils.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public Configuration configuration = new Configuration(null);

	WebDriver driver;

	protected HomePage hp;
	protected Commons ca;

	@BeforeMethod
	public void setUp() {
		driver = localDriver("chrome");
		driver.manage().window().maximize();
		driver.get(configuration.getConfiguration("url"));
		driver.manage().timeouts()
				.pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(configuration.getConfiguration("pageloadWait"))));
		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.parseInt(configuration.getConfiguration("implicitWait"))));
		initialization();

	}

	private WebDriver localDriver(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public void initialization() {
		hp = new HomePage(driver);
		ca = new Commons();

	}

	protected WebDriver getDriver() {
		return driver;
	}

	@AfterMethod
	public void terminate() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}

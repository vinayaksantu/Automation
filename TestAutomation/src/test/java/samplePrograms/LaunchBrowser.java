package samplePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	public LaunchBrowser() {
		
	}
		@Test()
		public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\TestAutomation\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/");
		}
	}



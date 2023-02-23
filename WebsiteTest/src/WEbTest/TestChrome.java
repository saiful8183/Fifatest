package WEbTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) {
       WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saiful Chowdhury\\Desktop\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	}

	}



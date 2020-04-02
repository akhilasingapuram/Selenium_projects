package Pageobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	// launch browser, sign in, create account
	public static WebDriver driver;

	public void launchapp(String url) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Akhila\\Selenium_jars\\selenium-java-3.141.59\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public String gettitle() {
		return driver.getTitle();
	}

	public void set_value(String locator, String inputvalue) {
		WebDriverWait ww = new WebDriverWait(driver, 20);
		ww.until(ExpectedConditions.elementToBeClickable(driver.findElement(By
				.cssSelector(locator))));
		driver.findElement(By.cssSelector(locator)).sendKeys(inputvalue);
	}

	public void click(String locator) {
		waitForElement(locator);
		driver.findElement(By.cssSelector(locator)).click();
	}

	public void select_value(String locator, String inputvalue) {
		Select sel = new Select(driver.findElement(By.id(locator)));
		sel.selectByValue(inputvalue);

	}

	public void waitForPageLoad() {
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript(
						"return document.readyState").equals("complete");
			}
		};
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(pageLoadCondition);
	}

	public void waitForElement(String locator) {
		WebDriverWait ww1 = new WebDriverWait(driver, 20);
		ww1.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector(locator)));
	}

	public String getProperty(String filePath, String key) throws IOException {
		InputStream input = new FileInputStream(filePath);
		Properties p = new Properties();
		p.load(input);
		return p.getProperty(key).toString();
	}
	
	public  String generateUsername()
	  {
		  Random r=new Random();
		  int rand_int1 = r.nextInt(1000); 
		  return "test"+String.valueOf(rand_int1)+"@gm.com";//test99@gmail.com
	  }
	  
}

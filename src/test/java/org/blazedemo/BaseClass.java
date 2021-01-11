package org.blazedemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
		public static WebDriver driver;
		public static void browserlaunch() {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver=new ChromeDriver();
			System.out.println("Browser lauched successfully");
			driver.manage().window().maximize();
			
		}
		public static void closebrowser() {
			driver.close();
			
		}
		
		public static void thread(int time) throws InterruptedException  {
			Thread.sleep(time);
		}
		
		public static void sendkeys(WebElement element, String text) {
			element.sendKeys(text);
		}
		
		public static void click(WebElement element) {
			element.click();
		}
		
		public static void setattribute(WebElement element, String text) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript(text, element);
		}
		
		public static String getattribute(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Object o=js.executeScript("return arguments[0].getAttribute('value')",element);
			String s=(String)o;
			System.out.println(s);
			return s;
			
		}
		
		public static void btnclick(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click",element);
		}
		
		public static void geturl(String url)  {
			driver.get(url);
		}
		
		public static void getcurrenturl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}
		
}

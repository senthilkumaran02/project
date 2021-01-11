package org.duplicate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.BaseClass;

public class Flipkart extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browserlaunch();
		geturl("https://www.flipkart.com/");
		
		WebElement x = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
		click(x);
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		sendkeys(search,"iphone");
		
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		click(btn);
		thread(5000);
		
		//PRINT WITHOUT DUPLICATES
		List<WebElement> li = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		System.out.println("WITH DUPLICATES: "+li.size());
		Set<WebElement> si= new HashSet<WebElement>();
		si.addAll(li);
		System.out.println("WITHOUT DUPLICATE: "+ si.size());
		for (WebElement element : si) {		
			String text = element.getText();
			System.out.println("LENGTH: "+text.length());
			System.out.println(text);
		}
		
	}
	
}

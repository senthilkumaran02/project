package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browserlaunch();
		geturl("https://www.amazon.com/");
		thread(5000);
		
		LoginPojo l= new LoginPojo();
		sendkeys(l.getSearch(),"iphone");
		btnclick(l.getBtn());
		
	}
	

}

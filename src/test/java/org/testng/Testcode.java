package org.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcode extends BaseClass {

	private static final String String = null;

	@BeforeClass
	private void launchbrowser() throws InterruptedException {	
		browserlaunch();
		geturl("https://www.amazon.com/");
		thread(3000);
	}

	@Test
	public void test() throws InterruptedException {
		
		LoginPojo l= new LoginPojo();
		/*
		click(l.getSignin());
		sendkeys(l.getEmailid(),"demosenthil02@gmail.com");
		click(l.getnext());
		sendkeys(l.getPass(),"Senthil@02");
		click(l.getSubmit());
		thread(3000);
		*/
		
		sendkeys(l.getSearch(),"iphone");
		click(l.getBtn());
		thread(3000);
		
		click(l.getProduct());
		thread(2000);
		
		click(l.getaddCartbtn());
		thread(2000);
		
		click(l.getCartbtn());
		thread(3000);
		
		System.out.println("success");	
		getattribute(l.getPrice());
	}

	/*
	@AfterClass
	private void close() {
			closebrowser();	
	}
	*/

}

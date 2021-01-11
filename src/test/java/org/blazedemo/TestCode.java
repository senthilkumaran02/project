package org.blazedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCode extends BaseClass {

	
	
	@BeforeClass
	private void launch() throws InterruptedException {
		
		browserlaunch();
		geturl("https://blazedemo.com/");
		getcurrenturl();
		//thread(3000);
		
	}
	
	@Test
	public void test() throws InterruptedException {
		LoginPojo l=new LoginPojo();
		click(l.getDeparture());
		click(l.getDestination());
		click(l.getSubmit());

		//WebElement findElement = driver.findElement(By.xpath("//div[@class='container']"));
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++) 
		{
			WebElement row = rows.get(i);
				List<WebElement> heads = row.findElements(By.tagName("th"));
				for(int j=0;j<heads.size();j++) 
			{		
					WebElement head = heads.get(j);
					String text = head.getText();
			}
				List<WebElement> datas = row.findElements(By.tagName("td"));
				for(int j=5;j<datas.size();j++) 
			{
					WebElement data = datas.get(j);
					String text = data.getText();
					//System.out.println(text);
					String txt = text.replace("$", "");
					List<String> li=new ArrayList<String>();
					li.add(txt);
					Set<String> si=new TreeSet();
					si.addAll(li);
					System.out.println(si);
					
			}		
		}
			
		click(l.getSubmit());
		thread(3000);
        }
	
		@Parameters({"inputName","address","city","state","zipCode","cardType","creditCardNumber","creditCardMonth","creditCardYear","nameOnCard"})
		@Test()
		public void formfill(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) {
			
			LoginPojo l=new LoginPojo();
			
			sendkeys(l.getName(),s);
			sendkeys(l.getAddress(),s1);
			sendkeys(l.getCity(),s2);
			sendkeys(l.getState(),s3);
			sendkeys(l.getPincode(),s4);
			sendkeys(l.getCard(),s5);
			sendkeys(l.getCardno(),s6);
			sendkeys(l.getMonth(),s7);
			sendkeys(l.getYear(),s8);
			sendkeys(l.getCardname(),s9);
			click(l.getSubmitflight());
			
			/*
			WebElement name = driver.findElement(By.xpath("//input[@placeholder='First Last']"));
			sendkeys(name,s);
			WebElement address = driver.findElement(By.xpath("//input[@placeholder='123 Main St.']"));
			sendkeys(address,s1);
			WebElement city = driver.findElement(By.xpath("//input[@placeholder='Anytown']"));
			sendkeys(city,s2);
			WebElement state = driver.findElement(By.xpath("//input[@placeholder='State']"));
			sendkeys(state,s3);
			WebElement zipcode = driver.findElement(By.xpath("//input[@placeholder='12345']"));
			sendkeys(zipcode,s4);
			WebElement cardtype = driver.findElement(By.xpath("//select[@name='cardType']"));
			sendkeys(cardtype,s5);
			WebElement cardno = driver.findElement(By.xpath("//input[@placeholder='Credit Card Number']"));
			sendkeys(cardno,s6);
			WebElement cardmonth = driver.findElement(By.xpath("//input[@placeholder='Month']"));
			sendkeys(cardmonth,s7);
			WebElement cardyear = driver.findElement(By.xpath("///input[@placeholder='Year']"));
			sendkeys(cardyear,s8);
			WebElement cardname = driver.findElement(By.xpath("//input[@placeholder='John Smith']"));
			sendkeys(cardname,s9);
			
			click(l.getPurchasebtn());
			*/
		}
}

package org.blazedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//option[@value='Boston']")
	private WebElement departure;
	
	@FindBy(xpath="//option[@value='London']")
	private WebElement destination;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//table[@class='table']")
	private WebElement table;
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	private WebElement submitflight;
	
	@FindBy(xpath="//input[@placeholder='First Last']")
	private WebElement name;
	
	@FindBy(xpath="//input[@placeholder='123 Main St.']")
	private WebElement address;
	
	@FindBy(xpath="//input[@placeholder='Anytown']")
	private WebElement city;
	
	@FindBy(xpath="//input[@placeholder='State']")
	private WebElement state;
	
	@FindBy(xpath="//input[@placeholder='12345']")
	private WebElement pincode;
	
	@FindBy(xpath="//select[@name='cardType']")
	private WebElement card;
	
	@FindBy(xpath="//input[@placeholder='Credit Card Number']")
	private WebElement cardno;
	
	@FindBy(xpath="//input[@placeholder='Month']")
	private WebElement month;
	
	@FindBy(xpath="//input[@placeholder='Year']")
	private WebElement year;
	
	@FindBy(xpath="//input[@placeholder='John Smith']")
	private WebElement cardname;
	
	@FindBy(xpath="//input[@placeholder='//input[@type='checkbox']']")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@placeholder='//input[@type='submit']']")
	private WebElement purchasebtn;
	
	

	public WebElement getDeparture() {
		return departure;
	}

	public WebElement getDestination() {
		return destination;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getTable() {
		return table;
	}

	public WebElement getSubmitflight() {
		return submitflight;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCardname() {
		return cardname;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getPurchasebtn() {
		return purchasebtn;
	}

	
	

}

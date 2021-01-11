package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	private WebElement signin;
	
	public WebElement getSignin() {
		return signin;
	}
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailid;
	
	public WebElement getEmailid() {
		return emailid;
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement next;
	
	public WebElement getnext() {
		return next;
	}
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	
	public WebElement getSearch() {
		return searchbox;
	}
		
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement btn;
	
	public WebElement getBtn() {
		return btn;
	}
	
	@FindBy(xpath="//span[text()='Tracfone Apple iPhone 7 4G LTE Prepaid Smartphone - 32GB - Black - Carrier Locked']")
	private WebElement product;
	
	public WebElement getProduct() {
		return product;
	}
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addcartbtn;
	
	public WebElement getaddCartbtn() {
		return addcartbtn;
	}
	
	@FindBy(xpath="(//span[contains(text(),'Cart')])[1]")
	private WebElement cartbtn;
	
	public WebElement getCartbtn() {
		return cartbtn;
	}
		
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]")
	private WebElement price;
	
	public WebElement getPrice() {
		return price;
	}
	








	
	
}

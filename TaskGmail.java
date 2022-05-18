package org.taskss;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskGmail extends BaseClass {
	public TaskGmail() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Use another account']")
	private WebElement anotherAc;
	@FindBy(xpath="//input[@aria-label=\"Email or phone\"]")
	private WebElement userName;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement btnNext ;
	@FindBy(xpath="//span[text()='More ways to sign in']")
	private WebElement linkClick ;
	@FindBy(xpath="//div[text()='Enter your password']")
	private WebElement bntPassword;
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement passWord;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement btnNext2;
	@FindBy(xpath="//a[contains(@aria-label,'Google Account:')]")
	private WebElement profileButton;
	public WebElement getAnotherAc() {
		return anotherAc;
	}
	public void setAnotherAc(WebElement anotherAc) {
		this.anotherAc = anotherAc;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getBtnNext() {
		return btnNext;
	}
	public WebElement getLinkClick() {
		return linkClick;
	}
	public WebElement getBntPassword() {
		return bntPassword;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getBtnNext2() {
		return btnNext2;
	}
	public WebElement getProfileButton() {
		return profileButton;
	}
}

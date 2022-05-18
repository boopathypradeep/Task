package org.taskss;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Ebay extends BaseClass{
	public Ebay() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@aria-label=\"Search for anything\"]")
	private WebElement search;
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement btnSearch;
	@FindBy(xpath="//h3[text()='Mitchell TD100 3/4 Size Surf Green Electric Guitar Starter Pack w/ Fender Strap']")
	private WebElement btnClick;
	@FindBy(xpath="//span[text()='US $109.00'][@class=\"notranslate\"]")
	private WebElement price;
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}
	public void setBtnClick(WebElement btnClick) {
		this.btnClick = btnClick;
	}
	public WebElement getPrice() {
		return price;
	}
	public void setPrice(WebElement price) {
		this.price = price;
	}
}

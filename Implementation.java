package org.taskss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Implementation extends BaseClass {
	@BeforeClass
	private void tc01() {
		launchBrowser();
		maximize();
		launchUrl("https://accounts.google.com/b/0/AddMailService");
		implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test
	private void tc02() {
		TaskGmail t=new TaskGmail();
		
		BaseClass b=new BaseClass();
		
		WebElement userName = t.getUserName();
		
		b.enterText(userName, "boopathypradeepr@gmail.com");
		WebElement btnNext = t.getBtnNext();
		b.btnClick(btnNext);
		
		WebElement linkClick = t.getLinkClick();
		b.btnClick(linkClick);
		WebElement passWord = t.getPassWord();
		b.enterText(passWord, "Boopathy@9");
		WebElement btnNext2 = t.getBtnNext2();
		b.btnClick(btnNext2);
		WebElement profileButton = t.getProfileButton();
		
		Assert.assertTrue(enabled(profileButton));
		
	}
	@Test
	private void tc03() {
		launchBrowser();
		maximize();
		launchUrl("https://www.ebay.com/");
		implicitlyWait(10, TimeUnit.SECONDS);
	Ebay e=new Ebay();
WebElement search = e.getSearch();
BaseClass b=new BaseClass();
b.enterText(search, "electric guitar");
	WebElement btnSearch = e.getBtnSearch();
	b.btnClick(btnSearch);
	WebElement btnClick = e.getBtnClick();
	b.btnClick(btnClick);
	switchTOLastWindow();
	WebElement price = e.getPrice();
	String textss = b.getTextss(price);
	b.print(textss);
	
	}
	

}

package com.tfram.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://evernote.com")
public class BasePage extends PageObject {
	
	@FindBy(xpath="//header//h1")
	private WebElement evernoteLogo;
	
	@FindBy(xpath="//div[@id='content']//h1")
	private WebElement staticPageLabelHeader;
	
	public void checkPageTitle(String expectedTitle) {
		assertTrue(getTitle().contains(expectedTitle));
	}
	
	public void clickEvernoteLogo() {
		evernoteLogo.click();
	}
	
	public void clickFooterLink(String linkText) {
		WebElement link = find(By.xpath("//footer//a[text()='"+linkText+"']"));
		link.click();
	}
	
	public void checkLabelHeader(String expectedHeader) {
		String actualLabelText = staticPageLabelHeader.getText();
		assertEquals(expectedHeader, actualLabelText);
	}

}

package com.tfram.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://evernote.com")
public class BasePage extends PageObject {
	
	@FindBy(xpath="//header//h1")
	private WebElement evernoteLogo;
	
	@FindBy(xpath="//div[@id='content']//h1")
	private WebElement staticPageLabelHeader;

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickEvernoteLogo() {
		evernoteLogo.click();
	}
	
	public void clickFooterLink(String linkText) {
		WebElement link = getDriver().findElement(By.xpath("//div[@id='footer']//a[text()='"+linkText+"']"));
		link.click();
	}
	
	public void checkLabelHeader(String expectedHeader) {
		String actualLabelText = staticPageLabelHeader.getText();
		Assert.assertEquals(expectedHeader, actualLabelText);
	}

}

package com.tfram.tests;

import java.util.Arrays;
import java.util.Collection;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.tfram.requirements.StaticPages.Footer.ProductSection;
import com.tfram.steps.GlobalSteps;

@Story(ProductSection.class)
@RunWith(ThucydidesParameterizedRunner.class)
public class FooterProductSectionTest {
	
	private String productName;
	
	@TestData
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][] {
				{"Evernote"},
				{"Skitch"},
				{"Penultimate"}
		});
	}
	
	public FooterProductSectionTest(String productName) {
		this.productName = productName;
	}
	
	@Managed
	public WebDriver webDriver;
	
    @ManagedPages
    public Pages pages;
    
    @Steps
    public GlobalSteps globalSteps;
    
    @Test
    public void checkProductStaticPages() {
    	globalSteps.clickFooterLink(productName);
    	globalSteps.checkLabelHeader(productName);
    	globalSteps.checkPageTitle(productName);
    }

}

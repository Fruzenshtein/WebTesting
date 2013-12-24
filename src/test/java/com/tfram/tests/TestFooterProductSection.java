package com.tfram.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.tfram.requirements.StaticPages.Footer.ProductSection;
import com.tfram.steps.GlobalSteps;

@RunWith(ThucydidesRunner.class)
@Story(ProductSection.class)
public class TestFooterProductSection {
	
	@Managed
	public WebDriver webDriver;
	
    @ManagedPages
    public Pages pages;
    
    @Steps
    public GlobalSteps globalSteps;
    
    @Test
    public void testSiteLogo() {
    	globalSteps.clickFooterLink("Evernote");
    	globalSteps.checkLabelHeader("Evernote");
    	globalSteps.checkPageTitle("Evernote");
    }

}

package com.tfram.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.tfram.pages.BasePage;

public class GlobalSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	private BasePage basePage() {
		return getPages().currentPageAt(BasePage.class);
	}
	
	@Step
	public void checkPageTitle(String expectedTitle) {
		basePage().checkPageTitle(expectedTitle);
	}
	
	@Step
	public void clickOnLogo() {
		basePage().clickEvernoteLogo();
	}
	
	@Step
	public void clickFooterLink(String linkText) {
		basePage().clickFooterLink(linkText);
	}
	
	@Step
	public void checkLabelHeader(String expectedHeader) {
		basePage().checkLabelHeader(expectedHeader);
	}

}

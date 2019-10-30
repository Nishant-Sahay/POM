package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Chemtrails extends TestBase {

	@FindBy(name="q")
	WebElement searchBar;
	
	@FindBy(xpath="//ul[@role='listbox']//li[1]/descendant::div[@class='sbl1']")
	WebElement textToBeFound;
	
	// Initializing the Page Objects
	public Chemtrails() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions:
	
	public String getText() {
		return driver.getTitle();
	}
	
	
}

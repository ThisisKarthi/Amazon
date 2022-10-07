package com.POM.Amazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom_Amazon {
	public static WebDriver driver;

	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	private WebElement dropdown;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchingProduct;

	@FindBy(xpath = "\"//span[contains(text(),'MORE RESULTS')]/ancestor::div[4]/preceding-sibling::div[@data-component-type='s-search-result']")
	private WebElement results;

	@FindBy(xpath = "//div[@role='button']")
	private List<WebElement> toylist;

	@FindBy(xpath = "//div[@class='autocomplete-results-container']/child::div[\" + i + \"]")
	private WebElement select;

	


	public Pom_Amazon(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getSearchingProduct() {
		return searchingProduct;
	}

	public WebElement getResults() {
		return results;
	}

	public List<WebElement> getToylist() {
		return toylist;
	}

	

	public WebElement getSelect() {
		return select;
	}

	
}

package com.POM.Amazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2_Amazon {

	public static WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'MORE RESULTS')]/ancestor::div[4]/preceding-sibling::div[@data-component-type='s-search-result']")
	private List<WebElement> results1;

	@FindBy(xpath = "//span[contains(text(),'MORE RESULTS')]/ancestor::div[4]/following-sibling::div[@data-component-type='s-search-result']")
	private List<WebElement> moreResults;

	public Pom2_Amazon(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getMoreResults() {
		return moreResults;
	}

	public List<WebElement> getResults1() {
		return results1;
	}
}

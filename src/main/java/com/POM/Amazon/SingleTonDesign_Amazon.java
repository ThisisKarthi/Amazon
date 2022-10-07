package com.POM.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesign_Amazon {
	public WebDriver driver;

	public SingleTonDesign_Amazon(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Pom_Amazon getPom_Amazon() {
		Pom_Amazon pA = new Pom_Amazon(driver);
		return pA;

	}

	public Pom2_Amazon getPom2_Amazon() {
		Pom2_Amazon pA2 = new Pom2_Amazon(driver);
		return pA2;
	}
}

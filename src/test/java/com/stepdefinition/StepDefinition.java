package com.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Advance.Read_Amazon_Xlsx;
import com.Base.Amazon.Base_Class_Amazon;
import com.POM.Amazon.Pom2_Amazon;
import com.POM.Amazon.Pom_Amazon;
import com.POM.Amazon.SingleTonDesign_Amazon;
import com.Property.Amazon.ConfigurationHelper_Amazon;
import com.runner.RunnerClass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class_Amazon {
	public static WebDriver driver = RunnerClass.driver;

	SingleTonDesign_Amazon sdp = new SingleTonDesign_Amazon(driver);

	@Given("^user To Launch The Application Url$")
	public void user_To_Launch_The_Application_Url() throws Throwable {

		String geturl = ConfigurationHelper_Amazon.getInstance().geturl();
		getUrl(geturl);
		implicitWait();

	}

	@When("user Can Select From The DropDown Categories")
	public void user_can_select_from_the_drop_down_categories() throws IOException {

		userInput(sdp.getPom_Amazon().getDropdown(), Read_Amazon_Xlsx.particularData("AmazonInput", 1, 0));

	}

	@When("user Can Enter The Products")
	public void user_can_enter_the_products() throws InterruptedException, IOException {

		userInput(sdp.getPom_Amazon().getSearchingProduct(), Read_Amazon_Xlsx.particularData("AmazonInput", 1, 1));
		sleep(3000);

	}

	@Then("compare The DropDown Suggestion Select")
	public void compare_the_drop_down_suggestion_select() throws InterruptedException {

		int s = sdp.getPom_Amazon().getToylist().size();
		System.out.println(s);

		for (int i = 1; i <= s; i++) {

			WebElement select = sdp.getPom_Amazon().getSelect();
			String searchText = "soft toys";
			Thread.sleep(5000);
			if (select.getText().equalsIgnoreCase(searchText)) {

				select.click();
				break;

			} else {
				continue;
			}
		}
	}

	@When("^counting The Results\\.$")
	public void counting_The_Results() throws Throwable {

		List<WebElement> results1 = sdp.getPom2_Amazon().getResults1();
		System.out.println("Number Of Results In :" + results1.size());
	}

	@Then("^count The Number Of More Results\\.$")
	public void count_The_Number_Of_More_Results() throws Throwable {

		List<WebElement> moreResults = sdp.getPom2_Amazon().getMoreResults();
		System.out.println("Number of More Results In: " + moreResults.size());
	}

}

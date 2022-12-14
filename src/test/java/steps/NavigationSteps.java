package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utils.WaitUtils;

import static steps.Hooks.*;

public class NavigationSteps {
    HomePage homePage = new HomePage();

    @When("user expand burger menu")
    public void user_expand_burger_menu() {
        WaitUtils.waitUntilElementIsDisplayedAndInDOM(homePage.hamburgerButton, 2);
        driver.findElement(homePage.hamburgerButton).click();
    }

    @When("user select {string} page")
    public void user_select_page(String linkName) {
        driver.findElement(By.partialLinkText(linkName)).click();
    }

    @When("user change country to {string}")
    public void user_change_country_to(String countryName) {
        WebElement dropdownList = driver.findElement(homePage.dropdownField);
        dropdownList.click();
        Select select = new Select(dropdownList);
        select.selectByVisibleText(countryName);
        driver.findElement(homePage.popUpYesBtn).click();
    }

    @Then("Assert that correct country page was loaded")
    public void assert_that_correct_country_page_was_loaded() {
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals("Chosen country page wasn't loaded", homePage.expectedURL, currentURL);
    }
}

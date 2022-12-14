package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

import static steps.Hooks.*;

public class SearchSteps {

    @When("user click menu button {string}")
    public void user_click_menu_button(String menuSelection) {
        WebElement navigationMenu = driver.findElement(By.className("wu-nav"));
        navigationMenu.findElement(By.partialLinkText(menuSelection)).click();
    }

    @When("into a ZIP input enter zip code {string} and hit enter button")
    public void into_a_zip_input_enter_zip_code_and_hit_enter_button(String zipCode) {
        driver.switchTo().frame(driver.findElement(By.xpath(".//*[@class='findlocationsiframe section']//iframe")));
        WebElement zipInputField = driver.findElement(By.cssSelector("input[data-provide='rac']"));
        zipInputField.sendKeys(zipCode);
        zipInputField.sendKeys(Keys.ENTER);
    }

    @Then("sort all locations by nearest")
    public void sort_all_locations_by_nearest() throws InterruptedException {
        driver.findElement(By.cssSelector(".wu_Filters2_Outside___1SEVW .MuiButton-label")).click();
        List<WebElement> addressResults = driver.
                findElements(By.xpath(".//*[@class='wu_Results_ResultItem___2NPxO wu_Results_ResultList_Item___3BtuG']"));

    }

    @Then("get address details of the first one in console")
    public void get_address_details_of_the_first_one_in_console() {

    }

}

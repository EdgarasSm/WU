package pages;

import org.openqa.selenium.By;

public class LocationSearchPage {

    public By navigationItem = By.className("wu-nav");
    public By iframe = By.xpath(".//*[@class='findlocationsiframe section']//iframe");
    public By zipInput = By.cssSelector("input[data-provide='rac']");


}

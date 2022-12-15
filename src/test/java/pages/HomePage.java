package pages;

import org.openqa.selenium.By;

public class HomePage {

    public By hamburgerButton = By.className("hamburger-button");
    public By dropdownField = By.id("Question");
    public By popUpYesBtn = By.cssSelector("[tabindex='24']");
    public String expectedURL = "https://www.westernunion.com/us/en/home.html";
    public By acceptAllCookiesBtn = By.id("onetrust-accept-btn-handler");


}

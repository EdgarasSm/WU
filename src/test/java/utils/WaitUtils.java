package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static steps.Hooks.*;

public class WaitUtils {
    /**
     * Wait for element to be visible
     *
     * @param locator By locator
     */
    public static void waitUntilElementToBeVisible(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Wait until element to be located
     *
     * @param locator By locator
     * @param timeout integer timeout
     */
    public static void waitForElementToBeLocated(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * Waits until element will be in DOM
     *
     * @param locator By locator
     * @param timeout integer timeout
     */
    public static void waitUntilElementIsDisplayedAndInDOM(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Waits until element will be clickable
     *
     * @param locator By locator
     * @param timeout integer timeout
     */
    public static void waitUntilELementWillBeClickable(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
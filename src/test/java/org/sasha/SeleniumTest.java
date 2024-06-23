package org.sasha;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class has test cases for Selenium testing.
 */
public class SeleniumTest {
    private WebDriver driver;

    /**
     * Method to initialize the WebDriver before every test
     */
    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:/Users/olexa/Downloads/edgedriver_win641/msedgedriver.exe");
        driver = new EdgeDriver();
    }

    /**
     * Test to verify a specific element is on a web page
     */
    @Test
    public void testElementExistence() {
        driver.get("https://www.wikipedia.org");

        WebElement element = driver.findElement(By.id("searchInput"));
        assertNotNull(element, "Search widget was not found on site.");
    }

    /**
     * Test to check for the text content of a div element
     */
    @Test
    public void testElementText() {
        driver.get("https://www.github.com");
        WebElement element = driver.findElement(By.tagName("div"));
        String divText = element.getText();
        assertNotNull(element, "Div element was not found");
        assertFalse(divText.isEmpty(), "Div is empty");

        System.out.println("Text in the div: " + divText);
    }

    /**
     * Test to check for the page title
     */
    @Test
    public void testPageTitle() {
        driver.get("https://www.nasa.gov/");
        String title = driver.getTitle();
        assertEquals("NASA", title, "Title is different");
    }

    /**
     * Method to close the WebDriver after every test
     */
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

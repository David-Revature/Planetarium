package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {
    private WebDriver driver;
    @FindBy(id = "greeting")
    private WebElement greetingHeader;
    @FindBy(id = "locationSelect")
    private WebElement celestialBody;
    @FindBy(id = "deleteInput")
    private WebElement delete;
    @FindBy(id = "planetNameInput")
    private WebElement planet;
    @FindBy(id = "moonNameInput")
    private WebElement moon;
    @FindBy(id = "orbitedPlanetInput")
    private WebElement orbit;
    @FindBy(xpath = "//*[@class='submit-button']")
    private WebElement submitButton;
    @FindBy(id = "deleteButton")
    private WebElement deleteButton;
    @FindBy(tagName = "tr")
    private List<WebElement> tableRows;
    @FindBy(id = "logoutButton")
    private WebElement logoutButton;
    //@FindBy(xpath = "//")

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getHomePageGreeting() {
    return greetingHeader.getText();
    }
    public int getNumberOfCelestialRows() {
        return tableRows.size() - 1;
    }
    public void tryToAccessHomePageDirectly() {
        driver.get("http://localhost:8080/planetarium");
    }
    public void logout() {
        logoutButton.click();
    };

    public void enterPlanetName(String name) {
        Select select = new Select(celestialBody);
        select.selectByIndex(1);
        planet.sendKeys(name);
    }
    public void enterMoonName(String name) {
        Select select = new Select(celestialBody);
        select.selectByIndex(0);
        moon.sendKeys(name);
    }
    public void enterOrbit(String id) {
        orbit.sendKeys(id);
    }
    public void enterDeletePlanetName(String name) {
        Select select = new Select(celestialBody);
        select.selectByIndex(1);
        delete.sendKeys(name);
    }
    public void enterDeleteMoonName(String name) {
        Select select = new Select(celestialBody);
        select.selectByIndex(0);
        delete.sendKeys(name);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
    public void clickDeleteButton() {
        deleteButton.click();
    }

}
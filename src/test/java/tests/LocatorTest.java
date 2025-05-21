package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorTest extends BaseTest {

    @Test
    public void test() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name"));
        driver.findElement(By.name("user-name"));
        driver.findElement(By.className("error-message-container"));
        driver.findElement(By.tagName("div"));
        driver.findElement(By.linkText("Swag Labs"));
    }

    @Test
    public void mainPageTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//span[text()='Products']"));
        driver.findElement(By.xpath("//div[contains(@class,'app_logo')]"));
        driver.findElement(By.xpath("//div[@id='menu_button_container']"));
        driver.findElement(By.xpath("//a//div[contains(text(),'Backpack')]"));
        driver.findElement(By.xpath("//button[@type='button']" +
                "//ancestor::div[@id='menu_button_container']"));
        driver.findElement(By.xpath("//div[@id='header_container']" +
                "/descendant::div[@id='menu_button_container']"));
        driver.findElement(By.xpath("//div[@id='header_container']" +
                "/following::div[@class='inventory_item_price']"));
        driver.findElement(By.xpath("//button[@type='button']/parent::*"));
        driver.findElement(By.xpath("//div[@class='inventory_item_img']" +
                "/preceding::div[@class='inventory_item_price']"));
        driver.findElement(By.cssSelector(".inventory_item_name"));
        driver.findElement(By.cssSelector("#react-burger-menu-btn"));
        driver.findElement(By.cssSelector(".pricebar .inventory_item_price"));
        driver.findElement(By.cssSelector(".inventory_item_img ~ .inventory_item_description"));
        driver.findElement(By.cssSelector("[data-test|='inventory']"));
        driver.findElement(By.cssSelector("[data-test^='inv']"));
        driver.findElement(By.cssSelector("[data-test$='price']"));
        driver.findElement(By.cssSelector("[src*='backpack']"));
    }
}

